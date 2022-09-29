package com.shelly.coupons.dao;

import com.shelly.coupons.entities.CompanyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICompanyDao extends JpaRepository<CompanyEntity, Long> {

}
