package com.tobeto.ecommercepair5.services.dtos.requests.product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {

    @NotEmpty(message = "Aynı isimle iki ürün eklenemez")
    private String name;

    private int categoryId;

    private String description;

    @PositiveOrZero(message = "Stok miktarı negatif olamaz")
    private int stock;

    @PositiveOrZero(message = "Birim fiyatı 0'dan düşük olamaz.")
    private double unitPrice;

    private LocalDate addedDate;


}
