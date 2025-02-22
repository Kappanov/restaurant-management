package com.example.restaurant.restaurant_management.repository;

import com.example.restaurant.restaurant_management.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
