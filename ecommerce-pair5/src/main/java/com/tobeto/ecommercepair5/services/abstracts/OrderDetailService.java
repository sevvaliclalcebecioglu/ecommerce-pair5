package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.AddOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.orderdetail.UpdateOrderDetailRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orderdetail.*;


import java.util.List;


public interface OrderDetailService {
    AddOrderDetailResponse add(AddOrderDetailRequest request);
    UpdateOrderDetailResponse update(UpdateOrderDetailRequest request);
    DeleteOrderDetailResponse delete(int id);
    List<ListOrderDetailResponse> getAll();
    GetOrderDetailResponse getById(int id);
}
