package com.shelly.coupons.entities;

import com.shelly.coupons.dto.User;
import com.shelly.coupons.enums.UserType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@RequiredArgsConstructor
@Setter
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "username", unique = true, nullable = false)
    private String username;
    @Column(name = "password", nullable = false)
    private String password;


    @Column(name = "user_type", nullable = false)
    @Enumerated(EnumType.STRING)
    private UserType userType;

    public UserEntity(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.username = user.getUsername();
        this.password = user.getPassword();
        this.userType = user.getUserType();
    }
    
    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", passwordHash=" + password +
                ", userType=" + userType +
                '}';
    }
}
