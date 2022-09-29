package com.shelly.coupons.dto;

import com.shelly.coupons.entities.PurchaseEntity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Purchase {
    private long id;
    private long customerId;
    private long couponId;
    private int amount;
    private Timestamp timestamp;

    public Purchase(PurchaseEntity purchase) {
        this.id = purchase.getId();
        this.customerId = purchase.getCustomerEntity().getId();
        this.couponId = purchase.getCouponEntity().getId();
        this.amount = purchase.getAmount();
        this.timestamp = purchase.getTimestamp();
    }

}
