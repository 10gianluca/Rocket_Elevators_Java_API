package net.restapi.springbootbackend.repository;

import net.restapi.springbootbackend.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface CustomersRepository extends JpaRepository<Customers, Long> {
    Optional<Customers> findAllById(long id);
}
