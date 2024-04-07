package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.categories.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.categories.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.categories.*;


import java.util.List;

public interface CategoryService {
    AddCategoryResponse add(AddCategoryRequest request);
    UpdateCategoryResponse update(UpdateCategoryRequest request);
    DeleteCategoryResponse delete(int id);
    List<ListCategoryResponse> getAll();
    GetCategoryResponse getById(int id);
}
