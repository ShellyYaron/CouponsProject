package coupons.dto;

import com.shelly.coupons.entities.CustomerEntity;

public class Customer {
    private long id;
    private String address;
    private int amountOfChildren;
    private long userId;

    public Customer(CustomerEntity customer){
        this.id = customer.getId();
        this.address = customer.getAddress();
        this.amountOfChildren = customer.getAmountOfChildren();
        this.userId = customer.getUser().getId();
    }

    public Customer(long id, String address, int amountOfChildren, long userId) {
        this.id = id;
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.userId = userId;
    }

    public Customer(String address, int amountOfChildren, long userId) {
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.userId = userId;
    }

    public Customer() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfChildren() {
        return amountOfChildren;
    }

    public void setAmountOfChildren(int amountOfChildren) {
        this.amountOfChildren = amountOfChildren;
    }


    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", amountOfChildren=" + amountOfChildren +
                ", userId=" + userId +
                '}';
    }
}

