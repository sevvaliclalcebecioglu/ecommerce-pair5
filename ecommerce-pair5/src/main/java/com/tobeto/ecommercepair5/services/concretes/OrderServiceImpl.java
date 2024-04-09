package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.repositories.OrderRepository;
import com.tobeto.ecommercepair5.repositories.UserRepository;
import com.tobeto.ecommercepair5.services.abstracts.OrderService;
import com.tobeto.ecommercepair5.services.dtos.requests.order.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.order.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.order.*;
import com.tobeto.ecommercepair5.services.mappers.OrderMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private UserRepository userRepository;

    @Override
    public AddOrderResponse add(AddOrderRequest request) {
        Order order = OrderMapper.INSTANCE.orderFromAddRequest(request);
        Order addedOrder = orderRepository.save(order);

        AddOrderResponse response = OrderMapper.INSTANCE.addResponseFromOrder(addedOrder);

        return response;
    }

    @Override
    public UpdateOrderResponse update(UpdateOrderRequest request) {
        Order order = OrderMapper.INSTANCE.orderFromUpdateRequest(request);
        Order updatedOrder = orderRepository.save(order);

        UpdateOrderResponse response = OrderMapper.INSTANCE.updateResponseFromOrder(updatedOrder);

        return response;
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

        List<ListOrderResponse> response = OrderMapper.INSTANCE.listOrderResponse(orders);

        return response;
    }

    @Override
    public GetOrderResponse getById(int id) {
        Order order = orderRepository.findById(id).orElseThrow();
        User user = userRepository.findById(order.getUser().getId()).orElseThrow();

        GetOrderResponse getOrderResponse = OrderMapper.INSTANCE.getOrderResponse(order, user);

        return getOrderResponse;
    }
}
