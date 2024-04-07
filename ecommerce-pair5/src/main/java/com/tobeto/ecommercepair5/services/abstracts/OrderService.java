package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.orders.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orders.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.*;


import java.util.List;

public interface OrderService {
    AddOrderResponse add(AddOrderRequest request);
    UpdateOrderResponse update(UpdateOrderRequest request);
    DeleteOrderResponse delete(int id);
    List<ListOrderResponse> getAll();
    GetOrderResponse getById(int id);
}
