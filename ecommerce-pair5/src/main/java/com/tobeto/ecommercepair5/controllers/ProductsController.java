package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.repositories.ProductRepository;
import com.tobeto.ecommercepair5.services.abstracts.ProductService;
import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    private ProductService productService;

    private ProductRepository productRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddProductResponse add(@RequestBody @Valid AddProductRequest request) {
        return productService.add(request);
    }

    @PutMapping
    public UpdateProductResponse update(@RequestBody @Valid UpdateProductRequest request) {
        return productService.update(request);
    }

    @DeleteMapping
    public DeleteProductResponse delete(@RequestParam @Valid int id) {
        return productService.delete(id);
    }

    @GetMapping
    public List<ListProductResponse> search(@RequestParam String query)
    {
        return productService.search(query);
    }

    @GetMapping("/{getById}")
    public GetProductResponse getById(@PathVariable int getById) {
        return productService.getById(getById);
    }
}
