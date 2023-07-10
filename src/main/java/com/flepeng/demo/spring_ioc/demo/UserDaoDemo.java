package com.flepeng.demo.spring_ioc.demo;

import com.flepeng.demo.spring_ioc.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class UserDaoDemo {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext app = new FileSystemXmlApplicationContext("C:\\Users\\apple\\IdeaProjects\\Spring\\itheima_spring_ioc\\src\\main\\resources\\applicationContext.xml");
        UserDao userDao = (UserDao) app.getBean("userDao");
        userDao.save();
    }

}
