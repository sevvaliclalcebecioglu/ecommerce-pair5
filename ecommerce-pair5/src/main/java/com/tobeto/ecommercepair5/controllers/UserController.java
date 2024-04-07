package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.UserService;
import com.tobeto.ecommercepair5.services.dtos.requests.users.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.users.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.users.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {

    private UserService userService;

    @GetMapping
    public List<ListUserResponse> getAll()
    {
        return userService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddUserResponse add(@RequestBody @Valid AddUserRequest request)
    {
        return userService.add(request);
    }

    @PutMapping
    public UpdateUserResponse update(@RequestBody @Valid UpdateUserRequest request)
    {
        return userService.update(request);
    }

    @DeleteMapping
    public DeleteUserResponse delete(int id)
    {
        return userService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public GetUserResponse getById(@PathVariable int id)
    {
        return userService.getById(id);
    }
}
