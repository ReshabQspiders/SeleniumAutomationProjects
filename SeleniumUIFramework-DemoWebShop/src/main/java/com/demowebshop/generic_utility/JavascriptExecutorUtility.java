package com.demowebshop.generic_utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavascriptExecutorUtility {
	public JavascriptExecutor js;
	public JavascriptExecutorUtility(WebDriver driver) {
		this.js=(JavascriptExecutor) driver; 
	}
	//Scrolling
	public void scrollFromTheOriginUsingCoordinates(int x,int y) {
		js.executeScript("window.scrollTo("+x+","+y+")");
	}
	public void scrollFromTheCurrentPositionUsingCoordinates(int x,int y) {
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	public void scrollToTheElement(boolean upOrDown,WebElement target) {
		js.executeScript("arguments[0].scrollIntoView("+upOrDown+")",target);
	}
	//clicking
	public void clickOnLocatedElement(WebElement target) {
		js.executeScript("arguments[0].click()", target);
	}
	//typing
	public void enterTextInTheElement(String text,WebElement target) {
		js.executeScript("arguments[0].value="+text+"", target);
	}

}
