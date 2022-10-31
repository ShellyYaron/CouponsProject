package com.shelly.coupons.logic;

import com.shelly.coupons.dao.ICustomerDao;
import com.shelly.coupons.dto.Customer;
import com.shelly.coupons.entities.CustomerEntity;
import com.shelly.coupons.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerLogic {


    private final ICustomerDao customerDao;

    @Autowired
    public CustomerLogic(ICustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public long createCustomer(Customer customer) throws ApplicationException {
        CustomerEntity customersEntity = new CustomerEntity(customer);
        customerDao.save(customersEntity);
        return customersEntity.getId();
    }

    public void updateCustomer(Customer customer) throws ApplicationException{
        CustomerEntity customersEntity = new CustomerEntity(customer);
        customerDao.save(customersEntity);
    }

    public void deleteCustomer(long id)throws ApplicationException {
        customerDao.deleteById(id);
    }

    public Customer getCustomerById(long id)throws ApplicationException {
        CustomerEntity customersEntity = customerDao.findById(id).get();
        Customer customer = new Customer(customersEntity);
        return customer;
    }

    public List<Customer> getAllCustomers() throws ApplicationException{
        List<Customer> customerList = new ArrayList<>();
        Iterable<CustomerEntity> customersIterable = customerDao.findAll();
        for (CustomerEntity customersEntity : customersIterable) {
            Customer customer = new Customer(customersEntity);
            customerList.add(customer);
        }
        return customerList;
    }

}
