package com.shelly.coupons.dto;

public class Customer {
    private int id;
    private String address;
    private int amountOfChildren;
    private String phoneNumber;
    private long userId;

    public Customer(int id, String address, int amountOfChildren, String phoneNumber, long userId) {
        this.id = id;
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
    }

    public Customer(String address, int amountOfChildren, String phoneNumber, long userId) {
        this.address = address;
        this.amountOfChildren = amountOfChildren;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
                ", phoneNumber='" + phoneNumber + '\'' +
                ", userId=" + userId +
                '}';
    }
}

