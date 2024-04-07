package com.tobeto.ecommercepair5.services.dtos.responses.userroles;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRoleResponse {
    private int id;

    private int roleId;

    private int userId;
}
