package com.flepeng.demo;

import com.flepeng.demo.spring_ioc.dao.UserDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIocTest {

    @Test
    //测试scope属性
    public void test1(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-spring-ioc.xml");
        UserDao userDao1 = (UserDao) app.getBean("userDao");
        System.out.println(userDao1);
        //app.close();
    }

}
