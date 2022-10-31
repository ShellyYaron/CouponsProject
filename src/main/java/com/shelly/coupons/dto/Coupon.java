package com.shelly.coupons.dto;

import com.shelly.coupons.entities.CouponEntity;
import com.shelly.coupons.enums.Category;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.time.LocalDate;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
public class Coupon {
    private long id;
    private long companyId;
    private Category category;
    private String title;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private int amount;
    private float price;

    private String image;

    public Coupon(CouponEntity coupon) {
        this.id = coupon.getId();
        this.companyId = coupon.getCompanyEntity().getId();
        this.category = coupon.getCategory();
        this.title = coupon.getTitle();
        this.description = coupon.getDescription();
        this.startDate = coupon.getStartDate();
        this.endDate = coupon.getEndDate();
        this.amount = coupon.getAmount();
        this.price = coupon.getPrice();
        this.image = coupon.getImage();
    }


}
