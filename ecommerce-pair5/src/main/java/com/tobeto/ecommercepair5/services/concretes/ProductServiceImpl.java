package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.repositories.CategoryRepository;
import com.tobeto.ecommercepair5.repositories.ProductRepository;
import com.tobeto.ecommercepair5.services.abstracts.ProductService;
import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.*;
import com.tobeto.ecommercepair5.services.mappers.ProductMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;
    private CategoryRepository categoryRepository;

    @Override
    public AddProductResponse add(AddProductRequest request) {
        Product product = ProductMapper.INSTANCE.productFromAddRequest(request);
        product = productRepository.save(product);

        Category category = categoryRepository.findById(product.getCategory().getId()).orElseThrow();

        AddProductResponse addProductResponse = ProductMapper.INSTANCE.addResponseFromProduct(product, category);

        return addProductResponse;
    }

    @Override
    public UpdateProductResponse update(UpdateProductRequest request) {
        Product product = ProductMapper.INSTANCE.productFromUpdateRequest(request);
        product = productRepository.save(product);

        Category category = categoryRepository.findById(product.getCategory().getId()).orElseThrow();

        UpdateProductResponse updateProductResponse = ProductMapper.INSTANCE.updateResponseFromProduct(product, category);

        return updateProductResponse;
    }

    @Override
    public DeleteProductResponse delete(int id) {
        Product product = productRepository.findById(id).orElseThrow();

        DeleteProductResponse deleteProductResponse = ProductMapper.INSTANCE.deleteResponseFromId(product);

        productRepository.delete(product);

        return deleteProductResponse;
    }

    @Override
    public List<ListProductResponse> getAll() {
        Category category;
        List<Product> products = productRepository.findAll();
        List<ListProductResponse> response = new ArrayList<>();

        for (Product product : products) {
            category = categoryRepository.findById(product.getCategory().getId()).orElseThrow();
            ListProductResponse listProductResponse = ProductMapper.INSTANCE.productToListProductResponse(product, category);

            response.add(listProductResponse);
        }

        return response;
    }

    @Override
    public GetProductResponse getById(int id) {
        Product product = productRepository.findById(id).orElseThrow();
        Category category = categoryRepository.findById(product.getCategory().getId()).orElseThrow();
        GetProductResponse getProductResponse = ProductMapper.INSTANCE.getProductResponse(product, category);

        return getProductResponse;
    }

    @Override
    public List<ListProductResponse> searchByName(String name) {
        return productRepository.searchByName(name);
    }

    @Override
    public List<ListProductResponse> searchByUnitPrice(double minPrice, double maxPrice) {
        return productRepository.searchByUnitPrice(minPrice, maxPrice);
    }

    @Override
    public List<ListProductResponse> searchByCategory(int category) {
        return productRepository.searchByCategory(category);
    }

    @Override
    public List<ListProductResponse> searchByNewProduct() {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusMonths(1);

        return productRepository.searchByNewProduct(startDate, endDate);
    }

    @Override
    public List<ListProductResponse> topSeller() {
        return productRepository.topSeller();
    }
}
