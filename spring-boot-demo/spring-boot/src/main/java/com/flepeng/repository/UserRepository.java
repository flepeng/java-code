package com.flepeng.repository;

import com.flepeng.domain.UserJpa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserJpa,Long>{

    public List<UserJpa> findAll();

}
