package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Category;
import com.tobeto.ecommercepair5.entities.Product;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.user.*;
import com.tobeto.ecommercepair5.services.dtos.responses.user.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE= Mappers.getMapper(UserMapper.class);
    User userFromAddRequest(AddUserRequest request);
    AddUserResponse addResponseFromUser(User user);
    User userFromUpdateRequest(UpdateUserRequest request);
    UpdateUserResponse updateResponseFromUser(User user);
    @Mapping(target = "id" ,source="id")
    DeleteUserResponse deleteResponseFromUser(User user);
    List<ListUserResponse> listResponseFromUser(List<User> users);
    GetUserResponse getUserResponse(User user);

}
