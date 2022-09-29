package com.shelly.coupons.dto;

import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.enums.UserType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class User {

    private long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private UserType userType;

    public User(UserEntity user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.userType = user.getUserType();
    }

}


