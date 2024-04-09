package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.entities.User;
import com.tobeto.ecommercepair5.entities.UserRole;
import com.tobeto.ecommercepair5.repositories.RoleRepository;
import com.tobeto.ecommercepair5.repositories.UserRepository;
import com.tobeto.ecommercepair5.repositories.UserRoleRepository;
import com.tobeto.ecommercepair5.services.abstracts.UserRoleService;
import com.tobeto.ecommercepair5.services.dtos.requests.userrole.*;
import com.tobeto.ecommercepair5.services.dtos.responses.userrole.*;
import com.tobeto.ecommercepair5.services.mappers.UserRoleMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
    private UserRoleRepository userRoleRepository;
    private UserRepository userRepository;
    private RoleRepository roleRepository;
    @Override
    public AddUserRoleResponse add(AddUserRoleRequest request) {
        UserRole userRole= UserRoleMapper.INSTANCE.userRoleFromAddRequest(request);
        userRole=userRoleRepository.save(userRole);

        Role role=roleRepository.findById(userRole.getUser().getId()).orElseThrow();
        User user=userRepository.findById(userRole.getRole().getId()).orElseThrow();
        AddUserRoleResponse addUserRoleResponse=UserRoleMapper.INSTANCE.addResponseFromUserRole(userRole,role,user);

        return addUserRoleResponse;
    }

    @Override
    public UpdateUserRoleResponse update(UpdateUserRoleRequest request) {
        UserRole userRole= UserRoleMapper.INSTANCE.userRoleFromUpdateRequest(request);
        userRole=userRoleRepository.save(userRole);

        Role role=roleRepository.findById(userRole.getUser().getId()).orElseThrow();
        User user=userRepository.findById(userRole.getRole().getId()).orElseThrow();
        UpdateUserRoleResponse updateUserRoleResponse=UserRoleMapper.INSTANCE.updateResponseFromUserRole(userRole,role,user);

        return updateUserRoleResponse;
    }

    @Override
    public DeleteUserRoleResponse delete(int id) {
        UserRole userRole=userRoleRepository.findById(id).orElseThrow();
        DeleteUserRoleResponse deleteUserRoleResponse=UserRoleMapper.INSTANCE.deleteResponseFromUserRole(userRole);
        userRoleRepository.delete(userRole);
        return deleteUserRoleResponse;
    }

    @Override
    public List<ListUserRoleResponse> getAll() {
        List<UserRole> userRoles=userRoleRepository.findAll();
        List<ListUserRoleResponse> responses = UserRoleMapper.INSTANCE.listResponseFromUserRole(userRoles);

        return responses;
    }

    @Override
    public GetUserRoleResponse getById(int id) {
        UserRole userRole=userRoleRepository.findById(id).orElseThrow();
        Role role=roleRepository.findById(userRole.getUser().getId()).orElseThrow();
        User user=userRepository.findById(userRole.getRole().getId()).orElseThrow();
        GetUserRoleResponse getUserRoleResponse=UserRoleMapper.INSTANCE.getUserRoleResponse(userRole,role,user);

        return getUserRoleResponse;
    }
}
