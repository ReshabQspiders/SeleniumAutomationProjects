package com.practice;

import org.testng.annotations.Test;

public class LearningDependsOn {
	@Test
	public void parents() {
		System.out.println("--Parents are Parenting--");
	}
	@Test(dependsOnMethods = "parents")
	public void children() {
		System.out.println("--Children are annoying--");
	}
	@Test(dependsOnMethods = {"parents","children"})
	public void grandParents() {
		System.out.println("--Grandparents are playing with children--");
	}

}
