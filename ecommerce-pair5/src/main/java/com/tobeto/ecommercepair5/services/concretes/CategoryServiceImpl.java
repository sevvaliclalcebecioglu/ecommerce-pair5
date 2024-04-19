package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.repositories.CategoryRepository;
import com.tobeto.ecommercepair5.services.abstracts.CategoryService;
import com.tobeto.ecommercepair5.services.dtos.requests.category.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.category.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.category.*;
import com.tobeto.ecommercepair5.services.mappers.CategoryMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository categoryRepository;

    @Override
    public AddCategoryResponse add(AddCategoryRequest request) {
        Category category = CategoryMapper.INSTANCE.categoryFromAddRequest(request);

        CategoryMapper.INSTANCE.handleRequestAfterMapping(request, category, categoryRepository);

        category = categoryRepository.save(category);

        AddCategoryResponse addCategoryResponse = CategoryMapper.INSTANCE.addResponseFromCategory(category);

        return addCategoryResponse;
    }

    @Override
    public UpdateCategoryResponse update(UpdateCategoryRequest request) {
        Category category = CategoryMapper.INSTANCE.categoryFromUpdateRequest(request);

        CategoryMapper.INSTANCE.handleRequestAfterMapping(request, category, categoryRepository);

        category = categoryRepository.save(category);

        UpdateCategoryResponse updateCategoryResponse = CategoryMapper.INSTANCE.updateResponseFromCategory(category);

        return updateCategoryResponse;
    }

    @Override
    public DeleteCategoryResponse delete(Integer id) {
        Category category = categoryRepository.findById(id).orElseThrow();

        DeleteCategoryResponse deleteCategoryResponse = CategoryMapper.INSTANCE.deleteResponseFromId(category);

        categoryRepository.delete(category);

        return deleteCategoryResponse;
    }

    @Override
    public List<ListCategoryResponse> getAll() {
        List<Category> categories= categoryRepository.findAll();

        List<ListCategoryResponse> response = CategoryMapper.INSTANCE.listCategoryResponse(categories);

        return response;
    }

    @Override
    public GetCategoryResponse getById(Integer id) {
        Category category = categoryRepository.findById(id).orElseThrow();
        Category parentCategory = categoryRepository.findById(category.getParent().getId()).orElseThrow();
        GetCategoryResponse getCategoryResponse = CategoryMapper.INSTANCE.getCategoryResponse(category, parentCategory);

        return getCategoryResponse;
    }
}
