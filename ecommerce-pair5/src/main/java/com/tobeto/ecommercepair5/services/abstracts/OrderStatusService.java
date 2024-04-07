package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.orderstatus.AddOrderStatusRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orderstatus.UpdateOrderStatusRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orderstatus.*;

import java.util.List;

public interface OrderStatusService {
    AddOrderStatusResponse add(AddOrderStatusRequest request);
    UpdateOrderStatusResponse update(UpdateOrderStatusRequest request);
    DeleteOrderStatusResponse delete(int id);
    List<ListOrderStatusResponse> getAll();
    GetOrderStatusResponse getById(int id);
}
