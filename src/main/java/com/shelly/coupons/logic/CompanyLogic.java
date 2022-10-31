package com.shelly.coupons.logic;

import com.shelly.coupons.dao.ICompanyDao;
import com.shelly.coupons.dto.Company;
import com.shelly.coupons.entities.CompanyEntity;
import com.shelly.coupons.exception.ApplicationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyLogic {

    private final ICompanyDao companyDao;

    @Autowired
    public CompanyLogic(ICompanyDao companyDao) {
        this.companyDao = companyDao;
    }


    public long createCompany(Company company) throws ApplicationException {
        //validations

        CompanyEntity companyEntity = new CompanyEntity(company);
        companyDao.save(companyEntity);
        return company.getId();
    }

    public void updateCompany(Company company) throws ApplicationException {
        CompanyEntity companyEntity = new CompanyEntity(company);
        companyDao.save(companyEntity);
    }

    public Company getCompanyById(long id) throws ApplicationException {
        CompanyEntity companyEntity = companyDao.findById(id).get();
        Company company = new Company(companyEntity);
        return company;
    }

    public void deleteCompany(long id) throws ApplicationException {
        companyDao.deleteById(id);
    }

}
