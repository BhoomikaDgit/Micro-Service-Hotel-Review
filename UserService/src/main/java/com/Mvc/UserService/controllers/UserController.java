package com.Mvc.UserService.controllers;

import com.Mvc.UserService.entities.User;
import com.Mvc.UserService.payLoad.ApiResponse;
import com.Mvc.UserService.repositories.Services.UserSrvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserSrvice userSrvice;
    //create
    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        User user1=userSrvice.saveUser(user);
        return  ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }
    //single user get
    @GetMapping("{userId}/")
    public ResponseEntity<User> getSingleUser(@PathVariable String userId){
User user=userSrvice.getUser(userId);
return ResponseEntity.ok(user);
    }
    //all user get
    @GetMapping
    public ResponseEntity<List<User>> getAllUser(){
       List<User> allUser= userSrvice.getAllUser();
       return ResponseEntity.ok(allUser);
    }
}
