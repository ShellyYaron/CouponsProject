package com.shelly.coupons.dao;

import com.shelly.coupons.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao extends JpaRepository<UserEntity, Long> {


}
