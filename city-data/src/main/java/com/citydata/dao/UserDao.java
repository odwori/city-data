package com.citydata.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.citydata.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByEmail(String email);
}
