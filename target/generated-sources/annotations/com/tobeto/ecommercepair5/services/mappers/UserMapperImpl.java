package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.users.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.users.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.roles.AddRoleResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.DeleteUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.GetUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.ListUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.users.UpdateUserResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-07T21:09:10+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userFromAddRequest(AddUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setFirsName( request.getFirsName() );
        user.setLastName( request.getLastName() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );

        return user;
    }

    @Override
    public AddRoleResponse addResponseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        AddRoleResponse addRoleResponse = new AddRoleResponse();

        addRoleResponse.setId( user.getId() );

        return addRoleResponse;
    }

    @Override
    public GetUserResponse getUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        GetUserResponse getUserResponse = new GetUserResponse();

        getUserResponse.setId( user.getId() );
        getUserResponse.setEmail( user.getEmail() );
        getUserResponse.setFirsName( user.getFirsName() );
        getUserResponse.setLastName( user.getLastName() );

        return getUserResponse;
    }

    @Override
    public List<ListUserResponse> listUserResponse(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<ListUserResponse> list = new ArrayList<ListUserResponse>( users.size() );
        for ( User user : users ) {
            list.add( userToListUserResponse( user ) );
        }

        return list;
    }

    @Override
    public User userFromUpdateRequest(UpdateUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setId( request.getId() );
        user.setFirsName( request.getFirsName() );
        user.setLastName( request.getLastName() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );

        return user;
    }

    @Override
    public UpdateUserResponse updateResponseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        UpdateUserResponse updateUserResponse = new UpdateUserResponse();

        updateUserResponse.setId( user.getId() );
        updateUserResponse.setEmail( user.getEmail() );
        updateUserResponse.setFirsName( user.getFirsName() );
        updateUserResponse.setLastName( user.getLastName() );

        return updateUserResponse;
    }

    @Override
    public DeleteUserResponse deleteResponseFromId(User user) {
        if ( user == null ) {
            return null;
        }

        DeleteUserResponse deleteUserResponse = new DeleteUserResponse();

        deleteUserResponse.setId( user.getId() );
        deleteUserResponse.setEmail( user.getEmail() );
        deleteUserResponse.setFirsName( user.getFirsName() );
        deleteUserResponse.setLastName( user.getLastName() );

        return deleteUserResponse;
    }

    protected ListUserResponse userToListUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        ListUserResponse listUserResponse = new ListUserResponse();

        listUserResponse.setId( user.getId() );
        listUserResponse.setEmail( user.getEmail() );
        listUserResponse.setFirsName( user.getFirsName() );
        listUserResponse.setLastName( user.getLastName() );

        return listUserResponse;
    }
}
