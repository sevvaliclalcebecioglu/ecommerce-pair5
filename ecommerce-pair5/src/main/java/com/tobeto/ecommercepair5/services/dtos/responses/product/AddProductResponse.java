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
public class AddProductResponse {
    private int id;

    private String categoryName;

    private String name;

    private String description;

    private int stock;

    private int unitPrice;

    private LocalDate addedDate;

}
