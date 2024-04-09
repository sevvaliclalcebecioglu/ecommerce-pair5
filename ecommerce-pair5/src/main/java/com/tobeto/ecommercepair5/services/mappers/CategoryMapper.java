package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.services.dtos.requests.category.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.category.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.category.AddCategoryResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.category.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @Mapping(target = "parent.id", source = "parentId")
    Category categoryFromAddRequest(AddCategoryRequest request);

    @Mapping(target = "parentName", source = "parent.name")
    @Mapping(target = "id", source = "category.id")
    @Mapping(target = "name", source = "category.name")
    AddCategoryResponse addResponseFromCategory(Category category, Category parent);

    @Mapping(target = "parent.id", source = "parentId")
    Category categoryFromUpdateRequest(UpdateCategoryRequest request);

    @Mapping(target = "parentName", source = "parent.name")
    @Mapping(target = "id", source = "category.id")
    @Mapping(target = "name", source = "category.name")
    UpdateCategoryResponse updateResponseFromCategory(Category category, Category parent);

    @Mapping(target = "id", source = "id")
    DeleteCategoryResponse deleteResponseFromId(Category category);

    List<ListCategoryResponse> listCategoryResponse(List<Category> categories);

    @Mapping(target = "parentName", source = "parent.name")
    @Mapping(target = "id", source = "category.id")
    @Mapping(target = "name", source = "category.name")
    GetCategoryResponse getCategoryResponse(Category category, Category parent);
}
