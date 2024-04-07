package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.UpdateOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.AddRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.DeleteRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.GetRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.ListRoleResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    Role roleFromAddRequest(AddRoleRequest request);

    AddRoleResponse addResponseFromRole(Role role);

    GetRoleResponse getRoleResponse(Role role);

    List<ListRoleResponse> listRoleResponse(List<Role> roles);

    Role roleFromUpdateRequest(UpdateRoleRequest request);

    UpdateOrderResponse updateResponseFromRole(Role role);

    @Mapping(target = "id", source = "id")
    DeleteRoleResponse deleteResponseFromId(Role role);
}
