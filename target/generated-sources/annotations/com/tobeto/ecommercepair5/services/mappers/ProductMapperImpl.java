package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.AddProductResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.product.DeleteProductResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.product.GetProductResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.product.ListProductResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.product.UpdateProductResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-19T10:44:56+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product productFromAddRequest(AddProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( addProductRequestToCategory( request ) );
        product.setName( request.getName() );
        product.setDescription( request.getDescription() );
        product.setStock( request.getStock() );
        product.setUnitPrice( (int) request.getUnitPrice() );
        product.setAddedDate( request.getAddedDate() );

        return product;
    }

    @Override
    public AddProductResponse addResponseFromProduct(Product product, Category category) {
        if ( product == null && category == null ) {
            return null;
        }

        AddProductResponse addProductResponse = new AddProductResponse();

        if ( product != null ) {
            addProductResponse.setId( product.getId() );
            addProductResponse.setName( product.getName() );
            addProductResponse.setDescription( product.getDescription() );
            addProductResponse.setStock( product.getStock() );
            addProductResponse.setUnitPrice( product.getUnitPrice() );
            addProductResponse.setAddedDate( product.getAddedDate() );
        }
        if ( category != null ) {
            addProductResponse.setCategoryName( category.getName() );
        }

        return addProductResponse;
    }

    @Override
    public Product productFromUpdateRequest(UpdateProductRequest request) {
        if ( request == null ) {
            return null;
        }

        Product product = new Product();

        product.setCategory( updateProductRequestToCategory( request ) );
        product.setId( request.getId() );
        product.setName( request.getName() );
        product.setDescription( request.getDescription() );
        product.setStock( request.getStock() );
        product.setUnitPrice( (int) request.getUnitPrice() );
        product.setAddedDate( request.getAddedDate() );

        return product;
    }

    @Override
    public UpdateProductResponse updateResponseFromProduct(Product product, Category category) {
        if ( product == null && category == null ) {
            return null;
        }

        UpdateProductResponse updateProductResponse = new UpdateProductResponse();

        if ( product != null ) {
            updateProductResponse.setId( product.getId() );
            updateProductResponse.setName( product.getName() );
            updateProductResponse.setDescription( product.getDescription() );
            updateProductResponse.setUnitPrice( product.getUnitPrice() );
            updateProductResponse.setStock( product.getStock() );
            updateProductResponse.setAddedDate( product.getAddedDate() );
        }
        if ( category != null ) {
            updateProductResponse.setCategoryName( category.getName() );
        }

        return updateProductResponse;
    }

    @Override
    public DeleteProductResponse deleteResponseFromId(Product product) {
        if ( product == null ) {
            return null;
        }

        DeleteProductResponse deleteProductResponse = new DeleteProductResponse();

        deleteProductResponse.setId( product.getId() );
        deleteProductResponse.setName( product.getName() );
        deleteProductResponse.setDescription( product.getDescription() );
        deleteProductResponse.setStock( product.getStock() );
        deleteProductResponse.setUnitPrice( product.getUnitPrice() );
        deleteProductResponse.setAddedDate( product.getAddedDate() );

        return deleteProductResponse;
    }

    @Override
    public ListProductResponse productToListProductResponse(Product product, Category category) {
        if ( product == null && category == null ) {
            return null;
        }

        ListProductResponse listProductResponse = new ListProductResponse();

        if ( product != null ) {
            listProductResponse.setId( product.getId() );
            listProductResponse.setName( product.getName() );
            listProductResponse.setDescription( product.getDescription() );
            listProductResponse.setUnitPrice( product.getUnitPrice() );
            listProductResponse.setStock( product.getStock() );
            listProductResponse.setAddedDate( product.getAddedDate() );
        }
        if ( category != null ) {
            listProductResponse.setCategoryName( category.getName() );
        }

        return listProductResponse;
    }

    @Override
    public List<ListProductResponse> productListToListProductResponseList(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ListProductResponse> list = new ArrayList<ListProductResponse>( products.size() );
        for ( Product product : products ) {
            list.add( productToListProductResponse1( product ) );
        }

        return list;
    }

    @Override
    public GetProductResponse getProductResponse(Product product, Category category) {
        if ( product == null && category == null ) {
            return null;
        }

        GetProductResponse getProductResponse = new GetProductResponse();

        if ( product != null ) {
            getProductResponse.setId( product.getId() );
            getProductResponse.setName( product.getName() );
            getProductResponse.setDescription( product.getDescription() );
            getProductResponse.setStock( product.getStock() );
            getProductResponse.setUnitPrice( product.getUnitPrice() );
            getProductResponse.setAddedDate( product.getAddedDate() );
        }
        if ( category != null ) {
            getProductResponse.setCategoryName( category.getName() );
        }

        return getProductResponse;
    }

    protected Category addProductRequestToCategory(AddProductRequest addProductRequest) {
        if ( addProductRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( addProductRequest.getCategoryId() );

        return category;
    }

    protected Category updateProductRequestToCategory(UpdateProductRequest updateProductRequest) {
        if ( updateProductRequest == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( updateProductRequest.getCategoryId() );

        return category;
    }

    protected ListProductResponse productToListProductResponse1(Product product) {
        if ( product == null ) {
            return null;
        }

        ListProductResponse listProductResponse = new ListProductResponse();

        listProductResponse.setId( product.getId() );
        listProductResponse.setName( product.getName() );
        listProductResponse.setDescription( product.getDescription() );
        listProductResponse.setUnitPrice( product.getUnitPrice() );
        listProductResponse.setStock( product.getStock() );
        listProductResponse.setAddedDate( product.getAddedDate() );

        return listProductResponse;
    }
}
