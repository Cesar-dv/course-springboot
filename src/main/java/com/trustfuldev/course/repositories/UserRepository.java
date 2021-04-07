package com.trustfuldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustfuldev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
