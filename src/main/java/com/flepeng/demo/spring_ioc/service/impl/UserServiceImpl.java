package com.flepeng.demo.spring_ioc.service.impl;

import com.flepeng.demo.spring_ioc.dao.UserDao;
import com.flepeng.demo.spring_ioc.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public UserServiceImpl() {
    }

    /*public void setUserDao(UserDao userDao) {
                this.userDao = userDao;
            }*/
    public void save() {
        userDao.save();
    }
}
