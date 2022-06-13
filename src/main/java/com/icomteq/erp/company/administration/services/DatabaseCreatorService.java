package com.icomteq.erp.company.administration.services;

public interface DatabaseCreatorService {

	void createDatabase(String host, String username, String password, String dbTemplate,
			String dumpFileDestination, String newDatabaseName, String characterSet);
	
}
