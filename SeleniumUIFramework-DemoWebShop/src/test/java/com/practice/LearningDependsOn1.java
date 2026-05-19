package com.practice;

import org.testng.annotations.Test;

public class LearningDependsOn1 {
	@Test
	public void loginDemowebshop() {
		System.out.println("Code login as valid user");
	}
	@Test(dependsOnMethods = "loginDemowebshop",enabled = false)
	public void addProductAndCheckout() {
		System.out.println("Code add a product and checkout");
	}

}
