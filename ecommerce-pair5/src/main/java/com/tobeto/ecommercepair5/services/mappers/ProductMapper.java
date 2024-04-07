package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.services.dtos.requests.AddProductRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.UpdateProductRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.AddProductResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.UpdateProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    Product productFromAddRequest(AddProductRequest request);

    AddProductResponse addResponseFromProduct(Product product);

    Product productFromUpdateRequest(UpdateProductRequest request);

    UpdateProductResponse updateResponseFromProduct(Product product);


}
