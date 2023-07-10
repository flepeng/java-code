package com.flepeng.demo.mybatis.mapper;

import com.flepeng.demo.mybatis.domain.User;

import java.util.List;

public interface UserMapper {

    public void save(User user);

    public User findById(int id);

    public List<User> findAll();

    public List<User> findByCondition(User user);

    public List<User> findByIds(List<Integer> ids);

    public List<User> findAllOrder();

    public List<User> findUserAndRoleAll();
}
