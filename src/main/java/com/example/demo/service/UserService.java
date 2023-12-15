package com.example.demo.service;

import com.example.demo.entity.User;
import jakarta.transaction.Transactional;

import java.util.List;

public abstract class UserService {

    public abstract List<User> findAll();

    public abstract User findById(int oneId);

    @Transactional
    public abstract User save(User oneUser);


}
