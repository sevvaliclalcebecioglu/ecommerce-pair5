package com.tobeto.ecommercepair5.repositories;

import com.tobeto.ecommercepair5.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
