package com.example.customer.controller;

import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("add/customer")
    public String addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    @GetMapping("getAll/customer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }
    @GetMapping("getById/customer/{id}")
    public Optional<Customer> getById(@PathVariable Integer id){
        return customerService.getById(id);
    }
    @DeleteMapping("deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        return customerService.deleteById(id);
    }
}
