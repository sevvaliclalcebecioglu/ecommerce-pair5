package com.tobeto.ecommercepair5.repositories;

import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
 @Query(value = "SELECT NEW com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse(p.id, p.name, p.description, p.unitPrice " +
         ") FROM Product AS p WHERE LOWER(p.name) LIKE LOWER(:name)")
 List<ListProductResponse> searchByName(String name);

 @Query(value = "Select new com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse(p.id, p.name, p.description, p.unitPrice) " +
         "from Product p Where p.unitPrice between ?1 and ?2")
 List<ListProductResponse> searchByUnitPrice(double minPrice, double maxPrice);

 @Query(value = "SELECT NEW com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse(p.id,c.name, p.name, p.description, p.unitPrice)" +
         "FROM Product AS p " +
         "INNER JOIN Category AS c ON p.category.id = c.id " +
         "WHERE p.category.id = :categoryId")
 List<ListProductResponse> searchByCategory(int categoryId);

 @Query(value = "SELECT NEW com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse(" +
         "p.id, p.name, p.description, p.unitPrice)" +
         " FROM Product p " +
         " INNER JOIN OrderDetail od ON p.id = od.product.id" +
         " GROUP BY p.id, p.name, p.description, p.unitPrice" +
         " ORDER BY SUM(od.quantity) DESC" +
         " LIMIT 1")
 List<ListProductResponse> topSeller();
}