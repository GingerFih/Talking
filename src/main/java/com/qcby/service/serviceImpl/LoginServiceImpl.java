package com.qcby.service.serviceImpl;

import com.qcby.dao.LoginDao;
import com.qcby.entity.Login;
import com.qcby.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;

    public Boolean login(Login login) {
        List<Login> logins = loginDao.login(login);
        if(logins.size() == 1){
            return true;
        }
        return false;
    }

    @Override
    public int insert(Login login) {
        return this.loginDao.insert(login);
    }
    @Override
    public int update(Login login) {
        return this.loginDao.update(login);
    }

    @Override
    public List<Login> findUser(Login login) {
        return this.loginDao.findUser(login);
    }
    @Override
    public int update1(Login login) {
        return this.loginDao.update1(login);
    }
    @Override
    public Boolean findF(Login login) {
        List<Login> logins = loginDao.findF(login);
        if(logins.size() == 1){
            return true;
        }
        return false;
    }

}
