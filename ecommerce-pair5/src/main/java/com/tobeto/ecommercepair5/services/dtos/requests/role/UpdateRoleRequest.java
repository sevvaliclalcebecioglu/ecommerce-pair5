package com.tobeto.ecommercepair5.services.dtos.requests.role;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRoleRequest {
    @NotNull
    private int id;

    private String EnumRole;
}
