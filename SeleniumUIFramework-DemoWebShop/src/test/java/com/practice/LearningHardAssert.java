package com.practice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningHardAssert {
	@Test
	public void sampleHardAssert() {
		String expectedCondition="Title";
		String actualCondition="errortitle";
		Assert.assertEquals(actualCondition, expectedCondition);
		Reporter.log("Pass",true);

	}
	@Test
	public void sampleHardAssert1() {
		String expectedCondition="Title";
		String actualCondition="errortitle";
		Assert.assertTrue(expectedCondition.equals(actualCondition));;
		Reporter.log("Pass",true);

	}

}
