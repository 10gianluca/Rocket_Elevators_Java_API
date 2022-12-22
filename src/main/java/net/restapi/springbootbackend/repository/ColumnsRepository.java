package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Columns;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface ColumnsRepository extends JpaRepository<Columns, Long> {
    Optional<Columns> findAllById(long id);
}
