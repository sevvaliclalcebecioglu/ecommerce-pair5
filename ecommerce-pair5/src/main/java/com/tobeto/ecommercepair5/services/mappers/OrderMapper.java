package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.order.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.order.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.order.*;
import com.tobeto.ecommercepair5.services.dtos.responses.product.DeleteProductResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.user.GetUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    @Mapping(target = "user.id", source = "userId")
    Order orderFromAddRequest(AddOrderRequest request);

    @Mapping(target = "userId", source = "user.id")
    AddOrderResponse addResponseFromOrder(Order order);

    Order orderFromUpdateRequest(UpdateOrderRequest request);

    UpdateOrderResponse updateResponseFromOrder(Order order);

    DeleteOrderResponse deleteResponseFromId(Order order);

    List<ListOrderResponse> listOrderResponse(List<Order> orders);

    @Mapping(target = "id", source = "order.id")
    @Mapping(target = "userId", source = "user.id")
    GetOrderResponse getOrderResponse(Order order, User user);
}
