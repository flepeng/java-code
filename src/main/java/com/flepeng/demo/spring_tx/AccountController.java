package com.flepeng.demo.spring_tx;

import com.flepeng.demo.spring_tx.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountController {

    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext-spring-tx.xml");
        AccountService accountService = app.getBean(AccountService.class);
        accountService.transfer("tom","lucy",500);
    }

}
