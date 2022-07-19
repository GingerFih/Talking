package com.qcby.service.serviceImpl;

import com.qcby.dao.ReplyDao;
import com.qcby.entity.Login;
import com.qcby.entity.Reply;
import com.qcby.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {

    @Autowired
    private ReplyDao replydao;

    @Override
    public List<Reply> findAll() {
        List<Reply> replys = replydao.findAll();
        return replys;
    }
    @Override
    public int insert(Reply reply) {
        return this.replydao.insert(reply);
    }

    @Override
    public int Reply1(Reply reply) {
        return this.replydao.Reply1(reply);
    }

    @Override
    public int update(Reply reply) {
        return this.replydao.update(reply);
    }
}
