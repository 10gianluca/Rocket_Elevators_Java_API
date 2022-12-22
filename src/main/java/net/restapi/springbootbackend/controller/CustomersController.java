package net.restapi.springbootbackend.controller;

import net.restapi.springbootbackend.model.Customers;
import net.restapi.springbootbackend.service.CustomersService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomersController {

    private CustomersService customersService;

    public CustomersController(CustomersService customersService) {
        super();
        this.customersService = customersService;
    }

    //Create Customer
    @PostMapping(value="new")
    public ResponseEntity<Customers> saveCustomers(@RequestBody Customers customers){
        return new ResponseEntity<Customers>(customersService.saveCustomers(customers), HttpStatus.CREATED);
    }


    //Get All Customers
    @GetMapping()
    public List<Customers> getAllCustomers(){
        return customersService.getAllCustomers();
    }

    //Get Customer By ID
    //http://localhost:8080/api/customers/1
    @GetMapping("{id}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable ("id") long id){
        return new ResponseEntity<Customers>(customersService.getCustomerById(id), HttpStatus.OK);
    }



}
