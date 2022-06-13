package com.icomteq.erp.company.administration.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icomteq.erp.company.administration.payload.CompanyDto;
import com.icomteq.erp.company.administration.services.CompanyAdministrationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/companyadministration")
public class CompanyAdministrationController {
	
	@Autowired
	@Lazy
	CompanyAdministrationService companyAdministrationService; 
	
	@PostMapping("/createcompany")
	public CompanyDto createCompany(@RequestBody CompanyDto companyDto) {
		return companyAdministrationService.createCompany(companyDto);
	}

}
