package com.tobeto.ecommercepair5.services.dtos.requests.products;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProductRequest {

    @NotBlank
    private String name;

    private int categoryId;

    private String description;

    private int stock;

    private int unitPrice;

}
