package com.demowebshop.generic_utility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectHelper {
	public Select sel;
	public SelectHelper(WebElement dropDownElement) {
		this.sel=new Select(dropDownElement);
	}
	
	//Selection methods
	public void selectOptionFromDropDown(int indexNo) {
		sel.selectByIndex(indexNo);
	}
	public void selectOptionFromDropDown(String valueArrtibute) {
		sel.selectByValue(valueArrtibute);
	}
	public void selectOptionFromDropDownByText(String visibleText) {
		sel.selectByVisibleText(visibleText);
	}
	public void selectOptionFromDropDownByPartialText(String visibleText) {
		sel.selectByContainsVisibleText(visibleText);
	}
	//De-selection methods
	public void deselectOptionFromDropDown(int indexNo) {
		sel.deselectByIndex(indexNo);
	}
	public void deselectOptionFromDropDown(String valueArrtibute) {
		sel.deselectByValue(valueArrtibute);
	}
	public void deselectOptionFromDropDownByText(String visibleText) {
		sel.deselectByVisibleText(visibleText);
	}
	public void deselectOptionFromDropDownByPartialText(String visibleText) {
		sel.deSelectByContainsVisibleText(visibleText);
	}
	public void deselectAllOptions() {
		sel.deselectAll();
	}
	//all options
	public void fetchAllOptionsInDropDown() {
		List<WebElement> options = sel.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}
	//all selected options
	public void fetchAllSelectedOptionsInDropDown() {
		List<WebElement> options = sel.getAllSelectedOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	}
	//multiple
	public boolean checkForMultiselectDropDown() {
		return sel.isMultiple();
	}

}
