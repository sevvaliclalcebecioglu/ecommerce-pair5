package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.role.*;
import com.tobeto.ecommercepair5.services.dtos.responses.role.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
@Mapper
public interface RoleMapper {
    RoleMapper INSTANCE= Mappers.getMapper(RoleMapper.class);
    Role roleFromAddRequest(AddRoleRequest request);
    AddRoleResponse addResponseFromRole(Role role);
    Role roleFromUpdateRequest(UpdateRoleRequest request);
    UpdateRoleResponse updateResponseFromRole(Role role);
    @Mapping(target = "id" ,source="id")
    DeleteRoleResponse deleteResponseFromRole(Role role);
    List<ListRoleResponse> listResponseFromRole(List<Role> roles);
    GetRoleResponse getRoleResponse(Role role);
}
