package com.qcby.dao;

import com.qcby.entity.Login;

import java.util.List;

public interface LoginDao {
    List<Login> login(Login login);
    public int insert(Login login);
    public int update(Login login);
    public List<Login> findUser(Login login);
    public int update1(Login login);
    public List<Login> findF(Login login);
}
