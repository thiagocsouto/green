package com.eco.green.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eco.green.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	User findByEmail( String email);

}
