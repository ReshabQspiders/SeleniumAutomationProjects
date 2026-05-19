package com.demowebshop.register;
import java.io.IOException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.demowebshop.generic_utility.BaseClass;
import com.demowebshop.generic_utility.DataProviderClass;
import com.demowebshop.generic_utility.ExcelUtility;
import com.demowebshop.object_repository.RegisterPage;
import com.demowebshop.object_repository.RegisterResultPage;

@Listeners(com.demowebshop.generic_utility.ListnersImplementations.class)

public class RegisterNewUserTest extends BaseClass {
	@Test(groups = {"Regression"})
	public void newUserRegistration() throws IOException{
		ExcelUtility eu=new ExcelUtility();
		String fn = eu.fetchDataFromSingleCellInExcelFile("registerNewUser",5 , 0);
		String ln = eu.fetchDataFromSingleCellInExcelFile("registerNewUser",5 , 1);
		String emailpart1 = eu.fetchDataFromSingleCellInExcelFile("registerNewUser",5 , 2);
		String emailpart2 = eu.fetchDataFromSingleCellInExcelFile("registerNewUser",5 , 3);
		String password = eu.fetchDataFromSingleCellInExcelFile("registerNewUser",5 , 4);
		RegisterPage rp=new RegisterPage(driver);
		RegisterResultPage rrp=new RegisterResultPage(driver);	
		hp.clickOnRegisterLink();
		rp.registerAsNewUser(false,fn, ln, emailpart1, emailpart2, password);
		Assert.assertEquals(rrp.fetchTextOfSuccessMessage(),"Your registration completed");
		Reporter.log("Test case Status: Pass",true);
	}
	
	@Test(dataProvider = "registerData",dataProviderClass = DataProviderClass.class)
	public void registerMultipleNewUsers(String firstName,String lastName,String emailPart1,String emailPart2,String password ) {
		RegisterPage rp=new RegisterPage(driver);
		RegisterResultPage rrp=new RegisterResultPage(driver);	
		hp.clickOnRegisterLink();
		rp.registerAsNewUser(false,firstName, lastName, emailPart1, emailPart2, password);
		Assert.assertEquals(rrp.fetchTextOfSuccessMessage(),"Your registration completed");
		Reporter.log("Test case Status: Pass",true);
	}
	

}
