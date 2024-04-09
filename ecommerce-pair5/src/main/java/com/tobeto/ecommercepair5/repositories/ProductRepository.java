package com.tobeto.ecommercepair5.repositories;

import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    //@Query(value = "SELECT name * FROM products WHERE name LIKE '%a%'" , nativeQuery = true)

   @Query(value = "SELECT new com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse(p.id, p.name)" +
   "FROM Product p Where LOWER(p.name) LIKE CONCAT('%' , LOWER(:query), '%')", nativeQuery = false)
    List<ListProductResponse> search(@Param("query") String query);


}
