package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    Order orderFromAddRequest(AddOrderRequest request);

    AddOrderResponse addResponseFromOrder(Order order);

    GetOrderResponse getOrderResponse(Order order);

    List<ListOrderResponse> listOrderResponse(List<Order> orders);

    Order orderFromUpdateRequest(UpdateOrderRequest request);

    UpdateOrderResponse updateResponseFromOrder(Order order);

    @Mapping(target = "id", source = "id")
    DeleteOrderResponse deleteResponseFromId(Order order);

}
