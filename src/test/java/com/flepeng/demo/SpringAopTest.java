package com.flepeng.demo;

import com.flepeng.demo.spring_aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-spring-aop.xml")
public class SpringAopTest {

    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }


}
