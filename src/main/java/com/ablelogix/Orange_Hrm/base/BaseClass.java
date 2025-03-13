package com.ablelogix.Orange_Hrm.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import com.ablelogix.Orange_Hrm.utility.FileURL;

public class BaseClass implements FileURL{
	
	Properties configProperties = new Properties();
	
	Properties objectrepoProperties = new Properties();
	
	public BaseClass() throws IOException   {
		try {
			//For ConfigProperties
			File configFileObj = new File(FileURL.configFilePath);
			FileReader configFileReaderObj = new FileReader(configFileObj);
			configProperties.load(configFileReaderObj);
			
			
			//For ObjectRepoproperties
			File ObjectRepoObj = new File(FileURL.objectRepoFilePath);
			FileReader ObjectRepoReaderObj= new FileReader(ObjectRepoObj);
			objectrepoProperties.load(ObjectRepoReaderObj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception Occurs in Base Class " +e.getMessage());
		}
		
	}
	
	
	
	

}
