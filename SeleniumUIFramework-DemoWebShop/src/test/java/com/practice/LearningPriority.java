package com.practice;

import org.testng.annotations.Test;

public class LearningPriority {
	@Test(priority = 1)
	public void addNewMember() {
		System.out.println("New member added");
	}
	@Test(priority = 2)
	public void editAddedMember() {
		System.out.println("The details of the added memeber is changed");
	}
	@Test(priority = 3)
	public void deleteAddedMember() {
		System.out.println("The added member has been sucessfully deleted");
	}
}
