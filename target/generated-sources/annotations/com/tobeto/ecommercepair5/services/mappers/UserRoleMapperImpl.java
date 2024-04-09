package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.entities.UserRole;
import com.tobeto.ecommercepair5.services.dtos.requests.userrole.AddUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.userrole.UpdateUserRoleRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.AddUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.DeleteUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.GetUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.ListUserRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.UpdateUserRoleResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-08T23:53:36+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class UserRoleMapperImpl implements UserRoleMapper {

    @Override
    public UserRole userRoleFromAddRequest(AddUserRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        userRole.setRole( addUserRoleRequestToRole( request ) );
        userRole.setUser( addUserRoleRequestToUser( request ) );

        return userRole;
    }

    @Override
    public AddUserRoleResponse addResponseFromUserRole(UserRole userRole, Role role, User user) {
        if ( userRole == null && role == null && user == null ) {
            return null;
        }

        AddUserRoleResponse addUserRoleResponse = new AddUserRoleResponse();

        if ( userRole != null ) {
            addUserRoleResponse.setId( userRole.getId() );
        }
        if ( role != null ) {
            addUserRoleResponse.setRoleName( role.getName() );
        }
        if ( user != null ) {
            addUserRoleResponse.setUserName( user.getFirstName() );
        }

        return addUserRoleResponse;
    }

    @Override
    public UserRole userRoleFromUpdateRequest(UpdateUserRoleRequest request) {
        if ( request == null ) {
            return null;
        }

        UserRole userRole = new UserRole();

        userRole.setRole( updateUserRoleRequestToRole( request ) );
        userRole.setUser( updateUserRoleRequestToUser( request ) );
        userRole.setId( request.getId() );

        return userRole;
    }

    @Override
    public UpdateUserRoleResponse updateResponseFromUserRole(UserRole userRole, Role role, User user) {
        if ( userRole == null && role == null && user == null ) {
            return null;
        }

        UpdateUserRoleResponse updateUserRoleResponse = new UpdateUserRoleResponse();

        if ( userRole != null ) {
            updateUserRoleResponse.setId( userRole.getId() );
        }
        if ( role != null ) {
            updateUserRoleResponse.setRoleName( role.getName() );
        }
        if ( user != null ) {
            updateUserRoleResponse.setUserName( user.getFirstName() );
        }

        return updateUserRoleResponse;
    }

    @Override
    public DeleteUserRoleResponse deleteResponseFromUserRole(UserRole userRole) {
        if ( userRole == null ) {
            return null;
        }

        DeleteUserRoleResponse deleteUserRoleResponse = new DeleteUserRoleResponse();

        deleteUserRoleResponse.setId( userRole.getId() );

        return deleteUserRoleResponse;
    }

    @Override
    public List<ListUserRoleResponse> listResponseFromUserRole(List<UserRole> userRoles) {
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
    public GetUserRoleResponse getUserRoleResponse(UserRole userRole, Role role, User user) {
        if ( userRole == null && role == null && user == null ) {
            return null;
        }

        GetUserRoleResponse getUserRoleResponse = new GetUserRoleResponse();

        if ( userRole != null ) {
            getUserRoleResponse.setId( userRole.getId() );
        }
        if ( role != null ) {
            getUserRoleResponse.setRoleName( role.getName() );
        }
        if ( user != null ) {
            getUserRoleResponse.setUserName( user.getFirstName() );
        }

        return getUserRoleResponse;
    }

    protected Role addUserRoleRequestToRole(AddUserRoleRequest addUserRoleRequest) {
        if ( addUserRoleRequest == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( addUserRoleRequest.getRoleId() );

        return role;
    }

    protected User addUserRoleRequestToUser(AddUserRoleRequest addUserRoleRequest) {
        if ( addUserRoleRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( addUserRoleRequest.getUserId() );

        return user;
    }

    protected Role updateUserRoleRequestToRole(UpdateUserRoleRequest updateUserRoleRequest) {
        if ( updateUserRoleRequest == null ) {
            return null;
        }

        Role role = new Role();

        role.setId( updateUserRoleRequest.getRoleId() );

        return role;
    }

    protected User updateUserRoleRequestToUser(UpdateUserRoleRequest updateUserRoleRequest) {
        if ( updateUserRoleRequest == null ) {
            return null;
        }

        User user = new User();

        user.setId( updateUserRoleRequest.getUserId() );

        return user;
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
