package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.roles.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.*;

import java.util.List;

public interface RoleService {
    AddRoleResponse add(AddRoleRequest request);
    UpdateRoleResponse update(UpdateRoleRequest request);
    DeleteRoleResponse delete(int id);
    List<ListRoleResponse> getAll();
    GetRoleResponse getById(int id);
}
