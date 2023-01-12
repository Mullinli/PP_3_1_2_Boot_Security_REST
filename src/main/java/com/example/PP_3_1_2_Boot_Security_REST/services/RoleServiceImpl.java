package com.example.PP_3_1_2_Boot_Security_REST.services;

import com.example.PP_3_1_2_Boot_Security_REST.models.Role;
import com.example.PP_3_1_2_Boot_Security_REST.repositories.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> showRoles() {
        return (List<Role>) roleRepository.findAll();
    }
}
