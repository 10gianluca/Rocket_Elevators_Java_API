package net.restapi.springbootbackend.service.impl;

import net.restapi.springbootbackend.exception.ResourceNotFoundException;
import net.restapi.springbootbackend.model.Customers;
import net.restapi.springbootbackend.model.Customers;
import net.restapi.springbootbackend.repository.CustomersRepository;
import net.restapi.springbootbackend.service.CustomersService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomersServiceImpl implements CustomersService {
    private CustomersRepository customersRepository;

    public CustomersServiceImpl(CustomersRepository customersRepository) {
        super();
        this.customersRepository = customersRepository;
    }

    @Override
    public Customers saveCustomers(Customers customers) {
        return customersRepository.save(customers);
    }

    @Override
    public List<Customers> getAllCustomers() {
        return customersRepository.findAll();
    }

    @Override
    public Customers getCustomerById(long id) {
        Optional<Customers> customers = customersRepository.findAllById(id);
        if(customers.isPresent()){
            return customers.get();
        }else{
            throw new ResourceNotFoundException("Customer", "id", id);
        }
    }
}
