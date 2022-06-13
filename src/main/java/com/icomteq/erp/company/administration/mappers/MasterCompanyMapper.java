package com.icomteq.erp.company.administration.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.icomteq.erp.company.administration.payload.CompanyDto;
import com.icomteq.erp.company.administration.persistence.master.model.MasterCompany;

@Mapper
public interface MasterCompanyMapper {

	MasterCompanyMapper INSTANCE = Mappers.getMapper(MasterCompanyMapper.class);

	@Mapping(source = "companyId", target = "companyId")
	@Mapping(source = "clientId", target = "clientId")
	@Mapping(source = "companyName", target = "companyName")
	@Mapping(source = "companyUrl", target = "companyUrl")
	@Mapping(source = "companyIpaddress", target = "companyIpaddress")
	@Mapping(source = "notes", target = "notes")
	@Mapping(source = "primaryCompanyAdminUserId", target = "primaryCompanyAdminUserId")
	@Mapping(source = "primaryCompanyAdminUserFullName", target = "primaryCompanyAdminUserFullName")
	@Mapping(source = "companyLogoImageUrl", target = "companyLogoImageUrl")
	@Mapping(source = "companySplashImageUrl", target = "companySplashImageUrl")
	@Mapping(source = "companyCssurl", target = "companyCssurl")
	@Mapping(source = "companyThemeName", target = "companyThemeName")
	@Mapping(source = "companyEmail", target = "companyEmail")
	@Mapping(source = "companyCountryCode", target = "companyCountryCode")
	@Mapping(source = "companyPhoneNo", target = "companyPhoneNo")
	@Mapping(source = "imsaccessUrl", target = "imsaccessUrl")
	@Mapping(source = "imsaccessGroupId", target = "imsaccessGroupId")
	@Mapping(source = "imsaccessClientId", target = "imsaccessClientId")
	@Mapping(source = "imsaccessCaseId", target = "imsaccessCaseId")
	@Mapping(source = "imsaccessCallUrl", target = "imsaccessCallUrl")
	@Mapping(source = "imsaccessFlag", target = "imsaccessFlag")
	@Mapping(source = "createdByUserId", target = "createdByUserId")
	@Mapping(source = "createdTimeStamp", target = "createdTimeStamp")
	@Mapping(source = "disabledByUserId", target = "disabledByUserId")
	@Mapping(source = "disabledTimeStamp", target = "disabledTimeStamp")
	@Mapping(source = "companyStatusFlag", target = "companyStatusFlag")
	MasterCompany map(CompanyDto companyDto);

}
