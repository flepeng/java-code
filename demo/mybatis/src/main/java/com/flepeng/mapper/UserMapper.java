package com.flepeng.mapper;

import com.flepeng.domain.User;

import java.util.List;

public interface UserMapper {

    public void insert(User user);

    public void insertBatch(List users);

    public void delete(Integer id);

    public void update(User user);

    public User findById(int id);

    public List<User> findAll();

    public List<User> findByCondition(User user);

    public List<User> findByIds(List<Integer> ids);

    public List<User> findAllOrder();

    public List<User> findUserAndRoleAll();
}
