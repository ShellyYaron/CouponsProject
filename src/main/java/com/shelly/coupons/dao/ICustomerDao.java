package com.shelly.coupons.dao;

import com.shelly.coupons.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICustomerDao extends JpaRepository<CustomerEntity, Long> {
}
