package com.tobeto.ecommercepair5.repositories;

import com.tobeto.ecommercepair5.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
