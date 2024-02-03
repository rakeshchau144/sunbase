package com.example.customer.service;

import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    CustomerRep customerRep;

    public String addCustomer(Customer customer) {
        try{
           customerRep.save(customer);
           return "Customer detail add successfully .";
        }
        catch (Exception e){
            return e.toString();
        }
    }

    public List<Customer> getAllCustomer() {
        return customerRep.findAll();

    }

    public Optional<Customer> getById(Integer id) {
        return customerRep.findById(id);
    }

    public String deleteById(Integer id) {
        try {
            customerRep.deleteById(id);
            return "Delete successful";
        }catch (Exception e){
            return e.toString();
        }
    }
}
