package com.bp3.steps;

import org.apache.log4j.Logger;
import com.bp3.pages.BUIExampleMain;
import com.bp3.pages.ControlsDemo1;
import com.bp3.pages.LoginPage;
import com.bp3.pages.PortalHome;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import static org.hamcrest.MatcherAssert.assertThat;

public class EndUserSteps extends ScenarioSteps {
	 
	final static Logger logger = Logger.getLogger(com.bp3.steps.EndUserSteps.class);
	
	LoginPage loginPage;
	PortalHome portalHome;
	BUIExampleMain buiExampleMain;
	ControlsDemo1 controlsDemo1;
	
    /****************************************************
     * LOGIN STEPS
     * 
     * 
     ***************************************************/
	@Step
	public void login(String keyword) {
		loginPage.login();
	}
	
	@Step
	public void is_on_login_page() {
		loginPage.open();
	}
	
	/****************************************************
     * NAVIGATE TO TEST SERVICE STEPS
     * 
     * 
     ***************************************************/
	@Step
	public void run_BUI_test_service() {
		portalHome.bpmOpenTestService();
	
	}
	
	/****************************************************
     * BUI Example Main - Control Demo 1
     * 
     * 
     ***************************************************/
	@Step
	public void open_control_demo_1() {
		buiExampleMain.openControlDemo1(); 	
	}
	
	/****************************************************
     * BUI Example Main - Control Demo 1 - Checkbox
     * 
     * 
     ***************************************************/
	@Step
	public void select_items_multiselectcheckbox() {
		controlsDemo1.selectItemsInMultiselectCheckboxes();
	}
	
	@Step
	public void should_see_selected_items() {
		
		logger.debug("This is debug");
		
		String checkboxesSelected = controlsDemo1.checkResultMultipleItemsSelection();
		
//		assertThat("Checkboxes Selected Expected Result", checkboxesSelected == "red, blue, green, purple, ");
	}
}