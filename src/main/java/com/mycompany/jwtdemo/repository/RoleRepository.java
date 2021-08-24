package com.mycompany.jwtdemo.repository;

import com.mycompany.jwtdemo.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
}
