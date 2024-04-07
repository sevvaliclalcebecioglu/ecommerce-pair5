package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.orderdetails.AddOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetails.UpdateOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetails.*;


import java.util.List;

public interface OrderDetailService {
    AddOrderDetailResponse add(AddOrderDetailRequest request);
    UpdateOrderDetailResponse update(UpdateOrderDetailRequest request);
    DeleteOrderDetailResponse delete(int id);
    List<ListOrderDetailResponse> getAll();
    GetOrderDetailResponse getById(int id);
}
