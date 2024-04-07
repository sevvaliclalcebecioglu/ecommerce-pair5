package com.tobeto.ecommercepair5.services.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ListProductResponse {
    private int id;

    private String name;

    private String description;

    private int stock;

    private int unitPrice;
}
