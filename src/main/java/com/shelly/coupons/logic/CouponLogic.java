package com.shelly.coupons.logic;

import com.shelly.coupons.dao.ICouponDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponLogic {

    @Autowired
    private ICouponDao couponDao;


}
