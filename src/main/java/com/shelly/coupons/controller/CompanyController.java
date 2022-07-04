package com.shelly.coupons.controller;

import com.shelly.coupons.entities.CompanyEntity;
import com.shelly.coupons.entities.UserEntity;
import com.shelly.coupons.logic.CompanyLogic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
	
	@Autowired
	private CompanyLogic companyLogic;
	
	@PostMapping
	public void createCompany(@RequestBody CompanyEntity company) {
		companyLogic.createCompany(company);
	}
	
	@PutMapping
	public void updateCompany(@RequestBody UserEntity company) {
	}
	
	@GetMapping("/{id}")
	public CompanyEntity getCompany(@PathVariable("id") long id) {
		return companyLogic.getCompany(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCompany(@PathVariable("id") long id) {
		companyLogic.deleteCompany(id);
	}
}
