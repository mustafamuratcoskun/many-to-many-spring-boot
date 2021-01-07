package com.yazilimbilimi.springbootmanytomanyrelationship.controller;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.User;
import com.yazilimbilimi.springbootmanytomanyrelationship.dtos.CreateUserDto;
import com.yazilimbilimi.springbootmanytomanyrelationship.service.UserService;
import com.yazilimbilimi.springbootmanytomanyrelationship.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping()
    public ResponseEntity<List<User> > getAllUsers(){
        List<User> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }
    @PostMapping("/add")
    public ResponseEntity<String> addNewUser(@RequestBody CreateUserDto createUserDto) {
        userService.addNewUser(createUserDto);

        return ResponseEntity.ok("User Created Succesfully");
    }
}
