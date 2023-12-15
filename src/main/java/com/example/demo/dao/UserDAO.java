package com.example.demo.dao;

import com.example.demo.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> findAll();

    User findById(int oneId);

    User save(User oneUser);

    void deleteById(int oneId);
}
