package com.icomteq.erp.company.administration.payload;

import java.util.List;

import lombok.Data;

@Data
public class CompanyRequestDto {
	
	private Integer clientId;
	private Integer companyId;
	private Integer page;
	private Integer size;
	private String sort;
	List<FilterDto> filters;

}
