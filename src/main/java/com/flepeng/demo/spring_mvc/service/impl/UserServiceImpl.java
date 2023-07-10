package com.flepeng.demo.spring_mvc.service.impl;

import com.flepeng.demo.spring_mvc.dao.UserDao;
import com.flepeng.demo.spring_mvc.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
