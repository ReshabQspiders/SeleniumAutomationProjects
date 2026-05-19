package com.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class LearningAssertion {
	@Test
	public void sumAssert() {
		int a=5;
		int b=10;
		int sum=a+b;
		if (sum==10) {
			Reporter.log("pass", true);
		} else {
			Reporter.log("fail", true);
		}
	}

}
