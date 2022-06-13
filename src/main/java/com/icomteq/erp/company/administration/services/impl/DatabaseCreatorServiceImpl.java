package com.icomteq.erp.company.administration.services.impl;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.icomteq.erp.company.administration.configuration.ISIHrisApplicationProperties;
import com.icomteq.erp.company.administration.database.creation.DatabaseCreateParam;
import com.icomteq.erp.company.administration.database.creation.DatabaseCreator;
import com.icomteq.erp.company.administration.enums.FileSystem;
import com.icomteq.erp.company.administration.services.DatabaseCreatorService;

@Service
@Lazy
public class DatabaseCreatorServiceImpl implements DatabaseCreatorService {

	@Autowired
	DatabaseCreator dbCreator;

	@Autowired
	ISIHrisApplicationProperties appProperties;

	@Override
	public void createDatabase(String host, String username, String password, String dbTemplate,
			String dumpFileDestination, String newDatabaseName, String characterSet) {

		File file = null;
		try {
			if (appProperties.getFileSystemOS().equals(FileSystem.LINUX.getValue())) {
				file = new ClassPathResource("erp.db.creator.sh").getFile();
			} else {
				file = new ClassPathResource("erp.db.creator.bat").getFile();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		if (file.exists()) {
			String shFile = file.toString();
			DatabaseCreateParam dbParam = new DatabaseCreateParam();
			dbParam.setShFile(shFile);
			dbParam.setHost(host);
			dbParam.setUsername(username);
			dbParam.setPassword(password);
			dbParam.setTemplateDB(dbTemplate);
			dbParam.setDumpFileDestination(String.format("%s.sql", newDatabaseName));
			dbParam.setNewDatabaseName(newDatabaseName);
			dbParam.setCharacterSet(characterSet);
			dbCreator.createDatabase(dbParam);
		}

	}

}
