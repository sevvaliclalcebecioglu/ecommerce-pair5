package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.services.dtos.requests.role.AddRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.role.UpdateRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.role.AddRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.role.DeleteRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.role.GetRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.role.ListRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.role.UpdateRoleResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-08T23:53:36+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class RoleMapperImpl implements RoleMapper {

    @Override
    public Role roleFromAddRequest(AddRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        Role role = new Role();

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
    public Role roleFromUpdateRequest(UpdateRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( request.getId() );

        return role;
    }

    @Override
    public UpdateRoleResponse updateResponseFromRole(Role role) {
        if ( role == null ) {
            return null;
        }

        UpdateRoleResponse updateRoleResponse = new UpdateRoleResponse();

        updateRoleResponse.setId( role.getId() );
        updateRoleResponse.setName( role.getName() );

        return updateRoleResponse;
    }

    @Override
    public DeleteRoleResponse deleteResponseFromRole(Role role) {
        if ( role == null ) {
            return null;
        }

        DeleteRoleResponse deleteRoleResponse = new DeleteRoleResponse();

        deleteRoleResponse.setId( role.getId() );
        deleteRoleResponse.setName( role.getName() );

        return deleteRoleResponse;
    }

    @Override
    public List<ListRoleResponse> listResponseFromRole(List<Role> roles) {
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
    public GetRoleResponse getRoleResponse(Role role) {
        if ( role == null ) {
            return null;
        }

        GetRoleResponse getRoleResponse = new GetRoleResponse();

        getRoleResponse.setId( role.getId() );
        getRoleResponse.setName( role.getName() );

        return getRoleResponse;
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
