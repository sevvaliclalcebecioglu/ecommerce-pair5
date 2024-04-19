package com.tobeto.ecommercepair5.services.dtos.requests.userrole;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRoleRequest {
    @NotNull(message = "You must enter an id.")
    private int id;

    @NotNull(message = "You must enter a role id.")
    private int roleId;

    @NotNull(message = "You must enter a user id.")
    private int userId;
}
