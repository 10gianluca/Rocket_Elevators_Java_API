package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Batteries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BatteriesRepository extends JpaRepository<Batteries, Long> {
    Optional<Batteries> findAllById(long id);
}
