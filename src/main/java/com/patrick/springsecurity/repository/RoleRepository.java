package com.patrick.springsecurity.repository;

import com.patrick.springsecurity.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
