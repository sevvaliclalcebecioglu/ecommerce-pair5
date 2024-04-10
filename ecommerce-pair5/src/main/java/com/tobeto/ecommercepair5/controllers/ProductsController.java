package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.ProductService;
import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductsController {
    private ProductService productService;

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
    public List<ListProductResponse> response() {
        return productService.getAll();
    }

    @GetMapping("/{getById}")
    public GetProductResponse getById(@PathVariable int getById) {
        return productService.getById(getById);
    }

    @GetMapping("/searchByName")
    public List<ListProductResponse> searchByName(@RequestParam String name) {
        return productService.searchByName(name);
    }

    @GetMapping("/searchByUnitPrice")
    public List<ListProductResponse> searchByUnitPrice(@RequestParam double minPrice, @RequestParam double maxPrice) {
        return productService.searchByUnitPrice(minPrice,maxPrice);
    }

    @GetMapping("/searchByCategory")
    public List<ListProductResponse> searchByUnitPrice(@RequestParam int id) {
        return productService.searchByCategory(id);
    }

//    @GetMapping("/searchByNewProduct")
//    public List<ListProductResponse> searchByNewProduct() {
//        return productService.searchByNewProduct();
//    }

    @GetMapping("/topSeller")
    public List<ListProductResponse> searchTopSeller() {
        return productService.topSeller();
    }
}
