package com.practice;

import org.testng.annotations.Test;

public class Member {
	@Test
	public void addNewMember() {
		System.out.println("New member added");
	}
	@Test
	public void editAddedMember() {
		System.out.println("The details of the added memeber is changed");
	}
	@Test
	public void deleteAddedMember() {
		System.out.println("The added member has been sucessfully deleted");
	}

}
