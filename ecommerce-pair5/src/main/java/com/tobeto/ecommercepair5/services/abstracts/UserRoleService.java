package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.userrole.AddUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.userrole.UpdateUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.*;

import java.util.List;

public interface UserRoleService {
    AddUserRoleResponse add(AddUserRoleRequest request);
    UpdateUserRoleResponse update(UpdateUserRoleRequest request);
    DeleteUserRoleResponse delete(int id);
    List<ListUserRoleResponse> getAll();
    GetUserRoleResponse getById(int id);
}
