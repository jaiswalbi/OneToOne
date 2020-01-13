package com.binay.oneToOne.controller;

import com.binay.oneToOne.entity.User;
import com.binay.oneToOne.entity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserContrller {

    @Autowired
    UserRepo userRepo;

    @PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user){

        return userRepo.save(user);
    }
}
