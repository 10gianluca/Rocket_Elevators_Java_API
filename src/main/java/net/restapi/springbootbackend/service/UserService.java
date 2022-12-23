package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    List<User> getAllUser();

    User getUserById(long id);

}