package com.tobeto.ecommercepair5.services.dtos.requests.category;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddCategoryRequest {

    @PositiveOrZero
    private int parentId;

    @NotEmpty
    private String name;
}
