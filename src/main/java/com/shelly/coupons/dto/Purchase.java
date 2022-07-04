package com.shelly.coupons.dto;

import java.sql.Timestamp;

public class Purchase {
    private int id;
    private int customerId;
    private int couponId;
    private int amount;
    private Timestamp timestamp;

    public Purchase(int id, int customerId, int couponId, int amount, Timestamp timestamp) {
        this.id = id;
        this.customerId = customerId;
        this.couponId = couponId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Purchase(int customerId, int couponId, int amount, Timestamp timestamp) {
        this.customerId = customerId;
        this.couponId = couponId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Purchase() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "purchaseId=" + id +
                ", customerId=" + customerId +
                ", couponId=" + couponId +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
