package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.repositories.CategoryRepository;
import com.tobeto.ecommercepair5.services.dtos.requests.category.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.category.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.category.AddCategoryResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.category.*;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    @AfterMapping
    default void handleRequestAfterMapping(Object request, @MappingTarget Category category, CategoryRepository categoryRepository) {
        Integer parentId = null;

        if (request instanceof AddCategoryRequest) {
            parentId = ((AddCategoryRequest) request).getParentId();
        } else if (request instanceof UpdateCategoryRequest) {
            parentId = ((UpdateCategoryRequest) request).getParentId();
        }

        if (parentId != null) {
            Category parentCategory = categoryRepository.findById(parentId).orElse(null);

            if (parentCategory == null) {
                throw new IllegalArgumentException("Parent category not found");
            }

            category.setParent(parentCategory);
        } else {
            // parentId null ise, üst kategori belirsiz olduğu için parent alanını null olarak ayarla
            category.setParent(null);
        }
    }


    @Mapping(target = "parent.id", source = "parentId")
    Category categoryFromAddRequest(AddCategoryRequest request);

    @Mapping(target = "parentName", source = "parent.name")
    @Mapping(target = "id", source = "category.id")
    @Mapping(target = "name", source = "category.name")
    AddCategoryResponse addResponseFromCategory(Category category);

    @Mapping(target = "parent.id", source = "parentId")
    Category categoryFromUpdateRequest(UpdateCategoryRequest request);

    UpdateCategoryResponse updateResponseFromCategory(Category category);

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
