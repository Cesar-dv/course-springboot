package com.trustfuldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustfuldev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
