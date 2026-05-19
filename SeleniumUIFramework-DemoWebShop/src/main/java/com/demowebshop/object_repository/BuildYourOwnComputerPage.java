package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage {
	public WebDriver driver;
	public BuildYourOwnComputerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "product_attribute_16_3_6_19")
	private WebElement hdd400GBRadioButton;
	
	@FindBy(id = "add-to-cart-button-16")
	private WebElement addToCartButton;
	
	public WebElement getHdd400GBRadioButton() {
		return hdd400GBRadioButton;
	}

	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	//Business logic
	public void clickOn400GbRadioButton() {
		hdd400GBRadioButton.click();
	}
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
	public void chooseHddAndAddToCart() {
		hdd400GBRadioButton.click();
		addToCartButton.click();
	}

}
