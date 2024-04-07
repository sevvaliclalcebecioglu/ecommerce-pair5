package com.tobeto.ecommercepair5.services.dtos.responses.orderstatus;

import com.tobeto.ecommercepair5.entities.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListOrderStatusResponse {
    private int id;
    private OrderStatus status;
}
