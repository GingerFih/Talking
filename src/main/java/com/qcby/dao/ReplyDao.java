package com.qcby.dao;


import com.qcby.entity.Login;
import com.qcby.entity.Reply;

import java.util.List;

public interface ReplyDao {
     List<Reply> findAll();
     public int insert(Reply reply);
     public int Reply1(Reply reply);
     public int update(Reply reply);
}
