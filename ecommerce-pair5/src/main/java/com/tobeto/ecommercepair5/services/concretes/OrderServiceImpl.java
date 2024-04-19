package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.OrderDetail;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.repositories.OrderDetailRepository;
import com.tobeto.ecommercepair5.repositories.OrderRepository;
import com.tobeto.ecommercepair5.repositories.ProductRepository;
import com.tobeto.ecommercepair5.repositories.UserRepository;
import com.tobeto.ecommercepair5.services.abstracts.OrderService;
import com.tobeto.ecommercepair5.services.dtos.requests.order.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.order.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.AddOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.order.*;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.AddOrderDetailResponse;
import com.tobeto.ecommercepair5.services.mappers.OrderDetailMapper;
import com.tobeto.ecommercepair5.services.mappers.OrderMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private OrderDetailRepository orderDetailRepository;
    private ProductRepository productRepository;
    private UserRepository userRepository;

    @Override
    public AddOrderResponse add(AddOrderRequest request) {
        Order order = OrderMapper.INSTANCE.orderFromAddRequest(request);
        Order addedOrder = orderRepository.save(order);
        boolean isStockEnough = isStockEnough(request.getOrderDetails());
        List<AddOrderDetailResponse> addOrderDetailResponses = new ArrayList<>();

        if (!isStockEnough) {
            throw new RuntimeException("Not enough product in stock.");
        }

        for (AddOrderDetailRequest addOrderDetailRequest : request.getOrderDetails()) {
            Product product = productRepository.findById(addOrderDetailRequest.getProductId()).orElseThrow();
            OrderDetail orderDetail = OrderDetailMapper.INSTANCE.orderDetailFromAddRequestForOrder(addOrderDetailRequest, addedOrder);
            orderDetailRepository.save(orderDetail);
            AddOrderDetailResponse addOrderDetailResponse = OrderDetailMapper.INSTANCE.addResponseFromOrderDetail(orderDetail, product, order);
            addOrderDetailResponses.add(addOrderDetailResponse);

            product.setStock(product.getStock() - addOrderDetailRequest.getQuantity());
            productRepository.save(product);
        }

        AddOrderResponse response = OrderMapper.INSTANCE.addResponseFromOrder(addedOrder);
        response.setOrderDetailResponseList(addOrderDetailResponses);

        return response;
    }

    private boolean isStockEnough(List<AddOrderDetailRequest> orderDetails) {
        for (AddOrderDetailRequest addOrderDetailRequest : orderDetails) {
            Product product = productRepository.findById(addOrderDetailRequest.getProductId()).orElseThrow();

            if (product.getStock() - addOrderDetailRequest.getQuantity() < 0) {
                return false;
            }
        }

        return true;
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
