package com.tobeto.ecommercepair5.services.dtos.requests.category;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {

    @NotNull(message = "You must enter an id.")
    private Integer id;

    @PositiveOrZero(message = "parentId must be higher than 0.")
    private Integer parentId;

    @NotEmpty(message = "Category name cannot be empty.")
    @Size(min = 2, max = 32, message = "Category name must be between 2-32 characters.")
    private String name;
}
