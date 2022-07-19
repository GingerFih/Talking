package com.qcby.controller;

import com.qcby.entity.Verification;
import com.qcby.util.SendSms;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/vcode")
public class SendverCode {

    @RequestMapping("/sendvcode")
    @ResponseBody
    public String sendvcode(String phone){
        SendSms.sendCode(phone);
        String data = "{\"code\":200}";
        return data;
    }

    @RequestMapping("/comperCode")
    @ResponseBody
    public int comperCode(String textCode,String phone){
        long nowtime=System.nanoTime();
     Verification verifications= SendSms.map.get(phone);
        System.out.println(verifications);
        long itime= verifications.getTime();
        String vcode= verifications.getTestCode();
        if (textCode.equals(vcode)){
            if ((nowtime-itime)/1000000000<300){
                return 1;
            }else {
                return 0;
            }
        }
        return -1;


    }
}
