package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.order.AddOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.order.UpdateOrderRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.order.*;


import java.util.List;

public interface OrderService {
    AddOrderResponse add(AddOrderRequest request);
    UpdateOrderResponse update(UpdateOrderRequest request);
    DeleteOrderResponse delete(int id);
    List<ListOrderResponse> getAll();
    GetOrderResponse getById(int id);
}
