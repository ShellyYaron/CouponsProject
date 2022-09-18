package com.shelly.coupons.beans;

import com.shelly.coupons.entities.CompanyEntity;
import com.shelly.coupons.enums.UserType;

public class UserLoginToken {
    private String token;
    private UserType userType;
    private CompanyEntity companyEntity;

    public UserLoginToken(String token, UserType userType, CompanyEntity companyEntity) {
        this.token = token;
        this.userType = userType;
        this.companyEntity = companyEntity;
    }

    public UserLoginToken() {
    }

    public String getToken() {
        return token;
    }

    public UserType getUserType() {
        return userType;
    }

    public CompanyEntity getCompany() {
        return companyEntity;
    }

    public void setCompany(CompanyEntity companyEntity) {
        this.companyEntity = companyEntity;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

}

