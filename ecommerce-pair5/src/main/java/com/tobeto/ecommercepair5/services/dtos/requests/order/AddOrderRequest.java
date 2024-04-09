package com.tobeto.ecommercepair5.services.dtos.requests.order;

import com.tobeto.ecommercepair5.entities.OrderStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.FutureOrPresent;
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
public class AddOrderRequest {

    @NotNull
    private int userId;

    @NotNull //siparişin oluşturma tarihi null olmamalı
    @FutureOrPresent // geçmiş bir tarih olmamalı
    private LocalDateTime createdDate;

    @NotNull // siparişin sevk tarihi null olmamalı
    @PastOrPresent //  oluşturma tarihinden önce veya aynı olmalı
    private LocalDateTime shipmentDate;

    //@NotNull // siparişin teslim tarihi null olmamalı
    private LocalDateTime deliveredDate;

    //@NotNull // siparişin iade tarihi null olmamalı
    private LocalDateTime returnedDate;

    @NotNull // sipariş durumu null olmamalı
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
