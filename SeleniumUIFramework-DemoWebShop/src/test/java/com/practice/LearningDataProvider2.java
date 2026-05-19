package com.practice;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearningDataProvider2 {
	
	@Test(dataProvider = "data2")
	public void fetchData(String name,int num) {
		Reporter.log(name+" "+num,true);
	}
	
	@DataProvider(name="data1")
	public Object[][] getdata1(){
		return	new Object[][] {
				{"mango","sweet"},
				{"grapes","sour"}
			};
		}
	@DataProvider(name="data2")
	public Object[][] getdata2(){
		return	new Object[][] {
				{"Pune",12},
				{"Puri",34}
			};
		}
	}


