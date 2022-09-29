package com.shelly.coupons.dto;

import com.shelly.coupons.entities.CompanyEntity;
import lombok.*;

@RequiredArgsConstructor
@Setter
@Getter
@ToString
@Data
public class Company {
    private long id;
    private String name;
    private String phoneNumber;
    private String address;

    public Company(CompanyEntity company) {
        this.id = company.getId();
        this.name = company.getName();
        this.phoneNumber = company.getPhoneNumber();
        this.address = company.getAddress();
    }

}
