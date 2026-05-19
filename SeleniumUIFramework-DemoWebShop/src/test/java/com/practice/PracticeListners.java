package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.demowebshop.generic_utility.ListnersImplementations.class)
public class PracticeListners {
	@Test
	public void testMethod1() {
		Reporter.log("Executing Test Method 1",true);
	}
	@Test
	public void testMethod2() {
		Reporter.log("Executing Test Method 2",true);
	}

}
