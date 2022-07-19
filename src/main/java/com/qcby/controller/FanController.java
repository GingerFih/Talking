package com.qcby.controller;

import com.qcby.entity.Fan;
import com.qcby.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("fan")
public class FanController {
    @Autowired
    private FanService fanService;
    @RequestMapping("/findFan")
    @ResponseBody
    public List<Fan> findFan(Fan fan){
        List<Fan> fans=this.fanService.findFan(fan);
        return fans;
    }
    @RequestMapping("/insertFan")
    @ResponseBody
    public String insertFan(Fan fan){
        fan.setFantime(new Date());
        String json="";
        try {
        int count=this.fanService.insertFan(fan);

        System.out.println(count);

        if (count!=0){
            json="{\"code\":0,\"mes\":\"success\"}";
        }else{
            json="{\"code\":200,\"mes\":\"faile\"}";
        }
        } catch (Exception e) {
            e.printStackTrace();
            json="{\"code\":99999,\"mes\":\"数据库出错了\"}";
        }
        return json;
    }
    @RequestMapping("/findCon")
    @ResponseBody
    public List<Fan> findCon(Fan fan){
        List<Fan> cons=this.fanService.findCon(fan);
        return cons;
    }

    @RequestMapping("/deleteCon")
    @ResponseBody
    public String deleteCon(Integer fanid){
        String json="";

        int count= 0;
        try {
            count = this.fanService.deleteCon(fanid);

        System.out.println(count);

        if (count!=0){
            json="{\"code\":0,\"mes\":\"success\"}";
        }else{
            json="{\"code\":200,\"mes\":\"faile\"}";
        }
        } catch (Exception e) {
            e.printStackTrace();
            json="{\"code\":99999,\"mes\":\"数据库出错了\"}";
        }
        return json;
    }
}
