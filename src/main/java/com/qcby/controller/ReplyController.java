package com.qcby.controller;

import com.qcby.entity.Login;
import com.qcby.entity.Reply;
import com.qcby.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/Reply")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Reply> findAll(){
        List<Reply> replys = replyService.findAll();
        System.out.println(replys.toString());
        return replys;
    }
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(Reply reply){
        reply.setPostime(new Date());
        int num = 0;
        String data = "";
        try {
            num = replyService.insert(reply);
        } catch (Exception e) {
            e.printStackTrace();
            data = "{\"code\":数据库错误}";
        }

        if (num == 1){
            data = "{\"code\":0}";
        }else {
            data = "{\"code\":999}";
        }
        return data;
    }
    @RequestMapping("/Reply")
    @ResponseBody
    public String Reply1(Reply reply){
        reply.setPostime(new Date());
        int num = replyService.Reply1(reply);
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
    public String update(Reply reply){
        int num = 0;
        String data = "";
        try {
            num = replyService.update(reply);
        } catch (Exception e) {
            e.printStackTrace();
            data = "{\"code\":数据库错误}";
        }
        if (num == 1){
            data = "{\"code\":0}";
        }else {
            data = "{\"code\":999}";
        }
        return data;
    }
}
