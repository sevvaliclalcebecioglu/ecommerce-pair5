package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.UserRoleService;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.AddUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.UpdateUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/userRoles")
@AllArgsConstructor
public class UserRolesController {

    private UserRoleService userRoleService;

    @GetMapping
    public List<ListUserRoleResponse> getAll()
    {
        return userRoleService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddUserRoleResponse add(@RequestBody @Valid AddUserRoleRequest request)
    {
        return userRoleService.add(request);
    }

    @PutMapping
    public UpdateUserRoleResponse update(@RequestBody @Valid UpdateUserRoleRequest request)
    {
        return userRoleService.update(request);
    }

    @DeleteMapping
    public DeleteUserRoleResponse delete(int id)
    {
        return userRoleService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public GetUserRoleResponse getById(@PathVariable int id)
    {
        return userRoleService.getById(id);
    }
}
