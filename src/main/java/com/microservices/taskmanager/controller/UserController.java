package com.microservices.taskmanager.controller;

import com.microservices.taskmanager.model.User;
import com.microservices.taskmanager.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task-manager")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/user")
    ResponseEntity<User> createUser(@RequestBody User user) {
        return iUserService.createUser(user);
    }
}
