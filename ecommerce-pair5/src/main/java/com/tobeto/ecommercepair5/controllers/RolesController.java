package com.tobeto.ecommercepair5.controllers;

import com.tobeto.ecommercepair5.services.abstracts.RoleService;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
@AllArgsConstructor
public class RolesController {

    private RoleService roleService;

    @GetMapping
    public List<ListRoleResponse> getAll()
    {
        return roleService.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public AddRoleResponse add(@RequestBody @Valid AddRoleRequest request)
    {
        return roleService.add(request);
    }

    @PutMapping
    public UpdateRoleResponse update(@RequestBody @Valid UpdateRoleRequest request)
    {
        return roleService.update(request);
    }

    @DeleteMapping
    public DeleteRoleResponse delete(int id)
    {
        return roleService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public GetRoleResponse getById(@PathVariable int id)
    {
        return roleService.getById(id);
    }
}