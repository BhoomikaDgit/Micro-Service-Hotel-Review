package com.Mvc.UserService.repositories.Services.impl;

import com.Mvc.UserService.entities.User;
import com.Mvc.UserService.exception.ResourceNotFoundException;
import com.Mvc.UserService.repositories.Services.UserSrvice;
import com.Mvc.UserService.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserSrvice {
    @Autowired
private UserRepo userRepo;
    @Override
    public User saveUser(User user) {
        //UNIQUE USER ID
        String randomId=UUID.randomUUID().toString();
        user.setUserId(randomId);
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("user with given id is not found on server!!:"+userId));

    }
}
