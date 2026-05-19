package com.demowebshop.object_repository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.generic_utility.SelectHelper;

public class DesktopsPage {
	public WebDriver driver;
	public DesktopsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "products-orderby")
	private WebElement sortByDropdown;
	
	@FindBy(id = "products-pagesize")
	private WebElement displayPerPageDropdown;
	
	@FindBy(xpath = "//div[@data-productid='16']//input")
	private WebElement buildYourOwnComputersAddToCartButton;
	
	public WebElement getSortByDropdown() {
		return sortByDropdown;
	}

	public WebElement getDisplayPerPageDropdown() {
		return displayPerPageDropdown;
	}

	public WebElement getBuildYourOwnComputersAddToCartButton() {
		return buildYourOwnComputersAddToCartButton;
	}
	
	public void selectAtoZOption() {
		SelectHelper sh=new SelectHelper(sortByDropdown);
		sh.selectOptionFromDropDown("https://demowebshop.tricentis.com/desktops?orderby=5");

	}
	public void selectFourPerPage() {
		SelectHelper sh=new SelectHelper(displayPerPageDropdown);
		sh.selectOptionFromDropDownByText("4");

	}
	public void clickOnBulidYourOunComputerAddToCart() {
		buildYourOwnComputersAddToCartButton.click();

	}
	
	public void performAddToCartForBuildYourOwnComputer() {
		SelectHelper sh=new SelectHelper(sortByDropdown);
		sh.selectOptionFromDropDown("https://demowebshop.tricentis.com/desktops?orderby=5");
		SelectHelper shh=new SelectHelper(displayPerPageDropdown);
		shh.selectOptionFromDropDownByText("4");
		buildYourOwnComputersAddToCartButton.click();
	}
	
	

}
