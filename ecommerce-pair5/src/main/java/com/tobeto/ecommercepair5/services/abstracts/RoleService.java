package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.role.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.role.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.role.*;

import java.util.List;

public interface RoleService {
    AddRoleResponse add(AddRoleRequest request);
    UpdateRoleResponse update(UpdateRoleRequest request);
    DeleteRoleResponse delete(int id);
    List<ListRoleResponse> getAll();
    GetRoleResponse getById(int id);
}
