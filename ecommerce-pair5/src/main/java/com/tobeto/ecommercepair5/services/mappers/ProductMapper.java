package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.requests.product.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.product.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.product.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    @Mapping(target = "category.id", source = "categoryId")
    Product productFromAddRequest(AddProductRequest request);

    @Mapping(target = "categoryName", source = "category.name")
    @Mapping(target = "id", source = "product.id")
    @Mapping(target = "name", source = "product.name")
    AddProductResponse addResponseFromProduct(Product product, Category category);

    @Mapping(target = "category.id", source = "categoryId")
    Product productFromUpdateRequest(UpdateProductRequest request);

    @Mapping(target = "categoryName", source = "category.name")
    @Mapping(target = "id", source = "product.id")
    @Mapping(target = "name", source = "product.name")
    UpdateProductResponse updateResponseFromProduct(Product product, Category category);

    @Mapping(target = "id", source = "id")
    DeleteProductResponse deleteResponseFromId(Product product);

    List<ListProductResponse> listProductResponse(List<Product> products);

//    @Mapping(target = "id", source = "products.id")
//    @Mapping(target = "name", source = "products.name")
//    @Mapping(target = "categoryName", source = "categories.name")
//    List<ListProductResponse> listProductResponse(List<Product> products, List<Category> categories);

    @Mapping(target = "id", source = "product.id")
    @Mapping(target = "name", source = "product.name")
    @Mapping(target = "categoryName", source = "category.name")
    GetProductResponse getProductResponse(Product product, Category category);
}
