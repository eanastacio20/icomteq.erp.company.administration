package com.icomteq.erp.company.administration.enums;

import lombok.Getter;

@Getter
public enum FileSystem {

	LINUX("linux"),
	WINDOWS("windows");
	
	String value;
	
	FileSystem(String value){
		this.value = value;
	}
	
}
