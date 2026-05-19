package com.practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PracticeFindBys {
	WebDriver driver;
	public PracticeFindBys(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBys({@FindBy(id = "APjFqb"),@FindBy(xpath = "//textarea[@aria-label='Search']")})
	private WebElement search1TextField;
	
	public WebElement getSearch1TextField() {
		return search1TextField;
	}
	
	@FindAll({@FindBy(id = "APj"),@FindBy(xpath = "//textarea[@aria-label='Search']")})
	private WebElement search2TextField;

	public WebElement getSearch2TextField() {
		return search2TextField;
	}



	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		//Write selenium in search field
		PracticeFindBys pfb=new PracticeFindBys(driver);
		pfb.getSearch2TextField().sendKeys("Selenium");
	}

}
