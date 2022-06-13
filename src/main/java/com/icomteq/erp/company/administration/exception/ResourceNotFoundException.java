package com.icomteq.erp.company.administration.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	private String resourceName;
	private String fieldName;
	private Long fieldLongValue;
	private Integer fieldIntValue;
	private String fieldStrValue;
	
	public ResourceNotFoundException(String resourceName, String fieldName, Long fieldLongValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldLongValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldLongValue = fieldLongValue;
	}

	
	public ResourceNotFoundException(String resourceName, String fieldName, String fieldStrValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldStrValue)); 
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldStrValue = fieldStrValue;
	}

	public ResourceNotFoundException(String resourceName, String fieldName, Integer fieldIntValue) {
		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldIntValue)); 
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldIntValue = fieldIntValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}

	public String getFieldName() {
		return fieldName;
	}

	public Long getFieldLongValue() {
		return fieldLongValue;
	}

	public String getFieldStrValue() {
		return fieldStrValue;
	}
	
	public Integer getFieldIntValue() {
		return fieldIntValue;
	}
}
