package cn.no7player.controller;


import cn.no7player.mapper.*;
import cn.no7player.model.*;
import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2016/12/6 0006.
 */

@Controller
public class AdminController {

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private FinancialuserMapper financialuserMapper;

    @Autowired
    private StatusMapper statusMapper;

    @Autowired
    private AssignMapper assignMapper;

    @RequestMapping(value = "/adminLogin", method = RequestMethod.POST)
    @ResponseBody
    public String adminLogin(@RequestParam(value = "adminName") String adminName, @RequestParam(value = "adminPwd") String adminPwd, HttpSession httpSession) {
        System.out.println(adminName);
        httpSession.setAttribute("adminName", adminName);
        Admin admin = adminMapper.selectByAdminName(adminName);
        if (admin != null) {
            if (adminPwd.equals(admin.getAdminPwd())) {
                return "";
            } else {
                return "密码错误";
            }
        } else {
            return "该用户名不存在";
        }
    }

    private Logger logger = Logger.getLogger(UserController.class);


    @Autowired
    private CasesMapper casesMapper;

    @RequestMapping(value = "/suitProgress", method = RequestMethod.GET)
    @ResponseBody
    public String suitInfo() {
        List<Cases> Allcase = casesMapper.selectAll();
        JSONArray Allsuitinfo = new JSONArray();
        for (int j = 0; j < Allcase.size(); j++) {
            Cases suitProgress = Allcase.get(j);
            JSONObject suitinfo = new JSONObject();
            int statustype = statusMapper.selectCaseStatus(suitProgress.getCaseId());
            String casestatus = new HuJinController().caseStatus(statustype);
            Status selectType6 = statusMapper .selectType6(suitProgress.getCaseId());
            String LawyerTime = "";
            if (selectType6!= null){
                LawyerTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(selectType6.getStatusTime());
            }
            Status selectType14 = statusMapper .selectType14(suitProgress.getCaseId());
            String OverTime = "";
            if (selectType14!= null){
                OverTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(selectType14.getStatusTime());
            }
            String deputeTime = "";
            if (suitProgress.getDeputeTime()!= null){
                deputeTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(suitProgress.getDeputeTime());
            }
            // case_status, ,,,,,,lawyer_id,case_result
            Lawyer trustlawyer = lawyerMapper.selectByPrimaryKey(suitProgress.getLawyerId());
            suitinfo.put("serviceType",suitProgress.getServiceType());
            suitinfo.put("lawyerName",trustlawyer==null?"暂无":trustlawyer.getLawyerName());
            suitinfo.put("score",suitProgress.getScore());
            suitinfo.put("caseId",suitProgress.getCaseId());
            suitinfo.put("contractNum",suitProgress.getContractNum());
            suitinfo.put("debtPlat",suitProgress.getDebtPlat());
            suitinfo.put("productName",suitProgress.getProductName());
            suitinfo.put("inverProj", suitProgress.getInverProj());
            if(suitProgress.getOverduePenalty()==null||suitProgress.getOverduePrincipal()==null||suitProgress.getAgreedInterest()==null){
                suitinfo.put("overdueAmount","null");
            }else {
                suitinfo.put("overdueAmount", suitProgress.getOverduePenalty() + suitProgress.getOverduePrincipal() + suitProgress.getAgreedInterest());
            }
            suitinfo.put("deputeTime",deputeTime);
            suitinfo.put("status", casestatus);
            suitinfo.put("lawyerTime",LawyerTime);
            suitinfo.put("overTime",OverTime);
            suitinfo.put("lawyerFee","100.00");
            Allsuitinfo.add(suitinfo);
        }
        System.out.println(Allsuitinfo.toString());

        return Allsuitinfo.toString();
    }

    @RequestMapping(value = "/userManage", method = RequestMethod.GET)
    @ResponseBody
    public String usersInfo() {
        List<Financialuser> AllFinancialuser = financialuserMapper.selectAll();
        JSONArray AllUserinfo = new JSONArray();
        for (int j = 0; j < AllFinancialuser.size(); j++) {
            Financialuser financialuser = AllFinancialuser.get(j);
            JSONObject userinfo = new JSONObject();
            List<Cases> cases = casesMapper.selectByFiUserId(financialuser.getFiuserId());
            String RegisterTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(financialuser.getRegisterTime());
            String SubmitinfoTime = "";
            if (financialuser.getSubmitinfoTime() != null) {
                SubmitinfoTime = (new SimpleDateFormat("yyyy-MM-dd")).format(financialuser.getSubmitinfoTime());
            }
            String totalcase = String.valueOf(cases.size());
            String CheckResult = "";
            userinfo.put("totalcase", totalcase);
            userinfo.put("userid", String.valueOf(financialuser.getFiuserId()));
            userinfo.put("Email", financialuser.getFiuserEmail());
            userinfo.put("RegisterTime", RegisterTime);
            userinfo.put("SubmitinfoTime", SubmitinfoTime);
            if (financialuser.getCheckResult() == 1) {
                CheckResult = "已通过";
                String CheckTime = (new SimpleDateFormat("yyyy-MM-dd")).format(financialuser.getCheckTime());
                userinfo.put("CheckTime", CheckTime);
            } else if (financialuser.getCheckResult() == 0) {
                CheckResult = "未通过";
                String CheckTime = (new SimpleDateFormat("yyyy-MM-dd")).format(financialuser.getCheckTime());
                userinfo.put("CheckTime", CheckTime);
            } else {
                CheckResult = "未审核";
                userinfo.put("CheckTime", "");
            }
            userinfo.put("CheckResult", CheckResult);
            userinfo.put("Operator", financialuser.getOperator());
            AllUserinfo.add(userinfo);
        }
        return AllUserinfo.toString();
    }

    @Autowired
    private LawyerMapper lawyerMapper;

    @RequestMapping(value = "/lawyerManage", method = RequestMethod.GET)
    @ResponseBody
    public String lawyerInfo() {
        List<Lawyer> Alllawyer = lawyerMapper.selectAll();
        JSONArray Alllawyerinfo = new JSONArray();
        for (int j = 0; j < Alllawyer.size(); j++) {
            Lawyer lawyer = Alllawyer.get(j);
            JSONObject lawyerinfo = new JSONObject();
            List<Cases> cases = casesMapper.selectByLawyerId(lawyer.getLawyerId());
            String RegisterTime = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(lawyer.getRegisterTime());
            String SubmitinfoTime = "";
            if (lawyer.getSubmitinfoTime() != null) {
                SubmitinfoTime = (new SimpleDateFormat("yyyy-MM-dd")).format(lawyer.getSubmitinfoTime());
            }
            String totalcase = String.valueOf(cases.size());
            String CheckResult = "";
            lawyerinfo.put("totalcase", totalcase);
            lawyerinfo.put("lawyerid", String.valueOf(lawyer.getLawyerId()));
            lawyerinfo.put("Telphone", lawyer.getLawyerTelp());
            lawyerinfo.put("RegisterTime", RegisterTime);
            lawyerinfo.put("SubmitinfoTime", SubmitinfoTime);
            if (lawyer.getCheckResult() == 1) {
                CheckResult = "已通过";
                String CheckTime = (new SimpleDateFormat("yyyy-MM-dd")).format(lawyer.getCheckTime());
                lawyerinfo.put("CheckTime", CheckTime);
            } else if (lawyer.getCheckResult() == 0) {
                CheckResult = "未通过";
                String CheckTime = (new SimpleDateFormat("yyyy-MM-dd")).format(lawyer.getCheckTime());
                lawyerinfo.put("CheckTime", CheckTime);
            } else {
                CheckResult = "未审核";
                lawyerinfo.put("CheckTime", "");
            }
            lawyerinfo.put("CheckResult", CheckResult);
            lawyerinfo.put("Operator", lawyer.getOperator());
            Alllawyerinfo.add(lawyerinfo);
        }
        return Alllawyerinfo.toString();
    }

    @RequestMapping(value = "/getAdminName", method = RequestMethod.GET)
    @ResponseBody
    public String getAdminName(HttpServletRequest request, HttpServletResponse response) {
        return (String) request.getSession().getAttribute("adminName");
    }

    @RequestMapping(value = "/showFiuserDetail", method = RequestMethod.POST)
    @ResponseBody
    public String showFiuserDetail(@RequestParam(value = "fiusername") String fiusername) {
        Financialuser newuser = financialuserMapper.selectByEmail(fiusername);
        String userMessage = newuser.getCorpName() + '|' + newuser.getLegalpersonName() + '|' + newuser.getLegalpersonIdcard()+"|"+newuser.getIdcardImage()+"|"+newuser.getBusilicenImage();
        return userMessage;
    }

    @RequestMapping(value = "/submitFiuserCheck", method = RequestMethod.POST)
    @ResponseBody
    public String submitFiuserCheck(HttpServletRequest request, @RequestParam(value = "fiusername") String fiusername, @RequestParam(value = "checkresult") String checkresult) {
        Financialuser newuser = new Financialuser();
        newuser.setFiuserEmail(fiusername);
        int check = Integer.parseInt(checkresult);
        newuser.setCheckResult(check);
        java.util.Date date = new java.util.Date();
        java.sql.Date datasql2 = new java.sql.Date(date.getTime());
        newuser.setCheckTime(datasql2);
        newuser.setOperator((String) request.getSession().getAttribute("adminName"));
        int i = financialuserMapper.updateByEmailKeySelective(newuser);
        System.out.println("审核成功");
        return newuser.toString();
    }

    @RequestMapping(value = "/showLawyerDetail", method = RequestMethod.POST)
    @ResponseBody
    public String showLawyerDetail(@RequestParam(value = "lawyertelp") String lawyertelp) {
        Lawyer lawyer = lawyerMapper.selectByTelp(lawyertelp);
        String lawyerMessage = lawyer.getLawyerName() + '|' + lawyer.getIdcardNumber()+"|"+lawyer.getIdcardImage()+"|"+lawyer.getLawyerLicense();
        return lawyerMessage;
    }

    @RequestMapping(value = "/submitLawyerCheck", method = RequestMethod.POST)
    @ResponseBody
    public String submitLawyerCheck(HttpServletRequest request, @RequestParam(value = "lawyertelp") String lawyertelp, @RequestParam(value = "checkresult") String checkresult) {
        Lawyer lawyer = new Lawyer();
        lawyer.setLawyerTelp(lawyertelp);
        lawyer.setCheckResult(Integer.parseInt(checkresult));
        java.util.Date date = new java.util.Date();
        java.sql.Date datasql2 = new java.sql.Date(date.getTime());
        lawyer.setCheckTime(datasql2);
        lawyer.setOperator((String) request.getSession().getAttribute("adminName"));
        int i = lawyerMapper.updateByTelpSelective(lawyer);
        System.out.println("审核成功");
        return lawyer.toString();
    }

    @RequestMapping(value = "/showCaseDetail", method = RequestMethod.POST)
    @ResponseBody
    public String showCaseDetail(@RequestParam(value = "caseid") String caseid) {
        Cases cases = casesMapper.selectByPrimaryKey(Integer.parseInt(caseid));
        JSONObject casejson = new JSONObject();
        String casej = casejson.toJSONString(cases);
        int casestatus = statusMapper.selectCaseStatus(Integer.parseInt(caseid));
        System.out.println(casestatus);
        return casej;
    }

    @RequestMapping(value = "/submitCaseCheck", method = RequestMethod.POST)
    @ResponseBody
    public String submitCaseCheck(HttpServletRequest request, @RequestParam(value = "caseid") String caseid, @RequestParam(value = "checkresult") String checkresult) {
        Status casestatus = new Status();
        casestatus.setCaseId(Integer.parseInt(caseid));
        casestatus.setStatusType(Integer.parseInt(checkresult));
        java.util.Date date = new java.util.Date();
        java.sql.Date datasql2 = new java.sql.Date(date.getTime());
        casestatus.setStatusTime(datasql2);
        statusMapper.insertSelective(casestatus);
        Cases cases = new Cases();
        cases.setCaseId(Integer.parseInt(caseid));
        cases.setOperator((String) request.getSession().getAttribute("adminName"));
        casesMapper.updateByPrimaryKeySelective(cases);
        return casestatus.toString();
    }

    @RequestMapping(value = "/getAllLawyerName", method = RequestMethod.GET)
    @ResponseBody
    public String getAllLawyerName() {
        List<Lawyer> Alllawyer = lawyerMapper.selectAll();
        String lawyerlist = "";
        for (int j = 0; j < Alllawyer.size(); j++) {
            Lawyer lawyer = Alllawyer.get(j);
            if (!lawyer.getLawyerName().equals("暂无"))
                lawyerlist += lawyer.getLawyerId() + ":" + lawyer.getLawyerName() + "、";
        }
        return lawyerlist;
    }

    @RequestMapping(value = "/assignLawyer", method = RequestMethod.POST)
    @ResponseBody
    public int assignLawyer(@RequestParam(value = "caseid") String caseid, @RequestParam(value = "lawyers") String lawyers) {
        int case_id=Integer.parseInt(caseid);
        String[] fivelawyers = new String[5];
        fivelawyers = lawyers.split(",");
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar c = Calendar.getInstance();
        int a = (fivelawyers.length < 5) ? fivelawyers.length : 5;
        int result = 0;
        List<Assign> assignList=assignMapper.selectByCaseId(case_id);
        if (assignList.size()>0) {
            assignMapper.deleteByCaseId(case_id);
            int statusid4=statusMapper.selectType4(case_id);
            if(statusid4!=0)
                statusMapper.deleteByPrimaryKey(statusid4);
            int statusid5=statusMapper.selectType5(case_id);
            if(statusid5!=0)
                statusMapper.deleteByPrimaryKey(statusid5);
        }
        for (int i = 0; i < a; i++) {
            Assign assign = new Assign();
            assign.setLawyerId(Integer.parseInt(fivelawyers[i]));
            assign.setCaseId(Integer.parseInt(caseid));
            assign.setDeputeTime(c.getTime());
            c.add(Calendar.DAY_OF_MONTH, 2);
            assign.setIsAccept(false);
            result = assignMapper.insertSelective(assign);
        }
        Status status=new Status();
        status.setStatusType(4);
        status.setCaseId(case_id);
        status.setStatusTime(c.getTime());
        statusMapper.insertSelective(status);
        return result;
    }



    @RequestMapping(value = "/adminoldpwd", method = RequestMethod.POST)
    @ResponseBody
    public String adminoldpwd(@RequestParam(value = "oldpwd") String oldpwd,HttpServletRequest request, HttpServletResponse response) {
        Admin newadmin = new Admin();
        String s =(String) request.getSession().getAttribute("adminName");
        newadmin= adminMapper.selectByAdminName(s);
        String pwd=newadmin.getAdminPwd();
        if (!pwd.equals(oldpwd)) {
            return "olderror";
        }
        else{
            return "oldright";
        }
    }


    @RequestMapping(value = "/changeadminpwd", method = RequestMethod.POST)
    @ResponseBody
    public String changeadminpwd(@RequestParam(value = "newpwd") String newpwd,HttpServletRequest request, HttpServletResponse response) {
        Admin newadmin = new Admin();
        String s =(String) request.getSession().getAttribute("adminName");
        newadmin= adminMapper.selectByAdminName(s);
        newadmin.setAdminPwd(newpwd);
        adminMapper.update(newadmin);
        System.out.println("新密码");
        return "success";
    }

    @RequestMapping(value = "/caseAbstract", method = RequestMethod.GET)
    @ResponseBody
    public String caseInfo() {

        List<Cases> Allcase = casesMapper.selectAll();
        JSONArray Allcaseinfo = new JSONArray();
        for (int j = 0; j < Allcase.size(); j++) {
            Cases caseAbstract = Allcase.get(j);
            JSONObject caseinfo = new JSONObject();
            int statustype = statusMapper.selectCaseStatus(caseAbstract.getCaseId());
            String casestatus = new HuJinController().caseStatus(statustype);
            // case_status, ,,,,,,lawyer_id,case_result
            Lawyer trustlawyer = lawyerMapper.selectByPrimaryKey(caseAbstract.getLawyerId());
            caseinfo.put("caseId", caseAbstract.getCaseId());
            caseinfo.put("contractNum", caseAbstract.getContractNum());
            caseinfo.put("debtPlat", caseAbstract.getDebtPlat());
            caseinfo.put("productName", caseAbstract.getProductName());
            caseinfo.put("inverProj", caseAbstract.getInverProj());
            caseinfo.put("statusTime", caseAbstract.getDeputeTime());
            caseinfo.put("debtName", caseAbstract.getDebtName());
            caseinfo.put("debtIdcard", caseAbstract.getDebtIdcard());
            caseinfo.put("serviceType", caseAbstract.getServiceType());
            if (caseAbstract.getLawyerId() != null)
                caseinfo.put("trustLawyer", trustlawyer.getLawyerName());
            else
                caseinfo.put("trustLawyer", "暂无");
            caseinfo.put("status", casestatus);
            caseinfo.put("operator", caseAbstract.getOperator());
            //caseinfo.put("totalcase",totalcase);
            Allcaseinfo.add(caseinfo);
        }
        return Allcaseinfo.toString();
    }



}
