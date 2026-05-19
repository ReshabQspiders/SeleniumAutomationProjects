package com.demowebshop.generic_utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	//To switch the driver control to the child or tab
	public void switchToChildWindowOrTab(WebDriver driver,String childWindowUrl) {
		Set<String> allIds = driver.getWindowHandles();
		for (String windowId : allIds) {
			driver.switchTo().window(windowId);
			if (driver.getCurrentUrl().contains(childWindowUrl)) {
				break;
			}
		}
	}
	public void switchToChildWindowOrTab(String pageTitle,WebDriver driver) {
		Set<String> allIds = driver.getWindowHandles();
		for (String windowId : allIds) {
			driver.switchTo().window(windowId);
			if (driver.getTitle().contains(pageTitle)) {
				break;
			}
		}
	}
	//To Launch and switch the control to new window
	public void launchNewWindow(WebDriver driver) {
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
	//To Launch and switch the control to new tab
	public void launchNewTab(WebDriver driver) {
		driver.switchTo().newWindow(WindowType.TAB);
	}
	//Manage the Browser window
	//Maximize
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}
	//Minimize
	public void minimizeBrowser(WebDriver driver) {
		driver.manage().window().minimize();
	}
	//Full-screen
	public void launchBrowserInFullscreen(WebDriver driver) {
		driver.manage().window().fullscreen();;
	}
	//getSize
	public Dimension fetchBrowserDimension(WebDriver driver) {
		return driver.manage().window().getSize();
	}
	//setSize
	public void setBrowserDimension(WebDriver driver,int width,int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	//getPoistion
	public Point fetchBrowserCoordinates(WebDriver driver) {
		return driver.manage().window().getPosition();
	}
	//setPosition
	public void setBrowserCoordinates(WebDriver driver,int x,int y) {
		driver.manage().window().setPosition(new Point(x, y));
	}
	//Implicit wait
	public void addGlobalWaitToPage(WebDriver driver,long seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	//Explicit wait
	public void waitForTheElementToBeVisible(WebDriver driver,long seconds,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	public void waitForTheElementToBeClickable(WebDriver driver,long seconds,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	//alert
	public void acceptJavascriptPopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void dismissJavascriptPopup(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	public void addTextAndAcceptJavascriptPopup(WebDriver driver,String inputText) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(inputText);
		alert.accept();
	}
	public void addTextAndDismissJavascriptPopup(WebDriver driver,String inputText) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(inputText);
		alert.dismiss();
	}
	public String fetchJavascriptPopupMessage(WebDriver driver) {
		return driver.switchTo().alert().getText();
	}
	//Frames
	public void switchTheControlToFrameByIndex(WebDriver driver,int frameIndex) {
		driver.switchTo().frame(frameIndex);
	}
	public void switchTheControlToFrameByAttribute(WebDriver driver,String nameOrId) {
		driver.switchTo().frame(nameOrId);
	}
	public void switchTheControlToFrameByLocatedWebelement(WebDriver driver,WebElement element) {
		driver.switchTo().frame(element);
	}
	public void switchTheControlBackToParentFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}
	public void switchTheControlToMainPage(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	//Navigation
	public void navigateToWebPage(WebDriver driver,String url) {
		driver.navigate().to(url);
	}
	public void navigateForwardToWebPage(WebDriver driver) {
		driver.navigate().forward();
	}
	public void navigateBackwardToWebPage(WebDriver driver) {
		driver.navigate().back();
	}
	public void refreshTheWebPage(WebDriver driver) {
		driver.navigate().refresh();
	}
	//get
	public void openWebPage(WebDriver driver,String url) {
		driver.get(url);
	}
	//getTitle
	public String fetchTitleOfCurrentPage(WebDriver driver) {
		return driver.getTitle();
	}
	//getCurrentUrl
	public String fetchUrlOfCurrentPage(WebDriver driver) {
		return driver.getCurrentUrl();
	}
	//close
	public void closeTheCurrentBrowserWindow(WebDriver driver) {
		driver.close();
	}
	//quit
	public void quitFromTheBrowser(WebDriver driver) {
		driver.quit();
	}
}
