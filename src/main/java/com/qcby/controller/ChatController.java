package com.qcby.controller;

import com.qcby.entity.Chat;
import com.qcby.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/chat")
public class ChatController {
    @Autowired
    private ChatService chatService;
    @RequestMapping("/findchat")
    @ResponseBody
    public List<Chat> findchat(Chat chat){
        List<Chat> chats=this.chatService.findchat(chat);
        return chats;
    }

    @RequestMapping("/insertchat")
    @ResponseBody
    public String insertchat(Chat chat){
        chat.setSendtime(new Date());
        String json="";
        try {
        int count =this.chatService.insertchat(chat);

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
