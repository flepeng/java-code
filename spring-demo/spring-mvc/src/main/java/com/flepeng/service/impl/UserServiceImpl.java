package com.flepeng.service.impl;

import com.flepeng.dao.UserDao;
import com.flepeng.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();
    }
}
