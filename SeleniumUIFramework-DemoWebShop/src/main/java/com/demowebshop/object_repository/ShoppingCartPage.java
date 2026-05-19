package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
public WebDriver driver;
	
	public ShoppingCartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "[class='product-name']")
	private WebElement productName;

	public WebElement getProductName() {
		return productName;
	}
	//Business logic
	public String fetchProductName() {
		return productName.getText();
	}
}
