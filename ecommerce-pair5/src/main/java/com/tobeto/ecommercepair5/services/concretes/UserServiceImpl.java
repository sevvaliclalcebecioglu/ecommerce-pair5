package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.services.abstracts.UserService;
import com.tobeto.ecommercepair5.services.dtos.requests.users.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.users.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.users.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public AddUserResponse add(AddUserRequest request) {
        return null;
    }

    @Override
    public UpdateUserResponse update(UpdateUserRequest request) {
        return null;
    }

    @Override
    public DeleteUserResponse delete(int id) {
        return null;
    }

    @Override
    public List<ListUserResponse> getAll() {
        return null;
    }

    @Override
    public GetUserResponse getById(int id) {
        return null;
    }
}
