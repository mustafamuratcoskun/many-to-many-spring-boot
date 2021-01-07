package com.yazilimbilimi.springbootmanytomanyrelationship.repository;

import com.yazilimbilimi.springbootmanytomanyrelationship.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    Role findByName(String name);
}
