package coupons.dto;

import com.shelly.coupons.entities.PurchaseEntity;

import java.sql.Timestamp;

public class Purchase {
    private long id;
    private long customerId;
    private long couponId;
    private int amount;
    private Timestamp timestamp;

    public Purchase(PurchaseEntity purchase) {
        this.id = purchase.getId();
        this.customerId = purchase.getCustomer().getId();
        this.couponId = purchase.getCoupon().getId();
        this.amount = purchase.getAmount();
        this.timestamp = purchase.getTimestamp();
    }


    public Purchase(long id, long customerId, long couponId, int amount, Timestamp timestamp) {
        this.id = id;
        this.customerId = customerId;
        this.couponId = couponId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Purchase(long customerId, long couponId, int amount, Timestamp timestamp) {
        this.customerId = customerId;
        this.couponId = couponId;
        this.amount = amount;
        this.timestamp = timestamp;
    }

    public Purchase() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getCouponId() {
        return couponId;
    }

    public void setCouponId(long couponId) {
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
