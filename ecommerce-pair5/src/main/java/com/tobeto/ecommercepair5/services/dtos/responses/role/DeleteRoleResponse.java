package com.tobeto.ecommercepair5.services.dtos.responses.role;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteRoleResponse {
    private int id;

    private String name;
}
