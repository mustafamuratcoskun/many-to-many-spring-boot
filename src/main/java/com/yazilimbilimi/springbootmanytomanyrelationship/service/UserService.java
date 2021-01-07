package com.yazilimbilimi.springbootmanytomanyrelationship.service;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.User;
import com.yazilimbilimi.springbootmanytomanyrelationship.dtos.CreateUserDto;

import java.util.List;

public interface UserService {
    void addNewUser(CreateUserDto createUserDto);

    List<User> getAllUsers();
}
