package com.tobeto.ecommercepair5.services.dtos.requests.orderdetails;

import com.tobeto.ecommercepair5.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderDetailRequest {
    private int id;

    private String productId;

    private Order orderId;

    private int quantity;

    private double totalPrice;
}
