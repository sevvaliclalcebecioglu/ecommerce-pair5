package com.tobeto.ecommercepair5.services.concretes;

import com.tobeto.ecommercepair5.entities.Role;
import com.tobeto.ecommercepair5.repositories.RoleRepository;
import com.tobeto.ecommercepair5.services.abstracts.RoleService;
import com.tobeto.ecommercepair5.services.dtos.requests.role.*;
import com.tobeto.ecommercepair5.services.dtos.responses.role.*;

import com.tobeto.ecommercepair5.services.mappers.RoleMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class RoleServiceImpl implements RoleService {
    private RoleRepository roleRepository;

    @Override
    public AddRoleResponse add(AddRoleRequest request) {
        Role role= RoleMapper.INSTANCE.roleFromAddRequest(request);
        role=roleRepository.save(role);
        AddRoleResponse addRoleResponse=RoleMapper.INSTANCE.addResponseFromRole(role);
        return addRoleResponse;
    }

    @Override
    public UpdateRoleResponse update(UpdateRoleRequest request) {
        Role role=RoleMapper.INSTANCE.roleFromUpdateRequest(request);
        role=roleRepository.save(role);
        UpdateRoleResponse updateRoleResponse=RoleMapper.INSTANCE.updateResponseFromRole(role);
        return updateRoleResponse;
    }

    @Override
    public DeleteRoleResponse delete(int id) {
        Role role=roleRepository.findById(id).orElseThrow();
        DeleteRoleResponse deleteRoleResponse=RoleMapper.INSTANCE.deleteResponseFromRole(role);
        roleRepository.delete(role);
        return deleteRoleResponse;
    }

    @Override
    public List<ListRoleResponse> getAll() {
        List<Role> roles=roleRepository.findAll();
        List<ListRoleResponse> listRoleResponses=RoleMapper.INSTANCE.listResponseFromRole(roles);
        return listRoleResponses;
    }

    @Override
    public GetRoleResponse getById(int id) {
        Role role=roleRepository.findById(id).orElseThrow();
        GetRoleResponse getRoleResponse=RoleMapper.INSTANCE.getRoleResponse(role);
        return getRoleResponse;
    }
}
