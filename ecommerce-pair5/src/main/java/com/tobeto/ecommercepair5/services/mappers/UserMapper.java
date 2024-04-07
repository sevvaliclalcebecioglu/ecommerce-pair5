package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.users.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.users.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.AddRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.DeleteUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.GetUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.ListUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.UpdateUserResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userFromAddRequest(AddUserRequest request);

    AddRoleResponse addResponseFromUser(User user);

    GetUserResponse getUserResponse(User user);

    List<ListUserResponse> listUserResponse(List<User> users);

    User userFromUpdateRequest(UpdateUserRequest request);

    UpdateUserResponse updateResponseFromUser(User user);

    @Mapping(target = "id", source = "id")
    DeleteUserResponse deleteResponseFromId(User user);
}
