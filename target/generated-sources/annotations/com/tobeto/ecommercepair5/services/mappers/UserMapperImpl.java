package com.tobeto.ecommercepair5.services.mappers;

import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.services.dtos.requests.user.AddUserRequest;
import com.tobeto.ecommercepair5.services.dtos.requests.user.UpdateUserRequest;
import com.tobeto.ecommercepair5.services.dtos.responses.user.AddUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.user.DeleteUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.user.GetUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.user.ListUserResponse;
import com.tobeto.ecommercepair5.services.dtos.responses.user.UpdateUserResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-04-08T23:53:36+0300",
    comments = "version: 1.6.0.Beta1, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User userFromAddRequest(AddUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );
        if ( request.getBirthDate() != null ) {
            user.setBirthDate( request.getBirthDate().toLocalDate() );
        }

        return user;
    }

    @Override
    public AddUserResponse addResponseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        AddUserResponse addUserResponse = new AddUserResponse();

        addUserResponse.setId( user.getId() );
        if ( user.getBirthDate() != null ) {
            addUserResponse.setBirthDate( user.getBirthDate().atStartOfDay() );
        }
        addUserResponse.setEmail( user.getEmail() );
        addUserResponse.setFirstName( user.getFirstName() );
        addUserResponse.setLastName( user.getLastName() );
        addUserResponse.setPassword( user.getPassword() );

        return addUserResponse;
    }

    @Override
    public User userFromUpdateRequest(UpdateUserRequest request) {
        if ( request == null ) {
            return null;
        }

        User user = new User();

        user.setId( request.getId() );
        user.setFirstName( request.getFirstName() );
        user.setLastName( request.getLastName() );
        user.setEmail( request.getEmail() );
        user.setPassword( request.getPassword() );
        if ( request.getBirthDate() != null ) {
            user.setBirthDate( request.getBirthDate().toLocalDate() );
        }

        return user;
    }

    @Override
    public UpdateUserResponse updateResponseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        UpdateUserResponse updateUserResponse = new UpdateUserResponse();

        updateUserResponse.setId( user.getId() );
        if ( user.getBirthDate() != null ) {
            updateUserResponse.setBirthDate( user.getBirthDate().atStartOfDay() );
        }
        updateUserResponse.setEmail( user.getEmail() );
        updateUserResponse.setFirstName( user.getFirstName() );
        updateUserResponse.setLastName( user.getLastName() );

        return updateUserResponse;
    }

    @Override
    public DeleteUserResponse deleteResponseFromUser(User user) {
        if ( user == null ) {
            return null;
        }

        DeleteUserResponse deleteUserResponse = new DeleteUserResponse();

        deleteUserResponse.setId( user.getId() );
        deleteUserResponse.setEmail( user.getEmail() );
        deleteUserResponse.setFirstName( user.getFirstName() );
        deleteUserResponse.setLastName( user.getLastName() );

        return deleteUserResponse;
    }

    @Override
    public List<ListUserResponse> listResponseFromUser(List<User> users) {
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
    public GetUserResponse getUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        GetUserResponse getUserResponse = new GetUserResponse();

        getUserResponse.setId( user.getId() );
        if ( user.getBirthDate() != null ) {
            getUserResponse.setBirthDate( user.getBirthDate().atStartOfDay() );
        }
        getUserResponse.setEmail( user.getEmail() );
        getUserResponse.setFirstName( user.getFirstName() );
        getUserResponse.setLastName( user.getLastName() );

        return getUserResponse;
    }

    protected ListUserResponse userToListUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        ListUserResponse listUserResponse = new ListUserResponse();

        listUserResponse.setId( user.getId() );
        if ( user.getBirthDate() != null ) {
            listUserResponse.setBirthDate( user.getBirthDate().atStartOfDay() );
        }
        listUserResponse.setEmail( user.getEmail() );
        listUserResponse.setFirstName( user.getFirstName() );
        listUserResponse.setLastName( user.getLastName() );

        return listUserResponse;
    }
}
