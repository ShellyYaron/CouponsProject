package com.shelly.coupons.dao;

import com.shelly.coupons.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomerDao extends JpaRepository<CustomerEntity, Long> {
}
