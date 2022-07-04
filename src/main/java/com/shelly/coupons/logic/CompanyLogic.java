package com.shelly.coupons.logic;

import com.shelly.coupons.dao.ICompanyDao;
import com.shelly.coupons.entities.CompanyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
public class CompanyLogic {

	@Autowired
	private ICompanyDao companyDao;
	
	public long createCompany(CompanyEntity company) {
		companyDao.save(company);
		return company.getId();
	}

	public CompanyEntity getCompany(long id) {
		CompanyEntity company = companyDao.findById(id).get();
		return company;
	}

	public void deleteCompany(long id) {
		CompanyEntity company = getCompany(id);
		companyDao.delete(company);
	}

}
