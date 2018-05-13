package cn.no7player.controller;

import cn.no7player.mapper.*;
import cn.no7player.model.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2016/12/6 0006.
 */

@Controller
public class lawyerController {

    @Autowired
    private LawyerMapper lawyerMapper;

    @Autowired
    private CasesMapper casesMapper;
    @Autowired
    private WorkscopeMapper workscopeMapper;
    @RequestMapping(value = "/lawyerPersonalInfo", method = RequestMethod.GET)
    @ResponseBody
    public String lawyerPersonalInfo(HttpServletRequest request, HttpServletResponse response) {
        String telp=(String) request.getSession().getAttribute("username");
        Lawyer lawyer = lawyerMapper.selectByTelp(telp);
        JSONObject lawyerPerInfo  = new JSONObject();
        JSONArray lawyerWorkPlace = new JSONArray();
        lawyerPerInfo.put("office",lawyer.getOffice());
        lawyerPerInfo.put("workExp",lawyer.getWorkExp());
        lawyerPerInfo.put("specializedAreas",lawyer.getSpecializedAreas());
        lawyerPerInfo.put("joinCase",lawyer.getJoinCase());
        List<Workscope> workscopes = workscopeMapper.selectByLawyerId(lawyer.getLawyerId());
        for (int i = 0 ;i<workscopes.size();i++){
            lawyerWorkPlace.add(workscopes.get(i));
        }
        lawyerPerInfo.put("workPlace",lawyerWorkPlace);
        lawyerPerInfo.put("telp",telp);
        return lawyerPerInfo.toString();

    }

    @RequestMapping(value = "/lawyerPersonalInfoChange", method = RequestMethod.POST)
    @ResponseBody
    public String lawyerPersonalInfoChange(@RequestParam(value = "LawyerTelp") String LawyerTelp,@RequestParam(value = "office") String office,@RequestParam(value = "workExp") String workExp,@RequestParam(value = "joinCase") String joinCase,@RequestParam(value = "specializedAreas") String specializedAreas,@RequestParam(value = "workScope") String workScope) {
        Lawyer lawyer = lawyerMapper.selectByTelp(LawyerTelp);
        lawyer.setOffice(office);
        lawyer.setSpecializedAreas(specializedAreas);
        lawyer.setJoinCase(joinCase);
        lawyer.setWorkExp(workExp);
        System.out.println(workScope);
        int i = lawyerMapper.updateByTelpSelective(lawyer);
        workscopeMapper.deleteByLawyerId(lawyer.getLawyerId());
        System.out.println("保存成功"+i);
        String[]  location = workScope.split(",");

        for (int j = 0;j<location.length;j=j+3){
            if (j+2<location.length) {
                Workscope workscope = new Workscope();
                String shen = location[j];
                String shi = location[j +1 ];
                String xian = location[j + 2];
                System.out.println((shen+"_"+shi+"_"+xian));
                workscope.setLawyerId(lawyer.getLawyerId());
                workscope.setWorkscopeAdd((shen+"_"+shi+"_"+xian));
                workscopeMapper.insert(workscope);
            }
        }
        return "success";
    }




    @Autowired
    private FinancialuserMapper financialuserMapper;

    @RequestMapping(value = "/lawyerPersonalCenter", method = RequestMethod.GET)
    @ResponseBody
    public String lawyerPersonalCenter(HttpServletRequest request, HttpServletResponse response) {
        String s = (String) request.getSession().getAttribute("username");
        String resultMsg = s;
        Lawyer lawyer = lawyerMapper.selectByTelp(s);
        List<Cases> cases = casesMapper.selectByLawyerId(lawyer.getLawyerId());
        double remark = 0.0, count = 0.0,averageScore=0.0;
        for (int i = 0; i < cases.size(); i++) {
            if (cases.get(i).getScore() != 0) {
                remark += cases.get(i).getScore();
                count++;
            }
        }
        if(count==0)
            averageScore=0.0;
        else
            averageScore = remark / count;
        resultMsg += "|" + averageScore +"分"+ "|" + cases.size() + "件";
        int successCaseCount = 0;
        for (int i = 0; i < cases.size(); i++) {
            if (cases.get(i).getCaseResult().equals("成功") && cases.get(i).getServiceType().equals("诉讼")) {
                successCaseCount++;
            }
            if (cases.get(i).getCaseResult().equals("成功") && cases.get(i).getServiceType().equals("律师函")) {
                successCaseCount++;
            }
        }
        resultMsg += "|" + successCaseCount + "件";
        return resultMsg;
    }

    @RequestMapping(value = "/getBasicInfo", method = RequestMethod.GET)
    @ResponseBody
    public String getBasicInfo(HttpServletRequest request, HttpServletResponse response) {
        String s = (String) request.getSession().getAttribute("username");
        String resultMsg = s;
        Lawyer lawyer = lawyerMapper.selectByTelp(s);
        resultMsg += "|" + lawyer.getLawyerName() + "|" + lawyer.getIdcardNumber()+"|"+lawyer.getIdcardImage()+"|"+lawyer.getLawyerLicense();
        if (lawyer.getCheckResult().equals(0)) {
            resultMsg += "|未通过";
        } else if (lawyer.getCheckResult().equals(1)) {
            resultMsg += "|已通过";
        } else {
            resultMsg += "|待审核";
        }
        return resultMsg;
    }

    @RequestMapping(value = "/changeLawyerInfo", method = RequestMethod.POST)
    @ResponseBody
    public String changeLawyerInfo(@RequestParam(value = "lawyertelp") String lawyertelp, @RequestParam(value = "real_name") String real_name, @RequestParam(value = "id_number") String id_number,@RequestParam(value = "IDcardpath") String IDcardpath,@RequestParam(value = "busLicenpath") String busLicenpath) {
        Lawyer lawyer = new Lawyer();
        lawyer.setLawyerTelp(lawyertelp);
        lawyer.setLawyerName(real_name);
        lawyer.setIdcardNumber(id_number);
        lawyer.setCheckResult(2);
        if (IDcardpath!=null&&!IDcardpath.equals("")){
            lawyer.setIdcardImage(IDcardpath);
        }
        if (busLicenpath!=null&&!busLicenpath.equals("")){
            lawyer.setLawyerLicense(busLicenpath);
            busLicenpath.length();
        }
        java.util.Date date = new java.util.Date();
        java.sql.Date datasql2 = new java.sql.Date(date.getTime());
        lawyer.setSubmitinfoTime(datasql2);
        lawyerMapper.updateByTelpSelective(lawyer);
        return lawyer.toString();
    }

    @Autowired
    private AssignMapper assignMapper;
    @Autowired
    private StatusMapper statusMapper;
    @RequestMapping(value = "/lawyerSuitInfo",method = RequestMethod.GET)
    @ResponseBody
    public String lawyerSuitInfo(HttpServletRequest request, HttpServletResponse response){
        String telp=(String) request.getSession().getAttribute("username");
        Lawyer lawyer = lawyerMapper.selectByTelp(telp);
        List<Assign> AllLawyerAssign= assignMapper.selectByLawyerId(lawyer.getLawyerId());
        JSONArray AllLawyerCaseinfo = new JSONArray();
        for (int i=0;i<AllLawyerAssign.size();i++){
            Assign LawyerAssign = AllLawyerAssign.get(i);
            Date nowtime = new Date();
            long interval = (nowtime.getTime()-LawyerAssign.getDeputeTime().getTime())/1000;
            if ((0<interval&&interval<172800)&&(!LawyerAssign.getIsAccept())){
                Cases caseLawyer = casesMapper.selectByPrimaryKey(AllLawyerAssign.get(i).getCaseId());
                JSONObject caseinfo = new JSONObject();
                int statustype=statusMapper.selectCaseStatus(caseLawyer.getCaseId());
                String casestatus=new HuJinController().caseStatus(statustype);
                caseinfo.put("caseLawyerName",telp);
                caseinfo.put("casestatus",casestatus);
                caseinfo.put("serviceType",caseLawyer.getServiceType());
                caseinfo.put("caseId", caseLawyer.getCaseId());
                caseinfo.put("contractNum",caseLawyer.getContractNum());
                caseinfo.put("debtPlat",caseLawyer.getDebtPlat());
                caseinfo.put("productName",caseLawyer.getProductName());
                caseinfo.put("inverProj",caseLawyer.getInverProj());
                caseinfo.put("debtName",caseLawyer.getDebtName());
                caseinfo.put("debtIdcard",caseLawyer.getDebtIdcard());
                caseinfo.put("overdueAmount",caseLawyer.getOverduePenalty()+caseLawyer.getOverduePrincipal()+caseLawyer.getOverdueInterest());
                caseinfo.put("deputeTime",caseLawyer.getDeputeTime());
                AllLawyerCaseinfo.add(caseinfo);
            }
        }
        return AllLawyerCaseinfo.toString();
    }



    @RequestMapping(value = "/lawyeroldpwd", method = RequestMethod.POST)
    @ResponseBody
    public String lawyeroldpwd(@RequestParam(value = "oldpwd") String oldpwd,HttpServletRequest request, HttpServletResponse response) {
        Lawyer lawyer = new Lawyer();
        String telp=(String) request.getSession().getAttribute("username");
        lawyer = lawyerMapper.selectByTelp(telp);
        String pwd = lawyer.getLawyerPwd();
        if (!pwd.equals(oldpwd)) {
            return "olderror";
        }
        else{
            return "oldright";
        }
    }

    @RequestMapping(value = "/changelawyerpwd", method = RequestMethod.POST)
    @ResponseBody
    public String changelawyerpwd(@RequestParam(value = "newpwd") String newpwd,HttpServletRequest request, HttpServletResponse response) {
        Lawyer lawyer = new Lawyer();
        String telp=(String) request.getSession().getAttribute("username");
        lawyer.setLawyerPwd(newpwd);
        lawyer.setLawyerTelp(telp);
        lawyerMapper.updateByTelpSelective(lawyer);
        System.out.println("新密码");
        return "success";
    }

    @RequestMapping(value = "/lawyerSuitProgress",method = RequestMethod.POST)
    @ResponseBody
    public String lawyerSuitProgress(HttpServletRequest request){
        JSONArray arrBig=new JSONArray();
        if((String)request.getSession().getAttribute("username")!=null) {
            List<Cases> c = casesMapper.selectByLawyerId(lawyerMapper.selectByTelp((String) request.getSession().getAttribute("username")).getLawyerId());
            for (int i = 0; i < c.size(); i++) {
                JSONArray arrSmall=new JSONArray();
                JSONObject ob1 = new JSONObject();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ob1.put("case_name", c.get(i).getInverProj());
                ob1.put("depute_time", sdf.format(c.get(i).getDeputeTime()));
                ob1.put("fiuser_name", financialuserMapper.selectByPrimaryKey(c.get(i).getFiuserId()).getFiuserEmail());
                ob1.put("service_type", c.get(i).getServiceType());
                ob1.put("evalution_score",c.get(i).getScore());
                ob1.put("caseid",c.get(i).getCaseId());
                arrSmall.add(ob1);
                int statustypeId=statusMapper.selectCaseStatus(c.get(i).getCaseId());
                ob1.put("statustypeId",statustypeId);
                List<Status> statuses = statusMapper.selectStatusByCaseId(c.get(i).getCaseId());

                HuJinController.bubblingSort(statuses,i);
                for (int j = 0; j < statuses.size(); j++) {
                    JSONObject ob2=new JSONObject();
                    ob2.put("status_type", HuJinController.caseStatus(statuses.get(j).getStatusType()));
                    ob2.put("status_time", sdf.format(statuses.get(j).getStatusTime()));
                    arrSmall.add(ob2);
                }
                arrBig.add(arrSmall);
            }
            System.out.println(arrBig.toString());
            return arrBig.toString();
        }else {
            return "无效的用户名";
        }
    }

    @RequestMapping(value = "/changeProgress", method = RequestMethod.POST)
    @ResponseBody
    public String changeProgress(@RequestParam(value = "selectvalue") String selectvalue,@RequestParam(value = "caseid") String caseid) {
        Status status=new Status();
        Calendar c=Calendar.getInstance();
        status.setStatusTime(c.getTime());
        status.setCaseId(Integer.parseInt(caseid));
        status.setStatusType(Integer.parseInt(selectvalue));
        statusMapper.insertSelective(status);
        return status.toString();
    }

    @RequestMapping(value = "/acceptSuit", method = RequestMethod.POST)
    @ResponseBody
    public String acceptSuit(@RequestParam(value = "selectedcasesid") String selectedcasesid,HttpServletRequest request, HttpServletResponse response) {
        String[] casesid=selectedcasesid.split(" ");
        Status status=new Status();
        for (int i=1;i<casesid.length;i++)
        {
            int cid=Integer.parseInt(casesid[i]);
            Cases cases=new Cases();
            cases.setCaseId(cid);
            String lawyerTelp=(String) request.getSession().getAttribute("username");
            int lawyerid=lawyerMapper.selectPidByTelp(lawyerTelp);
            cases.setLawyerId(lawyerid);
            casesMapper.updateByPrimaryKeySelective(cases);
            Assign assign=new Assign();
            assign.setIsAccept(true);
            assign.setCaseId(cid);
            assign.setLawyerId(lawyerid);
            assignMapper.updateByLidAndCid(assign);
            status.setStatusType(6);
            status.setCaseId(cid);
            Calendar c = Calendar.getInstance();
            status.setStatusTime(c.getTime());
            statusMapper.insertSelective(status);
        }
        return status.toString();
    }


}
