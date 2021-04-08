package com.trustfuldev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trustfuldev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
