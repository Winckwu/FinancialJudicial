package cn.no7player.controller;

import cn.no7player.mapper.CasesMapper;
import cn.no7player.mapper.FinancialuserMapper;
import cn.no7player.mapper.LawyerMapper;
import cn.no7player.mapper.StatusMapper;
import cn.no7player.model.Cases;
import cn.no7player.model.Financialuser;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cn.no7player.model.Lawyer;
import cn.no7player.model.Status;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Case;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Locale;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;

/**
 * Created by Administrator on 2016/12/5 0005.
 */

@Controller
public class HuJinController {
    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private FinancialuserMapper financialuserMapper;

    @Autowired
    private CasesMapper casesMapper;

    @RequestMapping(value = "/baseInfo",method = RequestMethod.POST)
    @ResponseBody
    public String baseInfo(HttpServletRequest request, HttpServletResponse response){
        //System.out.println(userName);
        String s=(String) request.getSession().getAttribute("username");
        String resultStr=s;
        Financialuser financialuser=financialuserMapper.selectByEmail(s);
        resultStr+="|"+financialuser.getCorpName();
        Cases ca=casesMapper.selectByPrimaryKey(1);
        List<Cases> cases = casesMapper.selectByFiUserId(financialuser.getFiuserId());
        resultStr+="|"+cases.size()+"件";
        int successCaseCount=0;
        for(int i=0;i<cases.size();i++){
            if(cases.get(i).getCaseResult().equals("成功")&&cases.get(i).getServiceType().equals("诉讼"))
                {  successCaseCount++;  }
            if(cases.get(i).getCaseResult().equals("成功") &&cases.get(i).getServiceType().equals("律师函"))
                {  successCaseCount++;  }
        }
        resultStr+="|"+successCaseCount+"件";

        return resultStr;
    }

    @RequestMapping(value = "/changeBasicInfo", method = RequestMethod.POST)
    @ResponseBody
    public String changeBasicInfo(@RequestParam(value = "fiusername") String fiusername,@RequestParam(value = "corp_name") String corp_name,@RequestParam(value = "legalPerson_name") String legalPerson_name,@RequestParam(value = "legalPerson_IDcard") String legalPerson_IDcard,@RequestParam(value = "IDcardpath") String IDcardpath,@RequestParam(value = "busLicenpath") String busLicenpath) {
        Financialuser newuser = new Financialuser();
        newuser.setFiuserEmail(fiusername);
        newuser.setCheckResult(2);
        newuser.setLegalpersonName(legalPerson_name);
        newuser.setLegalpersonIdcard(legalPerson_IDcard);
        newuser.setCorpName(corp_name);
        if (IDcardpath!=null&&!IDcardpath.equals("")){
            newuser.setIdcardImage(IDcardpath);
        }
        if (busLicenpath!=null&&!busLicenpath.equals("")){
            newuser.setBusilicenImage(busLicenpath);
            busLicenpath.length();
        }
        java.util.Date date = new java.util.Date();
        java.sql.Date datasql2=new java.sql.Date(date.getTime());
        newuser.setSubmitinfoTime(datasql2);
        int i=financialuserMapper.updateByEmailKeySelective(newuser);
        System.out.println(newuser.getSubmitinfoTime());
        return newuser.toString();
    }

    @RequestMapping(value = "/fioldpwd", method = RequestMethod.POST)
    @ResponseBody
    public String fioldpwd(@RequestParam(value = "oldpwd") String oldpwd,HttpServletRequest request, HttpServletResponse response) {
        Financialuser newuser = new Financialuser();
        String s=(String) request.getSession().getAttribute("username");
        System.out.println("session"+s);
        newuser=financialuserMapper.selectByEmail(s);
        String pwd=newuser.getFiuserPwd();
        if (!pwd.equals(oldpwd)) {
            return "olderror";
        }
        else{
            return "oldright";
        }
    }

    @RequestMapping(value = "/changefiUserpwd", method = RequestMethod.POST)
    @ResponseBody
    public String changefiUserpwd(@RequestParam(value = "newpwd") String newpwd,HttpServletRequest request, HttpServletResponse response) {
        Financialuser newuser = new Financialuser();
        String s=(String) request.getSession().getAttribute("username");
        System.out.println("session"+s);
        newuser=financialuserMapper.selectByEmail(s);
        newuser.setFiuserPwd(newpwd);
        financialuserMapper.update(newuser);
        System.out.println("新密码");
        return "success";
    }


    @RequestMapping(value = "/getCheckResult", method = RequestMethod.GET)
    @ResponseBody
    public String getCheckResult(HttpServletRequest request, HttpServletResponse response) {
        Financialuser newuser = new Financialuser();
        String s=(String) request.getSession().getAttribute("username");
        System.out.println("session"+s);
        newuser=financialuserMapper.selectByEmail(s);
        String checkresult=newuser.getCheckResult().toString();
        String userMessage=s+'|'+checkresult+'|'+newuser.getCorpName()+'|'+newuser.getLegalpersonName()+'|'+newuser.getLegalpersonIdcard()+'|'+newuser.getIdcardImage()+'|'+newuser.getBusilicenImage();
        System.out.println("checkresult:"+checkresult);
        return userMessage;
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    //@ResponseBody
    public String fileUpload(MultipartFile file, HttpServletRequest request, HttpServletResponse response) {
        if (!file.isEmpty()) {
            String name = file.getOriginalFilename();
            try {
                //String contextPath = request.getSession().getServletContext().getRealPath("/") + "\\uploads\\";
                String contextPath ="../assets/userImages/";
               // String contextPath ="D://IdeaProjects//FinancialJudicial//src//main//resources//lib//";
                File tempFile = new File(contextPath);
                if (!tempFile.exists()) {
                    tempFile.mkdirs();
                }
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(contextPath + name)));
                stream.write(file.getBytes());
                stream.close();
                String s=(String) request.getSession().getAttribute("username");
                readFile(contextPath+name,s);
                return "redirect:webapp/users/submitSuit.html";
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload , because the file was empty.";
        }
    }

    @RequestMapping(value = "/uploadImage", method = RequestMethod.POST)
    @ResponseBody
    public String ImageUpload(@RequestParam(value = "file") MultipartFile file) {
        if (!file.isEmpty()) {
            String name = file.getOriginalFilename();
            try {
                //String contextPath = request.getSession().getServletContext().getRealPath("/") + "\\uploads\\";
                //String contextPath ="F://FinancialJudicial//FinancialJudicial//src//main//resources//static//webapp//assets//userImages//";
                String contextPath ="E://littleant//FinanceJudicial//FinancialJudicial//src//main//resources//static//webapp//assets//userImages//";

                File tempFile = new File(contextPath);

                if (!tempFile.exists()) {
                    tempFile.mkdirs();
                }
                BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(new File(contextPath + name)));
                stream.write(file.getBytes());
                stream.close();
                String imagePath = "../assets/userImages/"+name;
                JSONObject obj = new JSONObject();
                obj.put("imageurl",imagePath);
                return obj.toString();
            } catch (Exception e) {
                return "You failed to upload " + name + " => " + e.getMessage();
            }
        } else {
            return "You failed to upload , because the file was empty.";
        }
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    @ResponseBody
    public String download(@RequestParam(value = "fileName") String fileName, HttpServletRequest request, HttpServletResponse response) {
       /* response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition", "attachment;fileName=" + fileName);*/

        try {

            //String contextPath = "D://IdeaProjects//FinancialJudicial//src//main//resources//lib//";
            String contextPath = "./src/main/resources/lib/";

            InputStream is = new FileInputStream(new File(contextPath + fileName));
            File writeFile=new File("d://caseTemplate.xls");
            //OutputStream os = response.getOutputStream();
            FileOutputStream os=new FileOutputStream(writeFile);
            byte[] b = new byte[2048];
            int length = 0;
            while ((length = is.read(b)) > 0) {
                os.write(b, 0, length);
            }
            is.close();
            os.close();
            return "You have download the file\n path:d:/caseTemplate.xls";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }
    }

    public void readFile(String contextPath,String username){
        jxl.Workbook readwb = null;
        try
        {
            //构建Workbook对象, 只读Workbook对象
            //直接从本地文件创建Workbook
            InputStream instream = new FileInputStream(contextPath);
            readwb = Workbook.getWorkbook(instream);
            //Sheet的下标是从0开始
            //获取第一张Sheet表
            Sheet readsheet = readwb.getSheet(0);
            //获取Sheet表中所包含的总列数
            int rsColumns = readsheet.getColumns();
            //获取Sheet表中所包含的总行数
            int rsRows = readsheet.getRows();
            //获取指定单元格的对象引用
            for (int i = 1; i < rsRows; i++)
            {
                String arr[]=new String[28];
                for (int j = 0; j < rsColumns; j++)
                {
                    Cell cell = readsheet.getCell(j, i);
                    arr[j]=cell.getContents();
                    System.out.print(cell.getContents() + " ");
                }
                System.out.println();
                if(arr!=null) {
                    Cases cases = new Cases();
                    cases.setDeputeTime(new Date());
                    cases.setContractNum(arr[0]);
                    cases.setDebtPlat(arr[1]);
                    cases.setProductName(arr[2]);
                    cases.setInverProj(arr[3]);
                    cases.setInverName(arr[4]);
                    cases.setInverIdcard(arr[6]);
                    cases.setInverAdd(arr[7]);
                    cases.setDebtName(arr[8]);
                    cases.setDebtIdcard(arr[11]);
                    cases.setDebtAdd(arr[12]);
                    cases.setLoanTerm(Integer.parseInt(arr[16]));
                    SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd", Locale.CHINA);
                    cases.setLoanDate(sdf.parse(arr[17]));
                    cases.setRepayData(sdf.parse(arr[18]));
                    cases.setOverdueDate(sdf.parse(arr[19]));
                    cases.setOverdueDays(Integer.parseInt(arr[20]));
                    cases.setContractMoney(Float.parseFloat(arr[21]));
                    cases.setPaidPrincipal(Float.parseFloat(arr[22]));
                    cases.setPaidInterest(Float.parseFloat(arr[23]));
                    cases.setAgreedInterest(Float.parseFloat(arr[24]));
                    cases.setOverdueRate(Float.parseFloat(arr[25]));
                    cases.setOverduePenalty(Float.parseFloat(arr[26]));
                    cases.setPlatFee(Float.parseFloat(arr[27]));
                    Financialuser financialuser=financialuserMapper.selectByEmail(username);
                    cases.setFiuserId(financialuser.getFiuserId());
                    casesMapper.insertSelective(cases);
                    Status status =new Status();
                    List<Cases> x=casesMapper.selectByFiUserId(financialuser.getFiuserId());
                    int maxId=0;
                    for(int n=0;n<x.size();n++){
                        if(x.get(n).getCaseId()>maxId)
                            maxId=x.get(n).getCaseId();
                    }
                    status.setCaseId(maxId);
                    status.setStatusType(1);
                    status.setStatusTime(new Date());
                    statusMapper.insertSelective(status);
                }
            }
            instream.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            readwb.close();
        }
    }
    @Autowired
    private StatusMapper statusMapper;
    @Autowired
    private LawyerMapper lawyerMapper;
    @RequestMapping(value = "/suitInfo",method = RequestMethod.GET)
    @ResponseBody
    public String suitInfo(HttpServletRequest request, HttpServletResponse response){
        String useEmail=(String) request.getSession().getAttribute("username");
        Financialuser user = financialuserMapper.selectByEmail(useEmail);
        List<Cases> AllUserCase= casesMapper.selectByFiUserId(user.getFiuserId());
        JSONArray AllUserCaseinfo = new JSONArray();
        for (int j=0;j<AllUserCase.size();j++){
            Cases caseUser = AllUserCase.get(j);;
            JSONObject caseinfo = new JSONObject();
            int statustype=statusMapper.selectCaseStatus(caseUser.getCaseId());
            String casestatus=caseStatus(statustype);
            // case_status, ,,,,,,lawyer_id,case_result
            String lawyername="";
            Lawyer trustlawyer = lawyerMapper.selectByPrimaryKey(caseUser.getLawyerId());
            if(trustlawyer!=null)
                lawyername=trustlawyer.getLawyerName();
            caseinfo.put("casestatus",casestatus);
            caseinfo.put("trustLawyer",lawyername);
            caseinfo.put("serviceType",caseUser.getServiceType());
            caseinfo.put("caseId", caseUser.getCaseId());
            caseinfo.put("contractNum",caseUser.getContractNum());
            caseinfo.put("debtPlat",caseUser.getDebtPlat());
            caseinfo.put("productName",caseUser.getProductName());
            caseinfo.put("inverProj",caseUser.getInverProj());
            caseinfo.put("inverName",caseUser.getInverName());
            caseinfo.put("inverIdcard",caseUser.getInverIdcard());
            caseinfo.put("inverAdd",caseUser.getInverAdd());
            caseinfo.put("debtName",caseUser.getDebtName());
            caseinfo.put("debtIdcard",caseUser.getDebtIdcard());
            caseinfo.put("debtAdd",caseUser.getDebtAdd());
            caseinfo.put("loanTerm",caseUser.getLoanTerm());
            caseinfo.put("loanDate",caseUser.getLoanDate());
            caseinfo.put("repayData",caseUser.getRepayData());
            caseinfo.put("overdueDate",caseUser.getOverdueDate());
            caseinfo.put("overdueDays",caseUser.getOverdueDays());
            caseinfo.put("contractMoney",caseUser.getContractMoney());
            caseinfo.put("paidPrincipal",caseUser.getPaidPrincipal());
            caseinfo.put("paidInterest",caseUser.getPaidInterest());
            caseinfo.put("agreedInterest",caseUser.getAgreedInterest());
            caseinfo.put("overdueRate",caseUser.getOverdueRate());
            caseinfo.put("overduePenalty",caseUser.getOverduePenalty());
            caseinfo.put("platFee",caseUser.getPlatFee());
            caseinfo.put("overduePrincipal",caseUser.getContractMoney()-caseUser.getPaidPrincipal());
            caseinfo.put("overdueInterest",caseUser.getOverdueInterest());
            caseinfo.put("feeTotal",caseUser.getFeeTotal());
            caseinfo.put("remark",caseUser.getRemark());
            AllUserCaseinfo.add(caseinfo);
        }

        return AllUserCaseinfo.toString();
    }

    @RequestMapping(value = "/suitProgress",method = RequestMethod.POST)
    @ResponseBody
    public String suitProgress(HttpServletRequest request, HttpServletResponse response){
        JSONArray arrBig=new JSONArray();
        if((String)request.getSession().getAttribute("username")!=null) {
            List<Cases> c = casesMapper.selectByFiUserId(financialuserMapper.selectByEmail((String) request.getSession().getAttribute("username")).getFiuserId());
            for (int i = 0; i < c.size(); i++) {
                JSONArray arrSmall=new JSONArray();
                JSONObject ob1 = new JSONObject();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                ob1.put("case_name", c.get(i).getInverProj());
                ob1.put("depute_time", sdf.format(c.get(i).getDeputeTime()));
                if (c.get(i).getLawyerId() != null) {
                    ob1.put("lawyer_name", lawyerMapper.selectByPrimaryKey(c.get(i).getLawyerId()).getLawyerName() == null ? "暂无" : lawyerMapper.selectByPrimaryKey(c.get(i).getLawyerId()).getLawyerName());
                } else {
                    ob1.put("lawyer_name", "暂无");
                }
                ob1.put("service_type", c.get(i).getServiceType());
                arrSmall.add(ob1);
                List<Status> statuses = statusMapper.selectStatusByCaseId(c.get(i).getCaseId());
                bubblingSort(statuses,i);
                for (int j = 0; j < statuses.size(); j++) {
                    JSONObject ob2=new JSONObject();
                    ob2.put("status_type", caseStatus(statuses.get(j).getStatusType()));
                    ob2.put("status_time", sdf.format(statuses.get(j).getStatusTime()));
                    arrSmall.add(ob2);
                }
                arrBig.add(arrSmall);
            }
            return arrBig.toString();
        }else {
            return "无效的用户名";
        }
    }


    @RequestMapping(value = "/submitSuit", method = RequestMethod.POST)
    @ResponseBody
    public String submitSuit(@RequestParam(value = "selectedcasesid") String selectedcasesid,@RequestParam(value = "selectvalue") String selectvalue,HttpServletRequest request, HttpServletResponse response) {
        Status status=new Status();
        Cases cases=new Cases();
        String[] casesid=selectedcasesid.split(" ");
        for (int i=1;i<casesid.length;i++)
        {
            int cid=Integer.parseInt(casesid[i]);
            status.setCaseId(cid);
            status.setStatusType(2);
            java.util.Date date = new java.util.Date();
            java.sql.Date datasql2=new java.sql.Date(date.getTime());
            status.setStatusTime(datasql2);
            statusMapper.insertSelective(status);
            cases.setServiceType(selectvalue);
            cases.setCaseId(cid);
            casesMapper.updateByPrimaryKeySelective(cases);
        }
        return status.toString();
    }


    public static String caseStatus(int i) {
        String cstaus = "";
        switch (i) {
            case 1:
                cstaus = "提交未发布";
                break;
            case 2:
                cstaus = "已发布待审核";
                break;
            case 3:
                cstaus = "审核通过但未指派律师";
                break;
            case 4:
                cstaus = "等待接单";
                break;
            case 5:
                cstaus = "无人接单";
                break;
            case 6:
                cstaus = "律师已接单";
                break;
            case 7:
                cstaus = "起诉状整理";
                break;
            case 8:
                cstaus = "诉讼请求金额计算公式整理";
                break;
            case 9:
                cstaus = "证据清单整理";
                break;
            case 10:
                cstaus = "等待法院立案";
                break;
            case 11:
                cstaus = "发出律师函";
                break;
            case 12:
                cstaus = "等待法院开庭";
                break;
            case 13:
                cstaus = "等待判决结果";
                break;
            case 14:
                cstaus = "诉讼结束";
                break;
            case 15:
                cstaus = "审核未通过";
                break;
            default:
                cstaus = "无状态";
                break;
        }
        return cstaus;
    }

    public static void bubblingSort(List<Status> statuses,int i){
        for (int j = 0; j < statuses.size(); j++) {
            for (int k = 0; k < statuses.size() - i - 1; k++) {
                if (statuses.get(k).getStatusId() > statuses.get(k + 1).getStatusId()) {
                    Status temp = statuses.get(k);
                    statuses.set(k, statuses.get(k + 1));
                    statuses.set(k + 1, temp);
                }
            }
        }
    }

}

