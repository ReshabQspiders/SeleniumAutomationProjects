package com.demowebshop.generic_utility;

import java.io.IOException;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListnersImplementations extends BaseClass implements ITestListener{
	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("Executing on test start",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Executing on test success",true);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Executing on test Failure",true);
		ScreenshotUtility su=new ScreenshotUtility();
		try {
			su.takeScreenShotOfWebPage(driver);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Executing on test skipped",true);
	}
	@Override
	public void onStart(ITestContext context) {
		Reporter.log("Executing on start",true);
	}
	@Override
	public void onFinish(ITestContext context) {
		Reporter.log("Executing on finish",true);
	}
}
