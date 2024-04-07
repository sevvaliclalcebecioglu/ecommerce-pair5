package com.tobeto.ecommercepair5.services.dtos.responses.orderdetails;

import com.tobeto.ecommercepair5.entities.Order;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderDetailResponse {
    private int id;

    private String productName;

    private Order order;

    private int quantity;

    private double totalPrice;
}
