package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.users.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.users.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.users.*;

import java.util.List;

public interface UserService {
    AddUserResponse add(AddUserRequest request);
    UpdateUserResponse update(UpdateUserRequest request);
    DeleteUserResponse delete(int id);
    List<ListUserResponse> getAll();
    GetUserResponse getById(int id);
}
