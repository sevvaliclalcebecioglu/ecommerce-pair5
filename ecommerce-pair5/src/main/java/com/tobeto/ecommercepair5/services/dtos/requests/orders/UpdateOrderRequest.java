package com.tobeto.ecommercepair5.services.dtos.requests.orders;

import com.tobeto.ecommercepair5.entities.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderRequest {
    private int id;

    private LocalDateTime date;

    private OrderStatus status;
}
