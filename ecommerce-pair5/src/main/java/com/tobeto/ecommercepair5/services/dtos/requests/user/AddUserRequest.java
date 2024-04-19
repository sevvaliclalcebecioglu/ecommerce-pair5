package com.tobeto.ecommercepair5.services.dtos.requests.user;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
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

    @Email(message = "You must enter a valid email.")
    private String email;

    @NotEmpty(message = "First Name cannot be empty.")
    @Size(min = 2, max = 32, message = "First Name must be between 2-32 characters.")
    private String firstName;

    @NotEmpty(message = "Last Name cannot be empty.")
    @Size(min = 2, max = 32, message = "Last Name must be between 2-32 characters.")
    private String lastName;

    @NotEmpty(message = "Password cannot be empty.")
    private String password;
}
