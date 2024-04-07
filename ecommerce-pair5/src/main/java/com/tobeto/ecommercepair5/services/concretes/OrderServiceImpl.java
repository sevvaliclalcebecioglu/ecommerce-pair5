package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.repositories.OrderRepository;
import com.tobeto.ecommercepair5.services.abstracts.OrderService;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.*;
import com.tobeto.ecommercepair5.services.mappers.OrderMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    @Override
    public AddOrderResponse add(AddOrderRequest request) {
        Order order = OrderMapper.INSTANCE.orderFromAddRequest(request);
        order = orderRepository.save(order);
        AddOrderResponse addOrderResponse = OrderMapper.INSTANCE.addResponseFromOrder(order);

        return addOrderResponse;
    }

    @Override
    public UpdateOrderResponse update(UpdateOrderRequest request) {
        Order order = OrderMapper.INSTANCE.orderFromUpdateRequest(request);
        order = orderRepository.save(order);
        UpdateOrderResponse updateOrderResponse = OrderMapper.INSTANCE.updateResponseFromOrder(order);

        return updateOrderResponse;
    }

    @Override
    public DeleteOrderResponse delete(int id) {
        Order order = orderRepository.findById(id).orElseThrow();
        DeleteOrderResponse deleteOrderResponse = OrderMapper.INSTANCE.deleteResponseFromId(order);
        orderRepository.delete(order);

        return deleteOrderResponse;
    }

    @Override
    public List<ListOrderResponse> getAll() {
        List<Order> orders = orderRepository.findAll();
        List<ListOrderResponse> responses = OrderMapper.INSTANCE.listOrderResponse(orders);

        return responses;
    }

    @Override
    public GetOrderResponse getById(int id) {
        Order order = orderRepository.findById(id).orElseThrow();
        GetOrderResponse getOrderResponse = OrderMapper.INSTANCE.getOrderResponse(order);

        return getOrderResponse;
    }
}
