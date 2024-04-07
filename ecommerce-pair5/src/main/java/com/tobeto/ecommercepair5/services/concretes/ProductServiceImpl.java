package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.repositories.ProductRepository;
import com.tobeto.ecommercepair5.services.abstracts.ProductService;
import com.tobeto.ecommercepair5.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.*;
import com.tobeto.ecommercepair5.services.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Override
    public AddProductResponse add(AddProductRequest request) {
        Product product = ProductMapper.INSTANCE.productFromAddRequest(request);
        product = productRepository.save(product);
        AddProductResponse addProductResponse = ProductMapper.INSTANCE.addResponseFromProduct(product);
        return addProductResponse;
    }

    @Override
    public UpdateProductResponse update(UpdateProductRequest request) {
        Product product = ProductMapper.INSTANCE.productFromUpdateRequest(request);
        product  = productRepository.save(product);
        UpdateProductResponse updateProductResponse = ProductMapper.INSTANCE.updateResponseFromProduct(product);
        return updateProductResponse;
    }

    @Override
    public DeleteProductResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListProductResponse> getAll() {
        return null;
    }

    @Override
    public GetProductResponse getById(int id) {
        return null;
    }
}
