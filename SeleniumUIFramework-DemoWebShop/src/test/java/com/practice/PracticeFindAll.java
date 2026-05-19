package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticeFindAll {
	static String orangeUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	static String swagUrl="https://www.saucedemo.com/";
	static String orangeUN="Admin";
	static String orangePwd="admin123";
	static String swagUN="standard_user";
	static String swagPwd="secret_sauce";
	
	WebDriver driver;
	public PracticeFindAll(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindAll({@FindBy(id = "user-name"),@FindBy(name = "username")})
	private WebElement userName;
	
	@FindAll({@FindBy(id = "password"),@FindBy(name = "password")})
	private WebElement password;
	
	@FindAll({@FindBy(id = "login-button"),@FindBy(css = "[type='submit']")})
	private WebElement loginButton;
	
	public WebElement getUserName() {
		return userName;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(swagUrl);
		PracticeFindAll pfa=new PracticeFindAll(driver);
		pfa.getUserName().sendKeys(swagUN);
		pfa.getPassword().sendKeys(swagPwd);
		pfa.getLoginButton().click();
	}


}
