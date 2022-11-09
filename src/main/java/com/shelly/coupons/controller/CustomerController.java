package com.shelly.coupons.controller;

import com.shelly.coupons.dto.Customer;
import com.shelly.coupons.exception.ApplicationException;
import com.shelly.coupons.logic.CustomerLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {


    private final CustomerLogic customerLogic;

    @Autowired
    public CustomerController(CustomerLogic customerLogic) {
        this.customerLogic = customerLogic;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) throws ApplicationException {
        return customerLogic.createCustomer(customer);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer)throws ApplicationException {
        customerLogic.updateCustomer(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomer(@PathVariable("id") long id)throws ApplicationException {
        customerLogic.deleteCustomer(id);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") long id)throws ApplicationException {
        return customerLogic.getCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers()throws ApplicationException {
        return customerLogic.getAllCustomers();
    }

}
