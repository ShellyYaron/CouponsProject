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


    public CouponEntity(Coupon coupon) {
        this.id = coupon.getId();
        this.title = coupon.getTitle();
        this.price = coupon.getPrice();
        this.category = coupon.getCategory();
        this.amount = coupon.getAmount();
        this.startDate = coupon.getStartDate();
        this.endDate = coupon.getEndDate();
        this.description = coupon.getDescription();
    }

    public CouponEntity(long id, String title, float price, com.shelly.coupons.entities.CompanyEntity companyEntity, Category category, int amount, LocalDate startDate,
                        LocalDate endDate, String description) {
        this(title, price, companyEntity, category, amount, startDate, endDate, description);
        this.id = id;

    }

    public CouponEntity(String title, float price, com.shelly.coupons.entities.CompanyEntity companyEntity, Category category, int amount, LocalDate startDate,
                        LocalDate endDate, String description) {
        this.title = title;
        this.price = price;
        this.companyEntity = companyEntity;
        this.category = category;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
    }

}
