package com.flepeng.controller;

import com.flepeng.pojo.User;
import com.flepeng.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/{id}")
    public User queryById(@PathVariable Long id) {
        System.out.println(id);
        User user = userService.queryById(id);
        System.out.println(user);
        return user;
    }
}
