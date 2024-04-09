package com.tobeto.ecommercepair5.services.dtos.responses.order;

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
public class AddOrderResponse {
    private int id;

    private int userId;

    private LocalDateTime createdDate;

    private LocalDateTime shipmentDate;

    private LocalDateTime deliveredDate;

    private LocalDateTime returnedDate;

    private OrderStatus status;
}
