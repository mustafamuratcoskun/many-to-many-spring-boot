package com.yazilimbilimi.springbootmanytomanyrelationship.service;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.Role;
import com.yazilimbilimi.springbootmanytomanyrelationship.dtos.CreateRoleDto;

import java.util.List;

public interface RoleService {
    void add(CreateRoleDto createRoleDto);

    List<Role> getAllRoles();
}
