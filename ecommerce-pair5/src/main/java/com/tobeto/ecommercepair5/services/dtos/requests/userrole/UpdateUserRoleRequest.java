package com.tobeto.ecommercepair5.services.dtos.requests.userrole;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRoleRequest {
    @NotNull
    private int id;

    private int roleId;

    private int userId;
}
