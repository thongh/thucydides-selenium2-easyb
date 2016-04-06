package com.bp3.pages;

import org.openqa.selenium.WebElement;
import net.thucydides.core.annotations.findby.By;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;


public class BUIExampleMain extends PageObject {

	// It is important to use Ids across the test web app for Selenium to identify the elements. 
	@FindBy(css="#controlDemo1 div div button")
	private WebElementFacade controlDemo1Button;
		
	public void openControlDemo1() {	
			
		// Due to Coach Framework specifics, Selenium only works with Coach UI elements only when iframe on the IBM Portal is focused
		// This is for the lifelong of the driver, if need to go back out, call driver to go back to default view
		getDriver().switchTo().frame(getDriver().findElement(By.xpath("//*[@id='com_ibm_bpm_social_widgets_task_form_CoachRenderer_0']/iframe")));
		
		// Then find element
//		WebElement controlDemo1 = getDriver().findElement(By.cssSelector("#div_1_1_2_1_1_1_1 > div:nth-child(1) > button:nth-child(1)"));
//		controlDemo1 = getDriver().findElement(By.cssSelector("#controlDemo1 div div button"));
		
		controlDemo1Button.click();
		
	}
	
}
