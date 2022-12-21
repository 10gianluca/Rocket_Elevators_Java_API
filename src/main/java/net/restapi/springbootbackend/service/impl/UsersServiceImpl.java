package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Users;
import net.restapi.springbootbackend.repository.UsersRepository;
import net.restapi.springbootbackend.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    private UsersRepository usersRepository;

    public UsersServiceImpl(UsersRepository usersRepository) {
        super();
        this.usersRepository = usersRepository;
    }

    @Override
    public Users saveUsers(Users users) {
        return usersRepository.save(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUserById(long id) {
        Optional<Users> users = usersRepository.findAllById(id);
        if (users.isPresent()) {
            return users.get();
        } else {
            throw new ResourceNotFoundException("users", "id", id);
        }
    }


}