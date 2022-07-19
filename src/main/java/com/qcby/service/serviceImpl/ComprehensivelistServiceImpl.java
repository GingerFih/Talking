package com.qcby.service.serviceImpl;

import com.qcby.dao.ComprehensivelistDao;
import com.qcby.entity.Comprehensivelist;
import com.qcby.service.ComprehensivelistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ComprehensivelistServiceImpl implements ComprehensivelistService {
    @Autowired
    private ComprehensivelistDao comprehensivelistDao;

    @Override
    public List<Comprehensivelist> findComprehensivelist() {
        return this.comprehensivelistDao.findComprehensivelist();
    }

    @Override
    public int inserComprehensivelist(Comprehensivelist comprehensivelist) {
        return this.comprehensivelistDao.inserComprehensivelist(comprehensivelist);
    }

    @Override
    public int deletComprehensivelist(Integer id) {
        return this.comprehensivelistDao.deletComprehensivelist(id);
    }

    @Override
    public int updateComprehensivelist(Comprehensivelist comprehensivelist) {
        return this.comprehensivelistDao.updateComprehensivelist(comprehensivelist);
    }
}
