package com.shelly.coupons.logic;

import com.shelly.coupons.dao.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerLogic {

    @Autowired
    private ICustomerDao customerDao;


}
