package com.shelly.coupons.entities;

import com.shelly.coupons.dto.Customer;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "customers")
public class CustomerEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "amount_of_children", nullable = false)
    private int amountOfChildren;
    @Column(name = "address", nullable = false)
    private String address;

    @OneToMany(mappedBy = "customerEntity", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<PurchaseEntity> purchaseEntities;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @MapsId
    private UserEntity userEntity;

    public CustomerEntity() {
    }

    public CustomerEntity(Customer customer) {
        this.id = customer.getId();
        this.amountOfChildren = customer.getAmountOfChildren();
        this.address = customer.getAddress();
    }

    public CustomerEntity(long id, int amountOfChildren, String address, UserEntity userEntity) {
        this.id = id;
        this.amountOfChildren = amountOfChildren;
        this.address = address;
        this.userEntity = userEntity;
    }

    public CustomerEntity(int amountOfChildren, String address, UserEntity userEntity) {
        this.amountOfChildren = amountOfChildren;
        this.address = address;
        this.userEntity = userEntity;
    }

    public List<PurchaseEntity> getPurchases() {
        return purchaseEntities;
    }

    public void setPurchases(List<PurchaseEntity> purchaseEntities) {
        this.purchaseEntities = purchaseEntities;
    }


    public void setId(long id) {
        this.id = id;
    }

    public void setUser(UserEntity userEntity) {
        this.userEntity = userEntity;
    }


    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public UserEntity getUser() {
        return userEntity;
    }


    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", amountOfChildren=" + amountOfChildren +
                ", address='" + address + '\'' +
                ", purchaseEntities=" + purchaseEntities +
                ", userEntity=" + userEntity +
                '}';
    }
}
