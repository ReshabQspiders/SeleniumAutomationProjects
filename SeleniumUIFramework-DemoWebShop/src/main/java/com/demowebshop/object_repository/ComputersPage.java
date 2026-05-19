package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputersPage {
	public WebDriver driver;
	public ComputersPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(partialLinkText = "Desktops")
	private WebElement desktopsLink;
	
	public WebElement getDesktopsLink() {
		return desktopsLink;
	}
	//Business Logic
	public void clickOnDesktopsLink() {
		desktopsLink.click();
	}

}
