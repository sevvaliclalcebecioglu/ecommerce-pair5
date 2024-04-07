package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.UserRole;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.AddUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.UpdateUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    UserRoleMapper INSTANCE = Mappers.getMapper(UserRoleMapper.class);

    UserRole userRoleFromAddRequest(AddUserRoleRequest request);

    AddUserRoleResponse addResponseFromUserRole(UserRole userRole);

    GetUserRoleResponse getUserRoleResponse(UserRole userRole);

    List<ListUserRoleResponse> listUserRoleResponse(List<UserRole> userRoles);

    UserRole userRoleFromUpdateRequest(UpdateUserRoleRequest request);

    UpdateUserRoleResponse updateResponseFromUserRole(UserRole userRole);

    @Mapping(target = "id", source = "id")
    DeleteUserRoleResponse deleteResponseFromId(UserRole userRole);
}
