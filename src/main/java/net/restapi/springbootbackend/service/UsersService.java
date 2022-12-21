package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Users;

import java.util.List;

public interface UsersService {
    Users saveUsers(Users users);

    List<Users> getAllUsers();

    Users getUserById(long id);

}