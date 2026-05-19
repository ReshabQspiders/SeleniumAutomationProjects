package com.practice;

import org.testng.annotations.Test;

public class LearningEnabled {
	@Test
	public void m1() {
		System.out.println("running m1");
	}
	@Test(dependsOnMethods = "m3")
	public void m2() {
		System.out.println("running m2");

	}
	@Test(enabled = false)
	public void m3() {
		System.out.println("running m3");

	}

}
