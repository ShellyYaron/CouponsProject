package com.shelly.coupons.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.shelly.coupons.enums.Category;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;
@Entity
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
	@OneToMany (mappedBy = "couponEntity", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	private List <PurchaseEntity> purchaseEntities;
	@Column(name = "category", nullable = false)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(name = "amount", nullable = false)
	private int amount;
	@Column(name = "start_date", nullable = false)
	private Date startDate;
	@Column(name = "end_date", nullable = false)
	private Date endDate;
	@Column (name = "description")
	private String description;


	public CouponEntity() {
	}

	public CouponEntity(long id, String title, float price, CompanyEntity companyEntity, Category category, int amount, Date startDate,
						Date endDate, String description ) {
		this(title, price, companyEntity, category, amount, startDate, endDate, description);
		this.id = id;

	}

	public CouponEntity(String title, float price, CompanyEntity companyEntity, Category category, int amount, Date startDate,
						Date endDate, String description) {
		this.title = title;
		this.price = price;
		this.companyEntity = companyEntity;
		this.category = category;
		this.amount = amount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
	}

	public List<PurchaseEntity> getPurchases() {
		return purchaseEntities;
	}

	public void setPurchases(List<PurchaseEntity> purchaseEntities) {
		this.purchaseEntities = purchaseEntities;
	}

	public int getAmount() {
		return amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}


	public CompanyEntity getCompany() {
		return companyEntity;
	}

	public void setCompany(CompanyEntity companyEntity) {
		this.companyEntity = companyEntity;
	}

	public long getId() {
		return id;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Coupon [id=" + id + ", title=" + title + ", price=" + price + ", company=" + companyEntity.getName() + ", category="
				+ category + ", amount=" + amount + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", description=" + description + "]";
	}

	

}
