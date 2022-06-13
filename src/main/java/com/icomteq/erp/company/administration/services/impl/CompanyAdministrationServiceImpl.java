package com.icomteq.erp.company.administration.services.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import com.icomteq.erp.company.administration.database.creation.DatabaseCreateParam;
import com.icomteq.erp.company.administration.mappers.MasterCompanyMapper;
import com.icomteq.erp.company.administration.payload.CompanyDto;
import com.icomteq.erp.company.administration.persistence.master.model.MasterAppliance;
import com.icomteq.erp.company.administration.persistence.master.model.MasterCompany;
import com.icomteq.erp.company.administration.persistence.master.repository.MasterApplianceRepository;
import com.icomteq.erp.company.administration.persistence.master.repository.MasterCompanyRepository;
import com.icomteq.erp.company.administration.services.CompanyAdministrationService;
import com.icomteq.erp.company.administration.services.DatabaseCreatorService;

@Service
@Lazy
public class CompanyAdministrationServiceImpl implements CompanyAdministrationService {

	@Autowired
	MasterCompanyRepository masterCompanyRepository;
	
	@Autowired
	MasterApplianceRepository masterApplianceRepository;
	
	@Autowired
	DatabaseCreatorService databaseCreatorService;
	
	

	@Override
	public CompanyDto createCompany(CompanyDto companyDto) {
		MasterCompany masterCompany = MasterCompanyMapper.INSTANCE.map(companyDto);
		masterCompany.setCreatedTimeStamp(new Date());
		masterCompanyRepository.save(masterCompany);
		companyDto.setCompanyId(masterCompany.getCompanyId());
		MasterAppliance ma = retrieveAppliance(companyDto.getCompanyApplianceId());

		String newDatabaseName = String.format("%010d_erpcompany", masterCompany.getCompanyId()); 
		databaseCreatorService.createDatabase(ma.getIpaddress(), 
				ma.getConnectionUserId(), 
				ma.getConnectionPassword(), 
				ma.getDatabaseName(), 
				null, 
				newDatabaseName, 
				companyDto.getCharacterSet());
		
		
		return companyDto;
	}
	
	private MasterAppliance retrieveAppliance(Integer applianceId) {
		Optional<MasterAppliance> oma = masterApplianceRepository.findById(applianceId);
		MasterAppliance ma = null;
		if(oma.isPresent()) {
			ma = oma.get();
		}
		return ma;
	}

}
