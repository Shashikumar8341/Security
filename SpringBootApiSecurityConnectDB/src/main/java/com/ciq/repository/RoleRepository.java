package com.ciq.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciq.enitity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	Role findByRname(String rname);

}
