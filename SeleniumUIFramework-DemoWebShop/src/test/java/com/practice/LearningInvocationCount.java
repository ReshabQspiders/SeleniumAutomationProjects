package com.practice;

import org.testng.annotations.Test;

public class LearningInvocationCount {
	@Test(priority = 1,invocationCount = 5)
	public void addNewMember() {
		System.out.println("New member added");
	}
	@Test(priority = 2,invocationCount = 3)
	public void editAddedMember() {
		System.out.println("The details of the added memeber is changed");
	}
	@Test(priority = 3,invocationCount = 2)
	public void deleteAddedMember() {
		System.out.println("The added member has been sucessfully deleted");
	}
}
