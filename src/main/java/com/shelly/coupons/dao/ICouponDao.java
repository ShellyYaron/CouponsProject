package com.shelly.coupons.dao;

import com.shelly.coupons.dto.Coupon;
import com.shelly.coupons.entities.CouponEntity;
import com.shelly.coupons.enums.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;
@Repository
public interface ICouponDao extends JpaRepository<CouponEntity, Long> {
    @Transactional
    @Modifying
    @Query("delete from CouponEntity c where c.endDate <= ?1")
    void deleteByEndDateLessThan(Date endDate);

    List<CouponEntity> findByCategory(String category);

    @Query("SELECT c FROM CouponEntity c WHERE c.category= :category")
    List<Coupon> getByCategory(@Param("category") Category category);
}

