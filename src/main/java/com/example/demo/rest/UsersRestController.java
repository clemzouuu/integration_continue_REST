package com.example.demo.rest;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersRestController {

    private UserService userService;

    public UsersRestController(UserService oneUserService){
        userService = oneUserService;
    }

    @GetMapping("/{userId}/todo/items")
    public User findAll(@PathVariable int userId){
        return userService.findById(userId);

    }

    @PostMapping("/addUser")
    public User addUser (@RequestBody User oneUser){
        oneUser.setId(0);
        return userService.save(oneUser);
    }




}
