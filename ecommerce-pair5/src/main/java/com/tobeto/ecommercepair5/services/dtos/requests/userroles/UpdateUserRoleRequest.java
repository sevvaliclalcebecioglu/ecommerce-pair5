package com.tobeto.ecommercepair5.services.dtos.requests.userroles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRoleRequest {
    private int id;

    private int roleId;

    private int userId;
}
