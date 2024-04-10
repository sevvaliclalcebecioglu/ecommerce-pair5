package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.*;

import java.time.LocalDate;
import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest request);
    UpdateProductResponse update(UpdateProductRequest request);
    DeleteProductResponse delete(int id);
    List<ListProductResponse> getAll();
    GetProductResponse getById(int id);
    List<ListProductResponse> searchByName(String name);
    List<ListProductResponse> searchByUnitPrice(double minPrice, double maxPrice);
    List<ListProductResponse> searchByCategory(int category);
    //List<ListProductResponse> searchByNewProduct();
    List<ListProductResponse> topSeller();

}
