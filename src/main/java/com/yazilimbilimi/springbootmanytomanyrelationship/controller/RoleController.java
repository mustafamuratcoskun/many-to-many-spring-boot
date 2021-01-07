package com.yazilimbilimi.springbootmanytomanyrelationship.controller;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.Role;
import com.yazilimbilimi.springbootmanytomanyrelationship.dtos.CreateRoleDto;
import com.yazilimbilimi.springbootmanytomanyrelationship.service.RoleService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping()
    public ResponseEntity<List<Role>> getAllRoles(){
        List<Role> roles = roleService.getAllRoles();
        return ResponseEntity.ok(roles);

    }
    @PostMapping("/add")
    public ResponseEntity<String> addNewRole(@RequestBody CreateRoleDto createRoleDto) {
        roleService.add(createRoleDto);
        return ResponseEntity.ok("New Role Added Succesfully");


    }

}
