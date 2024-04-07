package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.roles.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.orders.UpdateOrderResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.AddRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.DeleteRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.GetRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.ListRoleResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-07T19:27:18+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role roleFromAddRequest(AddRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        Role role = new Role();

        role.setName( request.getName() );

        return role;
    }

    @Override
    public AddRoleResponse addResponseFromRole(Role role) {
        if ( role == null ) {
            return null;
        }

        AddRoleResponse addRoleResponse = new AddRoleResponse();

        addRoleResponse.setId( role.getId() );
        addRoleResponse.setName( role.getName() );

        return addRoleResponse;
    }

    @Override
    public GetRoleResponse getRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        GetRoleResponse getRoleResponse = new GetRoleResponse();

        getRoleResponse.setId( role.getId() );
        getRoleResponse.setName( role.getName() );

        return getRoleResponse;
    }

    @Override
    public List<ListRoleResponse> listRoleResponse(List<Role> roles) {
        if ( roles == null ) {
            return null;
        }

        List<ListRoleResponse> list = new ArrayList<ListRoleResponse>( roles.size() );
        for ( Role role : roles ) {
            list.add( roleToListRoleResponse( role ) );
        }

        return list;
    }

    @Override
    public Role roleFromUpdateRequest(UpdateRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( request.getId() );
        role.setName( request.getName() );

        return role;
    }

    @Override
    public UpdateOrderResponse updateResponseFromRole(Role role) {
        if ( role == null ) {
            return null;
        }

        UpdateOrderResponse updateOrderResponse = new UpdateOrderResponse();

        updateOrderResponse.setId( role.getId() );

        return updateOrderResponse;
    }

    @Override
    public DeleteRoleResponse deleteResponseFromId(Role role) {
        if ( role == null ) {
            return null;
        }

        DeleteRoleResponse deleteRoleResponse = new DeleteRoleResponse();

        deleteRoleResponse.setId( role.getId() );
        deleteRoleResponse.setName( role.getName() );

        return deleteRoleResponse;
    }

    protected ListRoleResponse roleToListRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        ListRoleResponse listRoleResponse = new ListRoleResponse();

        listRoleResponse.setId( role.getId() );
        listRoleResponse.setName( role.getName() );

        return listRoleResponse;
    }
}
