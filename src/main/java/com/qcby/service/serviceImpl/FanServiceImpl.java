package com.qcby.service.serviceImpl;

import com.qcby.dao.FanDao;
import com.qcby.entity.Fan;
import com.qcby.service.FanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FanServiceImpl implements FanService {
    @Autowired
    private FanDao fanDao;


    @Override
    public List<Fan> findFan(Fan fan) {
        return this.fanDao.findFan(fan);
    }

    @Override
    public int insertFan(Fan fan) {
        return this.fanDao.insertFan(fan);
    }

    @Override
    public List<Fan> findCon(Fan fan) {
        return this.fanDao.findCon(fan);
    }

    @Override
    public int deleteCon(Integer fanid) {
        return this.fanDao.deleteCon(fanid);
    }


}
