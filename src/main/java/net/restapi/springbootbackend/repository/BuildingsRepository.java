package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Buildings;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface BuildingsRepository extends JpaRepository<Buildings, Long> {
    Optional<Buildings> findAllById(long id);
}
