package com.tobeto.ecommercepair5.services.dtos.responses.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserResponse {
    private int id;

    private LocalDateTime birthDate;

    private String email;

    private String firstName;

    private String lastName;

    private String password;
}
