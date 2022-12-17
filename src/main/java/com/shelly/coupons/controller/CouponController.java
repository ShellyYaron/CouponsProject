package com.shelly.coupons.controller;

import com.shelly.coupons.dto.Coupon;
import com.shelly.coupons.enums.Category;
import com.shelly.coupons.exception.ApplicationException;
import com.shelly.coupons.logic.CouponLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupons")
public class CouponController {

    private final CouponLogic couponLogic;

    @Autowired
    public CouponController(CouponLogic couponLogic) {
        this.couponLogic = couponLogic;
    }


    @PostMapping
    public long createCompany(@RequestBody Coupon coupon)throws ApplicationException {
        return  couponLogic.createCoupon(coupon);
    }

    @PutMapping
    public void updateCoupon(@RequestBody Coupon coupon)throws ApplicationException {
        couponLogic.updateCoupon(coupon);
    }

    @DeleteMapping("/{id}")
    public void deleteCoupon(@PathVariable("id") long id)throws ApplicationException {
        couponLogic.deleteCoupon(id);
    }

    @GetMapping("/{id}")
    public Coupon getCouponById(@PathVariable("id") long id)throws ApplicationException {
        return couponLogic.getCouponById(id);
    }

    @GetMapping
    public List<Coupon> getCoupons()throws ApplicationException {
        return couponLogic.getCoupons();
    }

    @GetMapping("/category")
    public List<Coupon> getByCategory(@RequestParam("category") Category category) throws ApplicationException {
        return couponLogic.getByCategory(category);
    }

    @GetMapping("/PageAndSort/{pageNumber}/{pageSize}")
    public List<Coupon> sortByParameter(@PathVariable int pageNumber, @PathVariable int pageSize, @RequestParam String parameter) {
        return couponLogic.sortCouponsByParameter(pageNumber, pageSize, parameter);
    }


}
