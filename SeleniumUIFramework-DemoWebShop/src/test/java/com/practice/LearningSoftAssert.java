package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssert {
	@Test
	public void SampleSoftAssert() {
		String expectedTitle="Home Page";
		String ActualTitle="Dashboad";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(ActualTitle, expectedTitle);
		Reporter.log("Pass",true);
		sa.assertAll();
	}
	@Test
	public void SampleSoftAssert1() {
		String expectedTitle="Home Page";
		String ActualTitle="Dashboad";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(ActualTitle.equals(expectedTitle));;
		Reporter.log("Pass",true);
		sa.assertAll();
	}

}
