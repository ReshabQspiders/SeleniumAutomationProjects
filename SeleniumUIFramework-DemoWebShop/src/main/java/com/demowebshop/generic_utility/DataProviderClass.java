package com.demowebshop.generic_utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="registerData")
	public Object[][] getData() throws EncryptedDocumentException, IOException{
		ExcelUtility eu=new ExcelUtility();
		return eu.getExcelDataByDataProvider("registerNewUser");
	}

}
