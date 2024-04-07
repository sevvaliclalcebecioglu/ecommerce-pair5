package com.tobeto.ecommercepair5.services.dtos.responses.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListCategoryResponse {
    private int id;

    private String name;
}