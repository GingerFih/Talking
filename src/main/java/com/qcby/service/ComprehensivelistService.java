package com.qcby.service;

import com.qcby.entity.Comprehensivelist;

import java.util.List;

public interface ComprehensivelistService {
    //查询
    public List<Comprehensivelist> findComprehensivelist();
    //添加
    public int inserComprehensivelist(Comprehensivelist comprehensivelist);
    //删除
    public int deletComprehensivelist(Integer id);
    //修改
    public int updateComprehensivelist(Comprehensivelist comprehensivelist);
}
