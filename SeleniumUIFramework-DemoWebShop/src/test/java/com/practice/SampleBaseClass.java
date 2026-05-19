package com.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleBaseClass {
	@BeforeSuite
	public void configBeforeSuite() {
		System.out.println("---Executing Before Suite---");
	}
	@BeforeTest
    public void configBeforeTest() {
		System.out.println("---Executing Before Test---");
	}
	@BeforeClass
	public void configBeforeClass() {
		System.out.println("---Executing Before Class---");
	}
	@BeforeMethod
	public void configBeforeMethod() {
		System.out.println("---Executing Before Method---");
	}
	@AfterMethod
	public void configAfterMethod() {
		System.out.println("---Executing After Method---");	
	}
	@AfterClass
	public void configAfterClass() {
		System.out.println("---Executing After Class---");
	}
	@AfterTest
	public void configAfterTest() {
		System.out.println("---Executing After Test---");
	}
	@AfterSuite
	public void configAfterSuite() {
		System.out.println("---Executing After Suite---");
	}
}
