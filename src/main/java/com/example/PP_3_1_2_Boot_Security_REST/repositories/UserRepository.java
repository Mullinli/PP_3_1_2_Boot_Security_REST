package com.example.PP_3_1_2_Boot_Security_REST.repositories;

import com.example.PP_3_1_2_Boot_Security_REST.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username")
    Optional<User> getUserByUsername(@Param("username") String username);
}
