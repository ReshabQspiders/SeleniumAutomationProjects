package com.demowebshop.login;

import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demowebshop.generic_utility.BaseClass;
import com.demowebshop.object_repository.LoginPage;
import com.demowebshop.object_repository.MyAccountPage;
import com.demowebshop.object_repository.PasswordRecoveryPage;

@Listeners(com.demowebshop.generic_utility.ListnersImplementations.class)
public class LoginTest extends BaseClass {
	@Test(groups = "Regression")
	public void loginAsValidUser() throws IOException {
		LoginPage lp=new LoginPage(driver);
		MyAccountPage acp=new MyAccountPage(driver);
		hp.clickOnLoginLink();
		lp.enterValidCredentialsAndLogin(email, password);
		hp.clickOnMyAccountLink();;
		Assert.assertTrue(acp.getPageHeader().isDisplayed());
		Reporter.log("The Login is Successfull",true);
		hp.clickOnLogoutLink();
		Assert.assertEquals(wu.fetchTitleOfCurrentPage(driver),fu.fetchDataFromProperyFile("ExpectedTitle"));
		Reporter.log("Test case Status: Pass",true);
	}
	
	@Test(groups = "Smoke")
	public void recoverPassword() throws IOException {
		LoginPage lp=new LoginPage(driver);
		PasswordRecoveryPage prp=new PasswordRecoveryPage(driver);
		hp.clickOnLoginLink();
		lp.clickForgotPassword();
		prp.sendPasswordRecovery(email);
		wu.waitForTheElementToBeVisible(driver, 10, prp.getRecoveryMessage());
		Assert.assertTrue(prp.fetchRecoveryMessage().contains("Email with instructions has been sent to you."));
		Reporter.log("Test Case Status: Pass",true);
		//Test complete
	}
		
}


