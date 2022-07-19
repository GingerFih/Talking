package com.qcby.service;

import com.qcby.entity.Emotion;

import java.util.List;

public interface EmotionService {
    //查询
    public List<Emotion> findEmotion(Emotion emotion);
    //添加
    public int inserEmotion(Emotion emotion);
    //删除
    public int deletEmotion(Integer id);
    //修改
    public int updateEmotion(Emotion emotion);
}
