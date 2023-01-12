package com.example.PP_3_1_2_Boot_Security_REST.repositories;


import com.example.PP_3_1_2_Boot_Security_REST.models.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
