package com.tobeto.ecommercepair5.services.dtos.responses.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DeleteUserResponse {
    private int id;

    private String email;

    private String firstName;

    private String lastName;

}
