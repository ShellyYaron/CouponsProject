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

    public static User from(UserEntity userEntity) {
        User user = new User();
        user.setId(userEntity.getId());
        user.setFirstName(userEntity.getFirstName());
        user.setLastName(userEntity.getLastName());
        user.setUsername(userEntity.getUsername());
        user.setPassword(userEntity.getPassword());
        user.setUserType(userEntity.getUserType());
        return user;
    }

}


