package com.yazilimbilimi.springbootmanytomanyrelationship.service;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.Role;
import com.yazilimbilimi.springbootmanytomanyrelationship.domain.User;
import com.yazilimbilimi.springbootmanytomanyrelationship.dtos.CreateUserDto;
import com.yazilimbilimi.springbootmanytomanyrelationship.repository.RoleRepository;
import com.yazilimbilimi.springbootmanytomanyrelationship.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;


    @Override
    public void addNewUser(CreateUserDto createUserDto) {
        User user = new User();

        user.setUsername(createUserDto.getUsername());
        user.setEmail(createUserDto.getEmail());
        user.setPassword(createUserDto.getPassword());

        user.setRoles(getUserRoles(createUserDto.getRoles()));
        userRepository.save(user);


    }
    private Set<Role> getUserRoles(String[] roles){
        Set<Role> userRoles = new HashSet<>();

        for (String roleName : roles) {
            Role newRole = roleRepository.findByName(roleName);

            userRoles.add(newRole);

        }
        return userRoles;

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();

    }

}
