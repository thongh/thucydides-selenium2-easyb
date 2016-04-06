package com.bp3.pages;

import groovy.ui.SystemOutputInterceptor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class ControlsDemo1 extends PageObject {

	// Checkbox - Multiselect
	private List<WebElement> multiSelectCheckboxes;
	private WebElement checkboxesSelected;
	
	// Checkbox - Multiselect - select all
	public void selectItemsInMultiselectCheckboxes() {		
		multiSelectCheckboxes = getDriver().findElements(By.name("CBdiv_3"));
		for (int i = 0; i < multiSelectCheckboxes.size(); i++) {
			multiSelectCheckboxes.get(i).click();
		}
	}
	
	public String checkResultMultipleItemsSelection() {
		checkboxesSelected = getDriver().findElement(By.cssSelector("div[data-viewid='Output_Text4'] div div.col-xs-9 div"));
		return checkboxesSelected.getText();	
		
		
	}
	
	
}
