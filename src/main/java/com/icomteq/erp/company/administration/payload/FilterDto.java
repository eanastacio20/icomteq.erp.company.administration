package com.icomteq.erp.company.administration.payload;

import lombok.Data;

@Data
public class FilterDto {

	private String fieldName;
	private String filterOperator;
	private String fieldValue;
	
}
