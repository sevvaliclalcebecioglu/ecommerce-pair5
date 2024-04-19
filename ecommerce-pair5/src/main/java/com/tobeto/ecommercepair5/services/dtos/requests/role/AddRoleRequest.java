package com.tobeto.ecommercepair5.services.dtos.requests.role;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddRoleRequest {
    @NotEmpty(message = "Role can not be empty.")
    private String EnumRole;
}
