package com.qcby.service.serviceImpl;

import com.qcby.dao.EmotionDao;
import com.qcby.entity.Emotion;
import com.qcby.service.EmotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmotionServiceImpl implements EmotionService {
    @Autowired
    private EmotionDao emotionDao;
    @Override
    public List<Emotion> findEmotion(Emotion emotion) {
        return this.emotionDao.findEmotion(emotion);
    }

    @Override
    public int inserEmotion(Emotion emotion) {
        return this.emotionDao.inserEmotion(emotion);
    }

    @Override
    public int deletEmotion(Integer id) {
        return this.emotionDao.deletEmotion(id);
    }

    @Override
    public int updateEmotion(Emotion emotion) {
        return this.emotionDao.updateEmotion(emotion);
    }
}
