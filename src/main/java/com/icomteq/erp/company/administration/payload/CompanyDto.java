package com.icomteq.erp.company.administration.payload;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyDto implements ObjectDto {

	private Integer companyId;
	
	private Integer clientId;
	
	private String companyName;
	
	private String companyUrl;
	
	private String companyIpaddress;
	
	private Integer companyApplianceId;
	
	private String notes;
	
	private int primaryCompanyAdminUserId;
	
	private String primaryCompanyAdminUserFullName;
	
	private String companyLogoImageUrl;
	
	private String companySplashImageUrl;
	
	private String companyCssurl;
	
	private String companyThemeName;
	
	private String companyEmail;
	
	private String companyCountryCode;
	
	private String companyPhoneNo;
	
	private String imsaccessUrl;
	
	private Integer imsaccessGroupId;
	
	private Integer imsaccessClientId;
	
	private Integer imsaccessCaseId;
	
	private String imsaccessCallUrl;
	
	private byte imsaccessFlag;
	
	private int createdByUserId;
	
	private Date createdTimeStamp;
	
	private Integer disabledByUserId;
	
	private Date disabledTimeStamp;
	
	private byte companyStatusFlag;
	
	private String characterSet;

}
