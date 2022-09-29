package com.shelly.coupons.entities;

import com.shelly.coupons.dto.Purchase;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@RequiredArgsConstructor
@Setter
@Table(name = "purchases")
public class PurchaseEntity {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private CouponEntity couponEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    private com.shelly.coupons.entities.CustomerEntity customerEntity;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    public PurchaseEntity(Purchase purchase) {
        this.id = purchase.getId();
        this.amount = purchase.getAmount();
        this.timestamp = purchase.getTimestamp();
    }

    @Override
    public String toString() {
        return "PurchaseEntity{" +
                "id=" + id +
                ", couponEntity=" + couponEntity +
                ", customerEntity=" + customerEntity +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
