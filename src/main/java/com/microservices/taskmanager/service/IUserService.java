package com.microservices.taskmanager.service;

import com.microservices.taskmanager.model.User;
import org.springframework.http.ResponseEntity;

public interface IUserService {

  ResponseEntity<User> createUser(User user);
}
