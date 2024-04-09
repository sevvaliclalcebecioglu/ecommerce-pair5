package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.services.dtos.requests.category.AddCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.category.UpdateCategoryRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.category.AddCategoryResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.category.DeleteCategoryResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.category.GetCategoryResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.category.ListCategoryResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.category.UpdateCategoryResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-08T23:53:36+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category categoryFromAddRequest(AddCategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setParent( addCategoryRequestToCategory( request ) );
        category.setName( request.getName() );

        return category;
    }

    @Override
    public AddCategoryResponse addResponseFromCategory(Category category, Category parent) {
        if ( category == null && parent == null ) {
            return null;
        }

        AddCategoryResponse addCategoryResponse = new AddCategoryResponse();

        if ( category != null ) {
            addCategoryResponse.setId( category.getId() );
            addCategoryResponse.setName( category.getName() );
        }
        if ( parent != null ) {
            addCategoryResponse.setParentName( parent.getName() );
        }

        return addCategoryResponse;
    }

    @Override
    public Category categoryFromUpdateRequest(UpdateCategoryRequest request) {
        if ( request == null ) {
            return null;
        }

        Category category = new Category();

        category.setParent( updateCategoryRequestToCategory( request ) );
        category.setId( request.getId() );
        category.setName( request.getName() );

        return category;
    }

    @Override
    public UpdateCategoryResponse updateResponseFromCategory(Category category, Category parent) {
        if ( category == null && parent == null ) {
            return null;
        }

        UpdateCategoryResponse updateCategoryResponse = new UpdateCategoryResponse();

        if ( category != null ) {
            updateCategoryResponse.setId( category.getId() );
            updateCategoryResponse.setName( category.getName() );
        }
        if ( parent != null ) {
            updateCategoryResponse.setParentName( parent.getName() );
        }

        return updateCategoryResponse;
    }

    @Override
    public DeleteCategoryResponse deleteResponseFromId(Category category) {
        if ( category == null ) {
            return null;
        }

        DeleteCategoryResponse deleteCategoryResponse = new DeleteCategoryResponse();

        deleteCategoryResponse.setId( category.getId() );
        deleteCategoryResponse.setName( category.getName() );

        return deleteCategoryResponse;
    }

    @Override
    public List<ListCategoryResponse> listCategoryResponse(List<Category> categories) {
        if ( categories == null ) {
            return null;
        }

        List<ListCategoryResponse> list = new ArrayList<ListCategoryResponse>( categories.size() );
        for ( Category category : categories ) {
            list.add( categoryToListCategoryResponse( category ) );
        }

        return list;
    }

    @Override
    public GetCategoryResponse getCategoryResponse(Category category, Category parent) {
        if ( category == null && parent == null ) {
            return null;
        }

        GetCategoryResponse getCategoryResponse = new GetCategoryResponse();

        if ( category != null ) {
            getCategoryResponse.setId( category.getId() );
            getCategoryResponse.setName( category.getName() );
        }
        if ( parent != null ) {
            getCategoryResponse.setParentName( parent.getName() );
        }

        return getCategoryResponse;
    }

    protected Category addCategoryRequestToCategory(AddCategoryRequest addCategoryRequest) {
        if ( addCategoryRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( addCategoryRequest.getParentId() );

        return category;
    }

    protected Category updateCategoryRequestToCategory(UpdateCategoryRequest updateCategoryRequest) {
        if ( updateCategoryRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( updateCategoryRequest.getParentId() );

        return category;
    }

    protected ListCategoryResponse categoryToListCategoryResponse(Category category) {
        if ( category == null ) {
            return null;
        }

        ListCategoryResponse listCategoryResponse = new ListCategoryResponse();

        listCategoryResponse.setId( category.getId() );
        listCategoryResponse.setName( category.getName() );

        return listCategoryResponse;
    }
}
