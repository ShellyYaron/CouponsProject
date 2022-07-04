package com.shelly.coupons.dao;

import com.shelly.coupons.entities.CouponEntity;
import com.shelly.coupons.enums.Category;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface ICouponDao extends CrudRepository<CouponEntity, Long> {

    void deleteByEndDateLessThan (Date todayDate);

    void deleteByCompanyId(long companyId);

    List<CouponEntity> findByCompanyId (long companyId);

    List<CouponEntity> findByCategoryAndCompanyId (Category category , long companyId);

    List<CouponEntity> findByPriceLessThanAndCompanyId (float price, long companyId);
}

