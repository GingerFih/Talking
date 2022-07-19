package com.qcby.dao;

import com.qcby.entity.Ban;

import java.util.List;

public interface BanDao {
    public List<Ban> findBan(Ban ban);
     public int insertBan(Ban ban);
     public int deleteBan(Integer banid);
}
