package com.practice;

import org.testng.annotations.Test;

public class LearningTimeout {
	//Time duration provided for execution is 1 second
	@Test(timeOut = 1000 )
	public void meth() throws InterruptedException {
		//Waiting for 3seconds
		Thread.sleep(3000);
	}
	//Throws ThreadTimeoutExecption

}
