package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.OrderDetail;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.*;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface OrderDetailMapper {
    OrderDetailMapper INSTANCE = Mappers.getMapper(OrderDetailMapper.class);

    @Mapping(target = "order.id", source = "orderId")
    @Mapping(target = "product.id", source = "productId")
    OrderDetail orderDetailFromAddRequest(AddOrderDetailRequest request);

    @Mapping(target = "product.id", source = "request.productId")
    OrderDetail orderDetailFromAddRequestForOrder(AddOrderDetailRequest request, Order order);

    @Mapping(target = "productName", source = "product.name")
    @Mapping(target = "id", source = "orderDetail.id")
    @Mapping(target = "order", source = "order")
    AddOrderDetailResponse addResponseFromOrderDetail(OrderDetail orderDetail, Product product, Order order);


    @Mapping(target = "order.id", source = "orderId")
    @Mapping(target = "product.id", source = "productId")
    OrderDetail orderDetailFromUpdateRequest(UpdateOrderDetailRequest request);

    @Mapping(target = "productName", source = "product.name")
    @Mapping(target = "id", source = "orderDetail.id")
    @Mapping(target = "order", source = "order")
    UpdateOrderDetailResponse updateResponseFromOrderDetail(OrderDetail orderDetail, Product product, Order order);

    @Mapping(target = "id", source = "id")
    DeleteOrderDetailResponse deleteResponseFromId(OrderDetail orderDetail);

    List<ListOrderDetailResponse> listOrderDetailResponse(List<OrderDetail> orderDetails);

    @Mapping(target = "id", source = "orderDetail.id")
    @Mapping(target = "productName", source = "product.name")
    @Mapping(target = "order", source = "order")
    GetOrderDetailResponse getOrderDetailResponse(OrderDetail orderDetail, Product product, Order order);
}

