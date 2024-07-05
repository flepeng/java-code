package com.flepeng.service;

import com.flepeng.dao.UserMapper;
import com.flepeng.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return userMapper.selectByPrimaryKey(id);
    }
}
