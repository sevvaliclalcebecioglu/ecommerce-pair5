package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.products.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.products.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.products.*;

import java.util.List;

public interface ProductService {
    AddProductResponse add(AddProductRequest request);
    UpdateProductResponse update(UpdateProductRequest request);
    DeleteProductResponse delete(int id);
    List<ListProductResponse> getAll();
    GetProductResponse getById(int id);
}
