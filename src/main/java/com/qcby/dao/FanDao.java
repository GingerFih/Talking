package com.qcby.dao;


import com.qcby.entity.Fan;

import java.util.List;

public interface FanDao {
    public List<Fan> findFan(Fan fan);
    public int insertFan(Fan fan);
    public List<Fan> findCon(Fan fan);
    public int deleteCon(Integer fanid);
}
