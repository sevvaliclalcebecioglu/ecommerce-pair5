package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Order;
import com.tobeto.ecommercepair5.entities.OrderDetail;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.repositories.OrderDetailRepository;
import com.tobeto.ecommercepair5.repositories.OrderRepository;
import com.tobeto.ecommercepair5.repositories.ProductRepository;
import com.tobeto.ecommercepair5.services.abstracts.OrderDetailService;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.AddOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.UpdateOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.*;
import com.tobeto.ecommercepair5.services.mappers.OrderDetailMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderDetailServiceImpl implements OrderDetailService {
    private OrderDetailRepository orderDetailRepository;
    private ProductRepository productRepository;
    private OrderRepository orderRepository;

    @Override
    public AddOrderDetailResponse add(AddOrderDetailRequest request) {
        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.orderDetailFromAddRequest(request);
        OrderDetail addedOrderDetail = orderDetailRepository.save(orderDetail);

        Product product = productRepository.findById(addedOrderDetail.getProduct().getId()).orElseThrow();

        Order order = orderRepository.findById(orderDetail.getOrder().getId()).orElseThrow();

        AddOrderDetailResponse response = OrderDetailMapper.INSTANCE.addResponseFromOrderDetail(addedOrderDetail, product, order);

        return response;
    }

    @Override
    public UpdateOrderDetailResponse update(UpdateOrderDetailRequest request) {
        OrderDetail orderDetail = OrderDetailMapper.INSTANCE.orderDetailFromUpdateRequest(request);
        OrderDetail updatedOrderDetail = orderDetailRepository.save(orderDetail);

        Product product = productRepository.findById(updatedOrderDetail.getProduct().getId()).orElseThrow();

        Order order = orderRepository.findById(orderDetail.getOrder().getId()).orElseThrow();

        UpdateOrderDetailResponse response = OrderDetailMapper.INSTANCE.updateResponseFromOrderDetail(updatedOrderDetail, product, order);

        return response;
    }

    @Override
    public DeleteOrderDetailResponse delete(int id) {
        OrderDetail orderDetail = orderDetailRepository.findById(id).orElseThrow();

        DeleteOrderDetailResponse deleteOrderDetailResponse = OrderDetailMapper.INSTANCE.deleteResponseFromId(orderDetail);

        orderDetailRepository.delete(orderDetail);

        return deleteOrderDetailResponse;
    }

    @Override
    public List<ListOrderDetailResponse> getAll() {
        List<OrderDetail> orderDetails = orderDetailRepository.findAll();
        List<ListOrderDetailResponse> response = OrderDetailMapper.INSTANCE.listOrderDetailResponse(orderDetails);

        return response;
    }

    @Override
    public GetOrderDetailResponse getById(int id) {
        OrderDetail orderDetail = orderDetailRepository.findById(id).orElseThrow();

        Product product = productRepository.findById(orderDetail.getProduct().getId()).orElseThrow();

        Order order = orderRepository.findById(orderDetail.getOrder().getId()).orElseThrow();

        GetOrderDetailResponse response = OrderDetailMapper.INSTANCE.getOrderDetailResponse(orderDetail, product, order);

        return response;
    }
}
