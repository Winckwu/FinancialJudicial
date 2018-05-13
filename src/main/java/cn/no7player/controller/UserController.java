package cn.no7player.controller;

import cn.no7player.mapper.FinancialuserMapper;
import cn.no7player.mapper.LawyerMapper;
import cn.no7player.model.Financialuser;
import cn.no7player.model.Lawyer;
import com.alibaba.fastjson.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private FinancialuserMapper financialuserMapper;
    @Autowired
    private LawyerMapper lawyerMapper;

    /*@Value("${application.hello:Hello Phil}")
    private String hello;


    @RequestMapping("/index2")
    public String helloJsp(Map<String,Object> map){
        System.out.println("HelloController.helloJsp().hello="+hello);
        map.put("hello", hello);
        return "index2";
    }*/

    @RequestMapping(value = "/loginJudge", method = RequestMethod.POST)
    @ResponseBody
    public String loginJudge(@RequestParam(value = "user_name") String userName,@RequestParam(value = "user_pwd") String pwd, HttpSession httpSession) {
        System.out.println(userName);
        httpSession.setAttribute("username",userName);
        if (userName.indexOf("@") == -1) {
            Lawyer lawyer;
            lawyer = lawyerMapper.selectByTelp(userName);
            if (lawyer != null&&lawyer.getLawyerPwd().equals(pwd)) {
                //System.out.println("查找成功");
                return "律师用户";
            } else {
                return "密码错误";
            }
        } else {
            Financialuser financialuser;
            financialuser = financialuserMapper.selectByEmail(userName);
            if (financialuser != null&&financialuser.getFiuserPwd().equals(pwd)) {
                //System.out.println("查找成功！");
                return "互金平台用户";
            } else {
                return "密码错误";
            }
        }
    }

    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
    //@ResponseBody
    public String insertUser(@RequestParam(value = "email") String email, @RequestParam(value = "password") String password, @RequestParam(value = "confirmpassword") String confirmpassword) {
        Financialuser newuser = new Financialuser();
        newuser.setFiuserPwd(password);
        newuser.setFiuserEmail(email);
        java.util.Date date = new java.util.Date();
        java.sql.Date datasql=new java.sql.Date(date.getTime());
        newuser.setRegisterTime(datasql);
        financialuserMapper.insertSelective(newuser);
        System.out.println("成功存入数据库");
        return "redirect:webapp/signin.html";
    }


    @RequestMapping(value = "/registerLawyer", method = RequestMethod.POST)
    public String insertLaywer(@RequestParam(value = "tel") String telp, @RequestParam(value = "password") String password) {
            Lawyer newlawyer = new Lawyer();
            newlawyer.setLawyerTelp(telp);
            newlawyer.setLawyerPwd(password);
            java.util.Date date = new java.util.Date();
            java.sql.Date datasql2=new java.sql.Date(date.getTime());
            newlawyer.setRegisterTime(datasql2);
            lawyerMapper.insertSelective(newlawyer);
            System.out.println("成功存入律师");
        return "redirect:webapp/signin.html";
    }


    @RequestMapping(value = "/changePwd", method = RequestMethod.POST)
//    @ResponseBody
    public String changePwd(@Param(value = "emailormobile") String emailormobile, @Param(value = "newpwd") String newpwd) {
        if (emailormobile.contains("@")) {
            Financialuser newuser = new Financialuser();
            newuser.setFiuserPwd(newpwd);
            newuser.setFiuserEmail(emailormobile);
            financialuserMapper.updateByEmail(newuser);
            System.out.println("互金用户");
        } else {
            Lawyer lawyer = new Lawyer();
            lawyer.setLawyerTelp(emailormobile);
            lawyer.setLawyerPwd(newpwd);
            lawyerMapper.updateByTelpSelective(lawyer);
            System.out.println("律师");
        }
        System.out.println("成功更改密码");
        return "redirect:webapp/signin.html";
    }

    @RequestMapping(value = "/isExist", method = RequestMethod.GET)
    @ResponseBody
    public String isExist(@RequestParam(value = "userName") String userName) {
        boolean is_exist = false;
        JSONObject jsonObject = new JSONObject();
        System.out.println(userName);
        if (userName.indexOf("@") == -1) {
            Lawyer lawyer = lawyerMapper.selectByTelp(userName);
            if (lawyer != null) {
                is_exist = true;
                jsonObject.put("is_exist", is_exist);
                return jsonObject.toString();
            }
            jsonObject.put("is_exist", is_exist);
            return jsonObject.toString();
        } else {
            Financialuser financialuser = financialuserMapper.selectByEmail(userName);
            if (financialuser != null) {
                is_exist = true;
                jsonObject.put("is_exist", is_exist);
                return jsonObject.toString();
            }
            jsonObject.put("is_exist", is_exist);
            return jsonObject.toString();
        }
    }
}

