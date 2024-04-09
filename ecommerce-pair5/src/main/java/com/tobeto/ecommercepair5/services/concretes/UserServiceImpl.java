package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.repositories.UserRepository;
import com.tobeto.ecommercepair5.services.abstracts.UserService;
import com.tobeto.ecommercepair5.services.dtos.requests.user.*;
import com.tobeto.ecommercepair5.services.dtos.responses.user.*;
import com.tobeto.ecommercepair5.services.mappers.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    @Override
    public AddUserResponse add(AddUserRequest request) {
        User user= UserMapper.INSTANCE.userFromAddRequest(request);
        user=userRepository.save(user);
        AddUserResponse addUserResponse=UserMapper.INSTANCE.addResponseFromUser(user);
        return addUserResponse;
    }

    @Override
    public UpdateUserResponse update(UpdateUserRequest request) {
        User user= UserMapper.INSTANCE.userFromUpdateRequest(request);
        user=userRepository.save(user);
        UpdateUserResponse updateUserResponse=UserMapper.INSTANCE.updateResponseFromUser(user);
        return updateUserResponse;
    }

    @Override
    public DeleteUserResponse delete(int id) {
        User user=userRepository.findById(id).orElseThrow();
        DeleteUserResponse deleteUserResponse=UserMapper.INSTANCE.deleteResponseFromUser(user);
        userRepository.delete(user);
        return deleteUserResponse;
    }

    @Override
    public List<ListUserResponse> getAll() {
        List<User> users=userRepository.findAll();
        List<ListUserResponse>listUserResponses=UserMapper.INSTANCE.listResponseFromUser(users);

        return listUserResponses;
    }

    @Override
    public GetUserResponse getById(int id) {
        User user=userRepository.findById(id).orElseThrow();
        GetUserResponse getUserResponse=UserMapper.INSTANCE.getUserResponse(user);
        return getUserResponse;
    }
}
