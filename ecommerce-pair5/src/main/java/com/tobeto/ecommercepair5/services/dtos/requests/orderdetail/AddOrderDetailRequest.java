package com.tobeto.ecommercepair5.services.dtos.requests.orderdetail;

import com.tobeto.ecommercepair5.entities.Order;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddOrderDetailRequest {
    @NotNull(message = "You must enter a product id.")
    @Positive // 0'dan büyük bir değere sahip olmalı
    private int productId; // sipariş detayı hangi ürüne ait

    @NotNull(message = "You must enter an order id.")
    @Positive
    private int orderId; // sipariş detayı hangi siparişe ait

    private int quantity; // sipariş detayındaki ürün miktarı

    private double totalPrice; // sipariş detayının toplam fiyatı
}
