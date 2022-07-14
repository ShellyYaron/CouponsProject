package coupons.entities;

import com.shelly.coupons.dto.Purchase;
import com.shelly.coupons.entities.CouponEntity;
import com.shelly.coupons.entities.CustomerEntity;

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
    private com.shelly.coupons.entities.CustomerEntity customerEntity;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    public PurchaseEntity() {
    }

    public PurchaseEntity(Purchase purchase) {
        this.id = purchase.getId();
        this.amount = purchase.getAmount();
        this.timestamp = purchase.getTimestamp();
    }

    public PurchaseEntity(long id, CouponEntity couponEntity, com.shelly.coupons.entities.CustomerEntity customerEntity, int amount, Timestamp timestamp) {
        this(couponEntity, customerEntity, amount);
        this.id = id;
        this.timestamp = timestamp;

    }

    public PurchaseEntity(CouponEntity couponEntity, com.shelly.coupons.entities.CustomerEntity customerEntity, int amount) {
        this.couponEntity = couponEntity;
        this.customerEntity = customerEntity;
        this.amount = amount;

    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public CouponEntity getCoupon() {
        return couponEntity;
    }

    public void setCoupon(CouponEntity couponEntity) {
        this.couponEntity = couponEntity;
    }

    public com.shelly.coupons.entities.CustomerEntity getCustomer() {
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
        return "PurchaseEntity{" +
                "id=" + id +
                ", couponEntity=" + couponEntity +
                ", customerEntity=" + customerEntity +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                '}';
    }
}
