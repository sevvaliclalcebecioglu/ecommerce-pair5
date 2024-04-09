package com.tobeto.ecommercepair5.services.dtos.requests.order;

import com.tobeto.ecommercepair5.entities.OrderStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
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
    @NotNull
    private int id;

    @PastOrPresent // güncellenen siparişin sevk tarihinin geçmiş veya mevcut bir tarih olması gerektiğini belirtir.
    private LocalDateTime shipmentDate;

    private LocalDateTime deliveredDate;

    private LocalDateTime returnedDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
