package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Elevators;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ElevatorsRepository extends JpaRepository<Elevators, Long> {
    Optional<Elevators> findAllById(long id);
}
