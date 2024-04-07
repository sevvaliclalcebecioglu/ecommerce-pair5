package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.services.abstracts.UserRoleService;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.AddUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.UpdateUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
    @Override
    public AddUserRoleResponse add(AddUserRoleRequest request) {
        return null;
    }

    @Override
    public UpdateUserRoleResponse update(UpdateUserRoleRequest request) {
        return null;
    }

    @Override
    public DeleteUserRoleResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListUserRoleResponse> getAll() {
        return null;
    }

    @Override
    public GetUserRoleResponse getById(int id) {
        return null;
    }
}
