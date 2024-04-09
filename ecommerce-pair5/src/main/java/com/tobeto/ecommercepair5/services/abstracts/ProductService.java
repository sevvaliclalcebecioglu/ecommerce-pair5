package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.*;

import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest request);
    UpdateProductResponse update(UpdateProductRequest request);
    DeleteProductResponse delete(int id);
    List<ListProductResponse> getAll();
    GetProductResponse getById(int id);

    List<ListProductResponse> search(String query);
}
