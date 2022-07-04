package com.shelly.coupons.dao;

import com.shelly.coupons.entities.CompanyEntity;
import org.springframework.data.repository.CrudRepository;

public interface ICompanyDao extends CrudRepository<CompanyEntity, Long> {

}
