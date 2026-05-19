package com.demowebshop.generic_utility;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.demowebshop.object_repository.HomePage;

public class BaseClass {
  public static WebDriver driver;
  public FileUtility fu;
  public WebDriverUtility wu;
  public String browser;
  public  String url;
  public String email;
  public String password;
  public HomePage hp;

  @BeforeSuite
  public void configBeforeSuite() {
	  System.out.println("Initiating Suite execution and Connecting to DataBase");
  }
  @BeforeTest
  public void configBeforeTest() {
	  System.out.println("Initiating Before Test execution and Setting Environment Variables");
  }
  @BeforeClass
  public void configBeforeClass() throws IOException {
	  System.out.println("Initiating Before Class Execution");
	  fu=new FileUtility();
	  browser = fu.fetchDataFromProperyFile("Browser");
	  url = fu.fetchDataFromProperyFile("URL");
	  email = fu.fetchDataFromProperyFile("ValidEmail");
	  password = fu.fetchDataFromProperyFile("ValidPassword");
  }
  @BeforeMethod
  public void configBeforeMethod() {
	  System.out.println("Initiaiting Before Method Execution");
		if (browser.contains("chrome")) {
			driver=new ChromeDriver();
		}else if (browser.contains("edge")) {
			driver=new EdgeDriver();
		}else if (browser.contains("firefox")) {
			driver=new FirefoxDriver();
		} 
		wu=new WebDriverUtility();
		hp=new HomePage(driver);
		wu.maximizeBrowser(driver);
		wu.addGlobalWaitToPage(driver, 15);
		wu.openWebPage(driver,url);
	  
  }
  @AfterMethod
  public void configAfterMethod() {
	  wu.quitFromTheBrowser(driver);
  }
  @AfterClass
  public void configAfterClass() {
	  System.out.println("Terminating the class Execution");
  }
  @AfterTest
  public void configAfterTest() {
	  System.out.println("Terminating the Test Execution");
  }
  @AfterSuite
  public void configAfterSuite() {
	  System.out.println("Terminating the Suite Execution and disconnecting from DataBase");
  }
   


}
