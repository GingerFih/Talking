package com.qcby.service;

import com.qcby.entity.Reply;

import java.util.List;

public interface ReplyService {
    List<Reply> findAll();
    public int insert(Reply reply);
    public int Reply1(Reply reply);
    public int update(Reply reply);
}
