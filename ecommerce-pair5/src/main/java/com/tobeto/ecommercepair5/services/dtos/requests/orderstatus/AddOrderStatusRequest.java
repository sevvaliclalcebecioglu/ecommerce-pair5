package com.tobeto.ecommercepair5.services.dtos.requests.orderstatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderStatusRequest {
    private String status;
}
