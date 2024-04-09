package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.entities.UserRole;
import com.tobeto.ecommercepair5.services.dtos.requests.userrole.*;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UserRoleMapper {
    UserRoleMapper INSTANCE= Mappers.getMapper(UserRoleMapper.class);

    @Mapping(target = "role.id" ,source = "roleId")
    @Mapping(target = "user.id" ,source = "userId")
    UserRole userRoleFromAddRequest(AddUserRoleRequest request);

    @Mapping(target = "roleName" ,source = "role.name")
    @Mapping(target = "id" ,source="userRole.id")
    @Mapping(target = "userName" ,source = "user.firstName")
    AddUserRoleResponse addResponseFromUserRole(UserRole userRole, Role role,User user);
    @Mapping(target = "role.id" ,source = "roleId")
    @Mapping(target = "user.id" ,source = "userId")
    UserRole userRoleFromUpdateRequest(UpdateUserRoleRequest request);
    @Mapping(target = "roleName" ,source = "role.name")
    @Mapping(target = "id" ,source="userRole.id")
    @Mapping(target = "userName" ,source = "user.firstName")
    UpdateUserRoleResponse updateResponseFromUserRole(UserRole userRole, Role role, User user);
    @Mapping(target = "id" ,source="id")
    DeleteUserRoleResponse deleteResponseFromUserRole(UserRole userRole);

    List<ListUserRoleResponse> listResponseFromUserRole(List<UserRole> userRoles);
    @Mapping(target = "roleName" ,source = "role.name")
    @Mapping(target = "id" ,source="userRole.id")
    @Mapping(target = "userName" ,source = "user.firstName")
    GetUserRoleResponse getUserRoleResponse(UserRole userRole, Role role, User user);

}
