package com.tobeto.ecommercepair5.services.dtos.responses.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListProductResponse {

    public ListProductResponse(int id, String name, String description, double unitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public ListProductResponse(int id, String categoryName, String name, String description, double unitPrice) {
        this.id = id;
        this.categoryName = categoryName;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    private int id;

    private String categoryName;

    private String name;

    private String description;

    private double unitPrice;

    private int stock;

    private LocalDate addedDate;
}
