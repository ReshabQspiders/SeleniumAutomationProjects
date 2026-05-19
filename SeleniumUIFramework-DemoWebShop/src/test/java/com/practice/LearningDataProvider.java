package com.practice;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.demowebshop.generic_utility.DataProviderClass;

public class LearningDataProvider extends DataProviderClass {
	
	@Test(dataProvider = "DemoData")
	public void readDatafromDataProvider(String name,int age) {
		Reporter.log("My Name is "+name+" and my age is "+age,true);
	}
	
	
	@DataProvider(name = "DemoData")
	public Object[][] getData() {
		
	  Object[][] data = new Object[][]{
		  {"Reshab",27},
		  {"Chetan",24},
		  {"Sneha",25}
		  };
		  return data;
	}

	@Test(dataProvider = "registerData", dataProviderClass = DataProviderClass.class)
	public void printData(String fn,String ln,String email1,String email2,String pass) {
		System.out.println(fn+" "+ln+" "+email1+" "+email2+" "+pass);
	}
}
