package com.full.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.full.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
