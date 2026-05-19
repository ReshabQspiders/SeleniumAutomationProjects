package com.demowebshop.generic_utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsHelper {
	public Actions act;
	public ActionsHelper(WebDriver driver) {
		this.act=new Actions(driver);
	}
	
	//Left click
	public void leftMouseClick(WebElement element) {
		act.click(element).perform();
	}
	//double click
	public void mouseLeftDoubleClick(WebElement element) {
		act.doubleClick(element).perform();
	}
	//right click
	public void rightMouseClick(WebElement element) {
		act.contextClick(element).perform();
	}
	//Scrolling
	public void scrollToLocatedElement(WebElement element) {
		act.scrollToElement(element).perform();
	}
	public void scrollToCoordinates(int x,int y) {
		act.scrollByAmount(x, y).perform();
	}
	//mouse hover
	public void mouseHoverOnElement(WebElement element) {
		act.moveToElement(element).perform();
	}
	public void mouseHoverOnCoordinate(int x,int y) {
		act.moveByOffset(x, y).perform();
	}
	public void mouseHoverOnElementWithPrecision(WebElement element,int x,int y) {
		act.moveToElement(element, x, y).perform();
	}
	public void pressNavigationArrowDown(int numOfTimesToPress) {
		for (int i = 0; i <numOfTimesToPress ; i++) {
			act.keyDown(Keys.ARROW_DOWN).keyUp(Keys.ARROW_DOWN).perform();
		}
	}
	public void pressEnterKey() {
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
	}
	//Drag and drop
	public void dragElementAndDropOnElement(WebElement source,WebElement target) {
		act.dragAndDrop(source, target).perform();
	}
	public void dragElementAndDropOnCoordinates(WebElement source,int x,int y) {
		act.dragAndDropBy(source, x, y).perform();
	}

}
