package com.qcby.dao;

import com.qcby.entity.Chat;

import java.util.List;

public interface ChatDao {
    public List<Chat> findchat(Chat chat);
    public int insertchat(Chat chat);
}
