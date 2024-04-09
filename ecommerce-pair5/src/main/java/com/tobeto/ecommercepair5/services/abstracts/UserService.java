package com.tobeto.ecommercepair5.services.abstracts;

import com.tobeto.ecommercepair5.services.dtos.requests.user.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.user.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.user.*;

import java.util.List;

public interface UserService {
    AddUserResponse add(AddUserRequest request);
    UpdateUserResponse update(UpdateUserRequest request);
    DeleteUserResponse delete(int id);
    List<ListUserResponse> getAll();
    GetUserResponse getById(int id);
}
