package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.category.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.category.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.category.*;


import java.util.List;

public interface CategoryService {
    AddCategoryResponse add(AddCategoryRequest request);
    UpdateCategoryResponse update(UpdateCategoryRequest request);
    DeleteCategoryResponse delete(Integer id);
    List<ListCategoryResponse> getAll();
    GetCategoryResponse getById(Integer id);

}
