package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordRecoveryPage {
	public WebDriver driver;
	public PasswordRecoveryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement yourEmailAddressTextField;
	
	@FindBy(name = "send-email")
	private WebElement recoverButton;
	
	@FindBy(className = "result")
	private WebElement recoveryMessage;
	
	public WebElement getYourEmailAddressTextField() {
		return yourEmailAddressTextField;
	}
	public WebElement getRecoverButton() {
		return recoverButton;
	}
	public WebElement getRecoveryMessage() {
		return recoveryMessage;
	}
	//Business logic
	public void sendPasswordRecovery(String validEmail) {
		yourEmailAddressTextField.sendKeys(validEmail);
		recoverButton.click();
	}
	public String fetchRecoveryMessage() {
		return recoveryMessage.getText();
	}


}
