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
public class DeleteProductResponse {
    private int id;

    private String name;

    private String description;

    private int stock;

    private double unitPrice;

    private LocalDate addedDate;

}
