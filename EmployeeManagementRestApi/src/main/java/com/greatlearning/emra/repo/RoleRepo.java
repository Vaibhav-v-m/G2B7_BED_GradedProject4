package com.greatlearning.emra.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.emra.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
