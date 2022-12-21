package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Interventions;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface InterventionsRepository extends JpaRepository<Interventions, Long> {
    Optional<Interventions> findAllById(long id);
}
