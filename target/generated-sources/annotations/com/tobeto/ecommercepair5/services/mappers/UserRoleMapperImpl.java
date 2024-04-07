package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.UserRole;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.AddUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.userroles.UpdateUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.AddUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.DeleteUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.GetUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.ListUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userroles.UpdateUserRoleResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-07T21:53:16+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class UserRoleMapperImpl implements UserRoleMapper {

    @Override
    public UserRole userRoleFromAddRequest(AddUserRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        return userRole;
    }

    @Override
    public AddUserRoleResponse addResponseFromUserRole(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        AddUserRoleResponse addUserRoleResponse = new AddUserRoleResponse();

        addUserRoleResponse.setId( userRole.getId() );

        return addUserRoleResponse;
    }

    @Override
    public GetUserRoleResponse getUserRoleResponse(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        GetUserRoleResponse getUserRoleResponse = new GetUserRoleResponse();

        getUserRoleResponse.setId( userRole.getId() );

        return getUserRoleResponse;
    }

    @Override
    public List<ListUserRoleResponse> listUserRoleResponse(List<UserRole> userRoles) {
        if ( userRoles == null ) {
            return null;
        }

        List<ListUserRoleResponse> list = new ArrayList<ListUserRoleResponse>( userRoles.size() );
        for ( UserRole userRole : userRoles ) {
            list.add( userRoleToListUserRoleResponse( userRole ) );
        }

        return list;
    }

    @Override
    public UserRole userRoleFromUpdateRequest(UpdateUserRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        userRole.setId( request.getId() );

        return userRole;
    }

    @Override
    public UpdateUserRoleResponse updateResponseFromUserRole(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        UpdateUserRoleResponse updateUserRoleResponse = new UpdateUserRoleResponse();

        updateUserRoleResponse.setId( userRole.getId() );

        return updateUserRoleResponse;
    }

    @Override
    public DeleteUserRoleResponse deleteResponseFromId(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        DeleteUserRoleResponse deleteUserRoleResponse = new DeleteUserRoleResponse();

        deleteUserRoleResponse.setId( userRole.getId() );

        return deleteUserRoleResponse;
    }

    protected ListUserRoleResponse userRoleToListUserRoleResponse(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        ListUserRoleResponse listUserRoleResponse = new ListUserRoleResponse();

        listUserRoleResponse.setId( userRole.getId() );

        return listUserRoleResponse;
    }
}
