package coupons.entities;


import com.shelly.coupons.dto.Company;
import com.shelly.coupons.entities.CouponEntity;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "companies")
public class CompanyEntity {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "address", nullable = false)
	private String address;
	
	@Column(name = "phone_number", nullable = false)
	private String phoneNumber;

	@OneToMany (mappedBy = "companyEntity",cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
	private List <CouponEntity> couponEntities;

	public CompanyEntity() {
	}

	public CompanyEntity(String name, String address, String phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	public CompanyEntity(long id, String name, String address, String phoneNumber) {
		this(name, address, phoneNumber);
		this.id = id;

	}

    public CompanyEntity(Company company) {
		this.id = company.getId();
		this.name = company.getName();
		this.address = company.getAddress();
		this.phoneNumber = company.getPhoneNumber();
    }

    public List<CouponEntity> getCoupons() {
		return couponEntities;
	}

	public void setCoupons(List<CouponEntity> couponEntities) {
		this.couponEntities = couponEntities;
	}

	public void setId(long id) {
		this.id = id;
	}

		public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "CompanyEntity{" +
				"id=" + id +
				", name='" + name + '\'' +
				", address='" + address + '\'' +
				", phoneNumber='" + phoneNumber + '\'' +
				", couponEntities=" + couponEntities +
				'}';
	}
}
