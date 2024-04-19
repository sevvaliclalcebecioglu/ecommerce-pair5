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
public class AddUserRoleRequest {
    @NotNull(message = "You must enter a role id.")
    private int roleId;

    @NotNull(message = "You must enter a user id.")
    private int userId;
}
