package com.shelly.coupons.dto;

import com.shelly.coupons.enums.UserType;


public class User {

    private int id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private long companyId;
    private UserType userType;

    public User() {
    }

    public User(String username, String password, String firstName, String lastName, long companyId, UserType userType) {
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(long companyId) {
        this.companyId = companyId;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public User(int userId, String username, String password, String firstName, String lastName, long companyId, UserType userType) {
        this.id = userId;
        this.username = username;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyId = companyId;
        this.userType = userType;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + id +
                ", userName='" + username + '\'' +
                ", userPassword='" + password + '\'' +
                ", userFirstName='" + firstName + '\'' +
                ", userLastName='" + lastName + '\'' +
                ", companyId=" + companyId +
                ", userType=" + userType +
                '}';
    }
}


