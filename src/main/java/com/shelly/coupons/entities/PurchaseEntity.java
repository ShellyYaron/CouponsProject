package com.shelly.coupons.entities;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "purchases")
public class PurchaseEntity {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private CouponEntity couponEntity;
    @ManyToOne(fetch = FetchType.EAGER)
    private CustomerEntity customerEntity;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "timestamp", nullable = false)
    @CreationTimestamp
    private Timestamp timestamp;

    public PurchaseEntity() {
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public PurchaseEntity(long id, CouponEntity couponEntity, CustomerEntity customerEntity, int amount, Timestamp timestamp) {
        this(couponEntity, customerEntity, amount);
        this.id = id;
        this.timestamp = timestamp;

    }

    public PurchaseEntity(CouponEntity couponEntity, CustomerEntity customerEntity, int amount) {
        this.couponEntity = couponEntity;
        this.customerEntity = customerEntity;
        this.amount = amount;

    }


    public CouponEntity getCoupon() {
        return couponEntity;
    }

    public void setCoupon(CouponEntity couponEntity) {
        this.couponEntity = couponEntity;
    }

    public CustomerEntity getCustomer() {
        return customerEntity;
    }

    public void setCustomer(CustomerEntity customerEntity) {
        this.customerEntity = customerEntity;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public int getAmount() {
        return amount;
    }


    @Override
    public String toString() {
        return "Purchase [id=" + id + ", couponId=" + couponEntity.getTitle() + ", amount=" + amount
                + ", dateTime=" + timestamp + "]";
    }

}
