package com.practice;

import org.testng.annotations.Test;

public class UnderstandingConfigAnnotation extends SampleBaseClass {
	@Test
	public void addUser() {
		System.out.println("Adding an User");
	}
	@Test
	public void editUser() {
		System.out.println("Editing an User Details");
	}
}
