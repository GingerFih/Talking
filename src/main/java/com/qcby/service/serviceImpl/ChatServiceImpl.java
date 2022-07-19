package com.qcby.service.serviceImpl;

import com.qcby.dao.ChatDao;
import com.qcby.entity.Chat;
import com.qcby.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatServiceImpl implements ChatService {
    @Autowired
    private ChatDao chatDao;

    @Override
    public List<Chat> findchat(Chat chat) {
        return this.chatDao.findchat(chat);
    }

    @Override
    public int insertchat(Chat chat) {
        return this.chatDao.insertchat(chat);
    }
}
