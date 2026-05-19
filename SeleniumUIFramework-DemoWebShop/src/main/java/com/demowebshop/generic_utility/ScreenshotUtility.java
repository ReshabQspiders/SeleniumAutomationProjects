package com.demowebshop.generic_utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotUtility{
	JavaUtility ju=new JavaUtility();
	public void takeScreenShotOfWebPage(WebDriver driver) throws IOException {
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File targ=new File("./ErrorScreenshot/failed_test"+ju.getTimeStamp()+".png");
		FileHandler.copy(src, targ);
	}
	public void takeScreenShotOfWebElement(WebElement targetElement) throws IOException  {
		File src = targetElement.getScreenshotAs(OutputType.FILE);
		File targ=new File("./ErrorScreenshot/ElementSS"+ju.getTimeStamp()+".png");
		FileHandler.copy(src, targ);

	}

}
