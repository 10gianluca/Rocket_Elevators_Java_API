package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findAllById(long id);
    Optional<User> findByEmail(String email);
}