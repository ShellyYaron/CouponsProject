package com.shelly.coupons.entities;


import com.shelly.coupons.dto.Coupon;
import com.shelly.coupons.enums.Category;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@RequiredArgsConstructor
@Setter
@Table(name = "coupons")
public class CouponEntity {
    @Id
    @GeneratedValue
    private long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Column(name = "price", nullable = false)
    private float price;
    @ManyToOne
    private CompanyEntity companyEntity;
    @OneToMany(mappedBy = "couponEntity", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    private List<PurchaseEntity> purchaseEntities;
    @Column(name = "category", nullable = false)
    @Enumerated(EnumType.STRING)
    private Category category;
    @Column(name = "amount", nullable = false)
    private int amount;
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;
    @Column(name = "description")
    private String description;

    @Column(name = "image_url")
    private String image;


    public CouponEntity(Coupon coupon) {
        this.id = coupon.getId();
        this.title = coupon.getTitle();
        this.price = coupon.getPrice();
        this.category = coupon.getCategory();
        this.amount = coupon.getAmount();
        this.startDate = coupon.getStartDate();
        this.endDate = coupon.getEndDate();
        this.description = coupon.getDescription();
        this.image = coupon.getImage();
    }

    public static CouponEntity from(Coupon coupon) {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setId(coupon.getId());
        couponEntity.setTitle(coupon.getTitle());
        couponEntity.setPrice(coupon.getPrice());
        couponEntity.setCategory(coupon.getCategory());
        couponEntity.setAmount(coupon.getAmount());
        couponEntity.setStartDate(coupon.getStartDate());
        couponEntity.setEndDate(coupon.getEndDate());
        couponEntity.setDescription(coupon.getDescription());
        couponEntity.setImage(coupon.getImage());
        return couponEntity;
    }
}
