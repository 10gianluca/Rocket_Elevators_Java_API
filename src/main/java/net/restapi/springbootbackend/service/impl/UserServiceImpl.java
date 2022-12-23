package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.User;
import net.restapi.springbootbackend.repository.UserRepository;
import net.restapi.springbootbackend.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(long id) {
        Optional<User> user = userRepository.findAllById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new ResourceNotFoundException("users", "id", id);
        }
    }


}