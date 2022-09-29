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
    private String address;
    private int amountOfChildren;
    private long userId;

    public Customer(CustomerEntity customer){
        this.id = customer.getId();
        this.address = customer.getAddress();
        this.amountOfChildren = customer.getAmountOfChildren();
        this.userId = customer.getUserEntity().getId();
    }

}

