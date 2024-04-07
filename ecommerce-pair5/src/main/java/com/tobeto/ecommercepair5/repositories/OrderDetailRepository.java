package com.tobeto.ecommercepair5.repositories;

import com.tobeto.ecommercepair5.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
