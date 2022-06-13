package com.icomteq.erp.company.administration.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrimaryCompanyAdminUser {

	private Integer userId;
	private String userFullName;
	
}