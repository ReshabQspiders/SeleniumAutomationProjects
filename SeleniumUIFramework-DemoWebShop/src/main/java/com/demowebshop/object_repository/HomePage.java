package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath =  "//div[@class='header-links']/..//a[@class='account']")
	private WebElement myAccountLink;
	
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;
	
	@FindBy(linkText = "Shopping cart")
	private WebElement shoppingCartLink;
	
	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}
	public WebElement getComputersLink() {
		return computersLink;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getMyAccountLink() {
		return myAccountLink;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	public WebElement getRegisterLink() {
		return registerLink;
	}
	//Bussiness logic
	public void clickOnLoginLink() {
		loginLink.click();
	}
	public void clickOnMyAccountLink() {
		myAccountLink.click();
	}
	public void clickOnLogoutLink() {
		logoutLink.click();
	}
	
	public void clickOnRegisterLink() {
		registerLink.click();
	}
	public void clickOnComputersLink() {
		computersLink.click();
	}
	public void clickOnShoppingCartLink() {
		shoppingCartLink.click();
	}

	
}
