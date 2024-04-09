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
public class ListProductResponse {
    private int id;

    public ListProductResponse(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //private String categoryName;

    private String name;

    private String description;

    private int stock;

    private int unitPrice;

    private LocalDate addedDate;
}
