package com.example.mongodbdemo.controller;

import com.example.mongodbdemo.model.User;
import com.example.mongodbdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping( "/user")
    @Transactional(rollbackFor = Exception.class)
    public void addUser(String userName, String password) throws Exception {
        User user1 = new User();
        user1.setPassWord(password);
        user1.setUserName(userName);
        userRepository.save(user1);
//        throw new Exception("test");
    }
}
