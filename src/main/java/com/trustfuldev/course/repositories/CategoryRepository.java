package com.trustfuldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustfuldev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
