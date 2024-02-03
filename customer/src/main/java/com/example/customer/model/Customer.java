package com.example.customer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Customer {
    /*
    "first_name": "Jane",
"last_name": "Doe",
"street": "Elvnu Street",
"address": "H no 2 ",
"city": "Delhi",
"state": "Delhi",
"email": "sam@gmail.com",
"phone": "12345678
*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;
    private String fname;
    private String lname;
    private String street;
    private String address;
    private String city;
    private String state;
    private String email;
    private String phone;
}
