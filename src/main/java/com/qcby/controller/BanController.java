package com.qcby.controller;

import com.qcby.entity.Ban;
import com.qcby.service.BanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/ban")
public class BanController {
    @Autowired
    private BanService banService;

    @RequestMapping("/findBan")
    @ResponseBody
    public List<Ban> findBan(Ban ban){
        List<Ban> bans=this.banService.findBan(ban);
        return bans;
    }
    @RequestMapping("/deleteBan")
    @ResponseBody
    public String deleteBan(Integer banid){
        String json="";
        try{
            int count= this.banService.deleteBan(banid);
            System.out.println(count);
            if (count!=0){
                json="{\"code\":0,\"mes\":\"success\"}";
            }else{
                json="{\"code\":200,\"mes\":\"faile\"}";
            }
        }catch (Exception e){
            e.printStackTrace();
            json="{\"code\":99999,\"mes\":\"数据库出错了\"}";
        }
        return json;
    }

    @RequestMapping("/insertBan")
    @ResponseBody
    public String insertBan(Ban ban){
        String json="";
        try{
            int count= this.banService.insertBan(ban);
            System.out.println(count);

            if (count!=0){
                json="{\"code\":0,\"mes\":\"success\"}";
            }else{
                json="{\"code\":200,\"mes\":\"faile\"}";
            }
        }catch (Exception e){
            e.printStackTrace();
            json="{\"code\":99999,\"mes\":\"数据库出错了\"}";
        }

        return json;
    }

}
