package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends UserService{

    private UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO oneUserDAO) {
        userDAO = oneUserDAO;
    }

    @Override
    public List<User> findAll() { return userDAO.findAll();}

    @Override
    public User findById(int oneId) { return userDAO.findById(oneId);}

    @Transactional
    @Override
    public User save(User oneUser) {return userDAO.save(oneUser);}

}
