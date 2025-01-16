package com.flepeng.demo.spring_data_jpa.dao;

import com.flepeng.demo.spring_data_jpa.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface UserDao extends JpaRepository<User,Long> ,JpaSpecificationExecutor<User> {
}
