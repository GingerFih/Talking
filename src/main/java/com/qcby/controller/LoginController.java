package com.qcby.controller;


import com.qcby.entity.Login;
import com.qcby.service.LoginService;
import com.qcby.util.ImageUtil;
import com.qcby.util.RandomValidateCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {


    @Autowired
    private LoginService loginService;


    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
        response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        RandomValidateCode randomValidateCode = new RandomValidateCode();
        try {
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 登录
     * @return
     */
    @RequestMapping(value = "/login",produces ="application/text;charset=utf-8")
    @ResponseBody  // 这个注解的目的是返回json数据，但是如果没有他那么返回html
    public String login(Login login,String inputStr,HttpSession session, HttpServletResponse response){
        System.out.println(inputStr);
        Boolean fage = loginService.login(login);
        String random = (String) session.getAttribute("RANDOMCODEKEY");
        System.out.println(random);
        String account=login.getAccount();
        System.out.println(account);
        String json = "";
        if(random.equals(inputStr)){
            if(fage==true) {
                json = "{\"code\":\"200\",\"message\":\"登录成功\"}";
                Cookie cookie=new Cookie("account",account);
                cookie.setPath("/Talking");
                cookie.setMaxAge(60*60);
                response.addCookie(cookie);

            }else{
                json = "{\"code\":\"999\",\"message\":\"登录失败\"}";
            }
        }else{
            json = "{\"code\":\"888\",\"message\":\"登录失败\"}";
        }
        return json;
    }

    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Login login){
        int num = loginService.insert(login);
        String data = "";
        if (num == 1){
            data = "{\"code\":0}";
        }else {
            data = "{\"code\":999}";
        }
        return data;
    }

    @RequestMapping("/update")
    @ResponseBody
    public String update(Login login){
        int num = loginService.update(login);
        String data = "";
        if (num == 1){
            data = "{\"code\":0}";
        }else {
            data = "{\"code\":999}";
        }
        return data;
    }

    /**
     * 获取生成验证码显示到页面
     * @param request
     * @param response
     * @throws Exception
     */
    @RequestMapping(value="/checkCode")
    public void checkCode(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        //设置相应类型,告诉浏览器输出的内容为图片
        response.setContentType("image/jpeg");
        //设置响应头信息，告诉浏览器不要缓存此内容
        response.setHeader("pragma", "no-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expire", 0);
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));


        RandomValidateCode randomValidateCode = new RandomValidateCode();

        try {

            randomValidateCode.getRandcode(request, response);//输出图片方法
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 查询用户信息根据用户id
     */
    @RequestMapping("/findUser")
    @ResponseBody
    public List<Login> findUser(Login login){
        List<Login> userImag=this.loginService.findUser(login);
        System.out.println("查询用户头像"+userImag);
        return userImag;

    }
    @RequestMapping("/update1")
    @ResponseBody
    public String update1(Login login) throws IOException {
        String images = System.currentTimeMillis()+".png";
        String url ="../sources/images/"+images;
        String Str = login.getImgurl();
        System.out.println(url);
        login.setImgurl(url);

        System.out.println(Str);
        ImageUtil.save(Str, "D:\\ideaProject\\Talking\\src\\main\\webapp\\sources\\images"+images);

        int num = loginService.update1(login);
        String data = "";
        if (num == 1){
            data = "{\"code\":0}";
        }else {
            data = "{\"code\":999}";
        }
        return data;
    }
    @RequestMapping("/findF")
    @ResponseBody
    public String finF(Login login){
        Boolean fage = loginService.findF(login);
        String json = "";
        if(fage==true){
            json = "{\"code\":\"200\",\"message\":\"验证成功\"}";
        }else {
            json = "{\"code\":\"999\",\"message\":\"验证失败\"}";
        }
        return json;

    }

}
