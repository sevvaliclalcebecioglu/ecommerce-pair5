package com.tobeto.ecommercepair5.services.dtos.requests.userrole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRoleRequest {
    private int roleId;

    private int userId;
}
