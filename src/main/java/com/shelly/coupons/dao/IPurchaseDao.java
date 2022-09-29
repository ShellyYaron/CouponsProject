package com.shelly.coupons.dao;

import com.shelly.coupons.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPurchaseDao extends JpaRepository<PurchaseEntity, Long> {

}
