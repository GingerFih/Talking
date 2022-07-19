package com.qcby.controller;

import com.qcby.entity.Emotion;
import com.qcby.service.EmotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Controller
@RequestMapping("/emotion")
public class EmotionController {
    @Autowired
    private EmotionService emotionService;

    @RequestMapping(value = "/findEmotion",method = RequestMethod.GET)
    @ResponseBody
    public List<Emotion> findEmotion(Emotion emotion){
        List<Emotion> emotions=emotionService.findEmotion(emotion);
        //System.out.println(emotions.toString());
        System.out.println("查询到的帖子信息"+emotions.toString());
        return emotions;
    }
    @RequestMapping("/insertEmotion")
    @ResponseBody
    public String insertEmotion(Emotion emotion){
        emotion.setPostime(new Date());
        emotion.setLikecount(32);
        emotion.setPostcount(50);
        System.out.println("评论数："+emotion.getPostime());
        System.out.println("插入到数据库中的数据信息"+emotion);
        String json="";
        try{
            int count=emotionService.inserEmotion(emotion);
            System.out.println("插入数据库是否成功？"+count);
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
    @RequestMapping("/deleteEmotion")
    @ResponseBody
    public String deleteEmotion(Integer id){
        System.out.println("要删除的帖子id"+id);
        String json="";
        try {
        int count=emotionService.deletEmotion(id);
        System.out.println("帖子是否删除成功？"+count);

            if (count != 0) {
                json = "{\"code\":200,\"mes\":\"success\"}";
            } else {
                json = "{\"code\":200,\"mes\":\"faile\"}";
            }
        }catch (Exception e){
            e.printStackTrace();
            json="{\"code\":99999,\"mes\":\"数据库出错了\"}";
        }
        return json;
    }
    @RequestMapping("/updateEmotion")
    @ResponseBody
    public String updateEmotion(Emotion emotion){
        System.out.println("要修改的帖子数据信息"+emotion);
        emotion.setPostime(new Date());
        String json="";
        try{
            int count=emotionService.updateEmotion(emotion);
            System.out.println("帖子是否修改成功？"+count);

            if (count!=0){
                json="{\"code\":200,\"mes\":\"success\"}";
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
