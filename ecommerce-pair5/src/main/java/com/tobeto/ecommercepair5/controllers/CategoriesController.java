package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.CategoryService;
import com.tobeto.ecommercepair5.services.dtos.requests.category.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.category.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.category.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
    private CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddCategoryResponse add(@RequestBody @Valid AddCategoryRequest request) {
        return categoryService.add(request);
    }

    @PutMapping
    public UpdateCategoryResponse update(@RequestBody @Valid UpdateCategoryRequest request) {
        return categoryService.update(request);
    }

    @DeleteMapping
    public DeleteCategoryResponse delete(@RequestParam @Valid int id) {
        return categoryService.delete(id);
    }

    @GetMapping
    public List<ListCategoryResponse> response() {
        return categoryService.getAll();
    }

    @GetMapping("/{getById}")
    public GetCategoryResponse getById(@PathVariable int getById) {
        return categoryService.getById(getById);
    }
}
