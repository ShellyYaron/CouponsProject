package com.shelly.coupons.dao;

import com.shelly.coupons.dto.Purchase;
import com.shelly.coupons.entities.CustomerEntity;
import com.shelly.coupons.entities.PurchaseEntity;
import org.springframework.data.repository.CrudRepository;

import java.sql.Timestamp;
import java.util.List;

public interface IPurchaseDao extends CrudRepository<PurchaseEntity, Long> {
    List<PurchaseEntity> findById(long purchaseId);
    List<PurchaseEntity> findByCoupon(long purchaseId);
    List<PurchaseEntity> findByCustomer(CustomerEntity customerEntity);
    List<PurchaseEntity> findByAmount(int amount);
    List<Purchase> findByStartDateAfter(Timestamp fromDate);
    List<Purchase> findByStartDateBefore(Timestamp toDate);
}
