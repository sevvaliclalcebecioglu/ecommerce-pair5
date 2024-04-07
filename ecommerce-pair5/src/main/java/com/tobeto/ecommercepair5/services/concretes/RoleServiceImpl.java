package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.services.abstracts.RoleService;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    @Override
    public AddRoleResponse add(AddRoleRequest request) {
        return null;
    }

    @Override
    public UpdateRoleResponse update(UpdateRoleRequest request) {
        return null;
    }

    @Override
    public DeleteRoleResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListRoleResponse> getAll() {
        return null;
    }

    @Override
    public GetRoleResponse getById(int id) {
        return null;
    }
}
