package com.yazilimbilimi.springbootmanytomanyrelationship.service;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.Role;
import com.yazilimbilimi.springbootmanytomanyrelationship.dtos.CreateRoleDto;
import com.yazilimbilimi.springbootmanytomanyrelationship.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl  implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void add(CreateRoleDto createRoleDto) {
        Role role = new Role();
        role.setName(createRoleDto.getName());

        roleRepository.save(role);

    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();

    }
}
