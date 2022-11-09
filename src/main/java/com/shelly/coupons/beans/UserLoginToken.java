package com.shelly.coupons.beans;

import com.shelly.coupons.dto.User;
import com.shelly.coupons.entities.CompanyEntity;
import com.shelly.coupons.enums.UserType;

public class UserLoginToken {
    private String token;
    private User user;

    public UserLoginToken(String token, User user) {
        this.token = token;
        this.user = user;
    }

    public UserLoginToken() {
    }

    public String getToken() {
        return token;
    }

    public User getUser() {
        return user;
    }


    public void setToken(String token) {
        this.token = token;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

