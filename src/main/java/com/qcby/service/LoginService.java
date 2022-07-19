package com.qcby.service;

import com.qcby.entity.Login;

import java.util.List;

public interface LoginService {
    Boolean login(Login login);
    public int insert(Login login);
    public int update(Login login);
    public List<Login> findUser(Login login);
    public int update1(Login login);
    Boolean findF(Login login);
}
