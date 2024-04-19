package com.tobeto.ecommercepair5.services.dtos.requests.orderstatus;

import com.tobeto.ecommercepair5.entities.OrderStatus;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateOrderStatusRequest {
    @NotNull(message = "You must enter an id.")
    private int id;
    private OrderStatus status;
}
