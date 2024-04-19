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

    @NotEmpty(message = "Product name cannot be empty.")
    private String name;

    private int categoryId;

    private String description;

    @PositiveOrZero(message = "Stock quantity cannot be negative")
    private double unitPrice;

    @PositiveOrZero(message = "Stock quantity cannot be negative")
    private int stock;

    private LocalDate addedDate;
}
