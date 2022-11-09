package com.shelly.coupons.dto;

import com.shelly.coupons.entities.CustomerEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Customer {
    private long id;

    private User user;
    private String address;
    private int amountOfChildren;

    public static Customer from(CustomerEntity customerEntity){
        Customer customer = new Customer();
        customer.setId(customerEntity.getId());
        customer.setAddress(customerEntity.getAddress());
        customer.setAmountOfChildren(customerEntity.getAmountOfChildren());
        customer.setUser(User.from(customerEntity.getUserEntity()));
        return customer;
    }

}

