package com.tobeto.ecommercepair5.services.dtos.requests;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    @NotNull
    private int id;

    private int categoryName;

    private String name;

    private String description;

    private int stock;

    private int unitPrice;

}
