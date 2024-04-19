package com.tobeto.ecommercepair5.services.dtos.requests.product;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    @NotNull(message = "You must enter an id.")
    private int id;

    @NotEmpty(message = "Product name cannot be empty.")
    @Size(min = 2, max = 32, message = "Product name must be between 2-32 characters.")
    private String name;

    private int categoryId;

    private String description;

    @PositiveOrZero(message = "Stock quantity cannot be negative")
    private double unitPrice;

    @PositiveOrZero(message = "Stock quantity cannot be negative")
    private int stock;

    private LocalDate addedDate;
}
