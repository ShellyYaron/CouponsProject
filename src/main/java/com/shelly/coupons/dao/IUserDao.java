package com.shelly.coupons.dao;

import com.shelly.coupons.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDao extends JpaRepository<UserEntity, Long> {


}
