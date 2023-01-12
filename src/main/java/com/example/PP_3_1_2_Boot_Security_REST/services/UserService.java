package com.example.PP_3_1_2_Boot_Security_REST.services;

import com.example.PP_3_1_2_Boot_Security_REST.models.User;

import java.util.List;

public interface UserService {

    boolean save(User user);

    void delete(long id);

    List<User> findAll();

    User findById(long id);

    void update(User user);
}
