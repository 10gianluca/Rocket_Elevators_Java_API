package net.restapi.springbootbackend.service;

import net.restapi.springbootbackend.model.Customers;

import java.util.List;

public interface CustomersService {
    Customers saveCustomers(Customers customers);
    List<Customers> getAllCustomers();
    Customers getCustomerById(long id);
}
