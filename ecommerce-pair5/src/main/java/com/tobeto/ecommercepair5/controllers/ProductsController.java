package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.ProductService;
import com.tobeto.ecommercepair5.services.dtos.requests.products.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.products.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.products.*;
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

    @GetMapping
    public List<ListProductResponse> getAll()
    {
        return productService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddProductResponse add(@RequestBody @Valid AddProductRequest request)
    {
        return  productService.add(request);
    }

    @PutMapping
    public UpdateProductResponse update(@RequestBody @Valid UpdateProductRequest request)
    {
        return productService.update(request);
    }

    @DeleteMapping
    public DeleteProductResponse delete(int id)
    {
        return productService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public GetProductResponse getById(@PathVariable int id)
    {
        return productService.getById(id);
    }
}
