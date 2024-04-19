package com.tobeto.ecommercepair5.services.dtos.responses.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductResponse {
    private int id;

    private String name;

    private String categoryName;

    private String description;

    private double unitPrice;

    private int stock;

    private LocalDate addedDate;
}
