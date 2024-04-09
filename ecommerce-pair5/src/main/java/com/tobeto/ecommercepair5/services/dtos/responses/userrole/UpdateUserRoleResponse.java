package com.tobeto.ecommercepair5.services.dtos.responses.userrole;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserRoleResponse {
    private int id;
    private String roleName;
    private String userName;

}
