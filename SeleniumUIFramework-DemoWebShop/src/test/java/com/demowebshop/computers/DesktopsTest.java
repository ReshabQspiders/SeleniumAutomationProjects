package com.demowebshop.computers;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.demowebshop.generic_utility.BaseClass;
import com.demowebshop.generic_utility.FileUtility;
import com.demowebshop.generic_utility.WebDriverUtility;
import com.demowebshop.object_repository.BuildYourOwnComputerPage;
import com.demowebshop.object_repository.ComputersPage;
import com.demowebshop.object_repository.DesktopsPage;
import com.demowebshop.object_repository.HomePage;
import com.demowebshop.object_repository.ShoppingCartPage;

@Listeners(com.demowebshop.generic_utility.ListnersImplementations.class)

public class DesktopsTest extends BaseClass {
	@Test(groups = {"Regression","Smoke","System"})
	public void addProductToCart() throws IOException {	
		//click computers
		hp.clickOnComputersLink();
		//click on desktops
		ComputersPage cp=new ComputersPage(driver);
		cp.clickOnDesktopsLink();
		//Select A toZ
		//Select 4 per page
		//Add to cart
		DesktopsPage desp=new DesktopsPage(driver);
		desp.performAddToCartForBuildYourOwnComputer();
		//Click on 400gb HDD
		//Add to cart in the page
		BuildYourOwnComputerPage bcp=new BuildYourOwnComputerPage(driver);
		bcp.chooseHddAndAddToCart();
		//click shopping cart
		hp.clickOnShoppingCartLink();
		//Verify
		ShoppingCartPage sp=new ShoppingCartPage(driver);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(sp.fetchProductName(), "Build your own computer");
		Reporter.log("Test case Status: Pass",true);
		sa.assertAll();
	}

}
