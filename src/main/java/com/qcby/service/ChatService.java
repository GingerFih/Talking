package com.qcby.service;

import com.qcby.entity.Chat;

import java.util.List;

public interface ChatService {
    public List<Chat> findchat(Chat chat);
    public int insertchat(Chat chat);
}
