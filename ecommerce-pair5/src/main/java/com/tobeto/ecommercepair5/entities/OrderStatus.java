package com.tobeto.ecommercepair5.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum OrderStatus {
    CREATED,
    SHIPMENT,
    DELIVERED,
    RETURNED
}
