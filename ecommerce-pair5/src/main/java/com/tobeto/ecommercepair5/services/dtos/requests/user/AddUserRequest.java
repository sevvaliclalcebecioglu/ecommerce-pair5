package com.tobeto.ecommercepair5.services.dtos.requests.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddUserRequest {
    private LocalDateTime birthDate;

    private String email;

    private String firstName;

    private String lastName;

    private String password;
}
