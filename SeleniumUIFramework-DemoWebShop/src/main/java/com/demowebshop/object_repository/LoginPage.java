package com.demowebshop.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "Email")
	private WebElement emailTextField;
	
	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(css = "[value='Log in']")
	private WebElement loginButton;
	
	@FindBy(linkText = "Forgot password?")
	private WebElement forgotPasswordLink;
	//getters
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	//Bussiness logic
	public void enterValidCredentialsAndLogin(String validEmail,String validPassword) {
		emailTextField.sendKeys(validEmail);
		passwordTextField.sendKeys(validPassword);
		loginButton.click();
	}
	public void clickForgotPassword() {
		forgotPasswordLink.click();
	}

}
