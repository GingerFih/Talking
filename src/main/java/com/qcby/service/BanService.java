package com.qcby.service;

import com.qcby.entity.Ban;

import java.util.List;

public interface BanService {
    public List<Ban> findBan(Ban ban);
    public int insertBan(Ban ban);
    public int deleteBan(Integer banid);
}
