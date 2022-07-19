package com.qcby.service.serviceImpl;

import com.qcby.dao.BanDao;
import com.qcby.entity.Ban;
import com.qcby.service.BanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BanServiceImpl implements BanService {
    @Autowired
    private BanDao banDao;
    @Override
    public List<Ban> findBan(Ban ban) {
        return this.banDao.findBan(ban);
    }

    @Override
    public int insertBan(Ban ban) {
        return this.banDao.insertBan(ban);
    }

    @Override
    public int deleteBan(Integer banid) {
        return this.banDao.deleteBan(banid);
    }
}
