package com.microservices.taskmanager.service;

import com.microservices.taskmanager.model.User;
import com.microservices.taskmanager.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService implements  IUserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public ResponseEntity<User> createUser(User user){

         return ResponseEntity.ok(userRepository.save(user));
    }


}
