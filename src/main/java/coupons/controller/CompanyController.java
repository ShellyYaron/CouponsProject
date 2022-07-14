package coupons.controller;

import com.shelly.coupons.dto.Company;
import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.logic.CompanyLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {


    private final CompanyLogic companyLogic;

    @Autowired
    public CompanyController(CompanyLogic companyLogic) {
        this.companyLogic = companyLogic;
    }

    @PostMapping
    public long createCompany(@RequestBody Company company) {
        return companyLogic.createCompany(company);
    }

    @PutMapping
    public void updateCompany(@RequestBody UserEntity company) {
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable("id") long id) {
        return companyLogic.getCompanyById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCompany(@PathVariable("id") long id) {
        companyLogic.deleteCompany(id);
    }
}
