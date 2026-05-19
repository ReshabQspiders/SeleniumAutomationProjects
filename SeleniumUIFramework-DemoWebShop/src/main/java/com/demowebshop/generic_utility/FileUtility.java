package com.demowebshop.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	public String filepath="./src/test/resources/CommonDataLogin.properties";
	
	public String fetchDataFromProperyFile(String keyName) throws IOException {
	
		FileInputStream fis=new FileInputStream(filepath);
		Properties prop=new Properties();
		prop.load(fis);
		String value = prop.getProperty(keyName);
		fis.close();
		return value;
	}

}
