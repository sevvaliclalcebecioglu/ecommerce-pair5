package com.tobeto.ecommercepair5.services.dtos.responses.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryResponse {
    private int id;

    private String name;

    private String parentName;
}
