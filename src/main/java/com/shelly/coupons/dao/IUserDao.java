package com.shelly.coupons.dao;

import com.shelly.coupons.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<UserEntity, Long> {
    @Query("select u from UserEntity u where u.username = :username and u.password = :password")
    UserEntity login(@Param("username") String username,@Param("password") String password);

}
