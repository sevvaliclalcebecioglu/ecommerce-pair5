package com.tobeto.ecommercepair5.services.dtos.requests.orderdetail;

import com.tobeto.ecommercepair5.entities.Order;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderDetailRequest {
    @NotNull
    private int id;
    @NotNull
    private int productId;
    @NotNull
    private int orderId;
    private int quantity;
    private double totalPrice;
}
