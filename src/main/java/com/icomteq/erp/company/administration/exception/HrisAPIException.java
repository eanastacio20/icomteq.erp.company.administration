package com.icomteq.erp.company.administration.exception;

import org.springframework.http.HttpStatus;

@SuppressWarnings("serial")
public class HrisAPIException extends RuntimeException {

	private HttpStatus status;
	private String message;

	public HrisAPIException(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}
	public HrisAPIException(String message, HttpStatus status, String message1) {
		super(message);
		this.status = status;
		this.message = message1;
	}
	
	public HttpStatus getStatus() {
		return status;
	}
	
	public String getMessage() {
		return message;
	}
}
