package com.shelly.coupons.dao;

import com.shelly.coupons.dto.Coupon;
import com.shelly.coupons.entities.CouponEntity;
import com.shelly.coupons.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICouponDao extends JpaRepository<CouponEntity, Long> {

    List<CouponEntity> findByCategory(String category);

    @Query("SELECT c FROM CouponEntity c WHERE c.category= :category")
    List<Coupon> getByCategory(@Param("category") Category category);
}

