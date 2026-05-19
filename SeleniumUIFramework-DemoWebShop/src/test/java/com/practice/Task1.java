package com.practice;

import org.testng.annotations.Test;

class Task1 extends SampleBaseClass {
	@Test
	public void m1() {
		System.out.println("M1 running");
	}
	@Test
	public void m2() {
		System.out.println("M2 running");
	}
}
class Task2 extends SampleBaseClass{
	@Test
	public void m3() {
		System.out.println("M3 running");
	}
	@Test
	public void m4() {
		System.out.println("M4 running");
	}
	
}
