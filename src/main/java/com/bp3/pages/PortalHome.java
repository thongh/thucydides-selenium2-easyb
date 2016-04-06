package com.bp3.pages;

import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

public class PortalHome extends PageObject {

	@FindBy(id="start-process")
	private WebElementFacade bpStartProcessLink;
	
	@FindBy(css="body > div.modal.fade.in > div > div > div > div.modal-body > div > div:nth-child(1) > div > div > div")
	private WebElementFacade bpStartBrazosDemoLink;
	
	@FindBy(xpath="//*[@id='com_ibm_bpm_social_widgets_LaunchableProcessList_0']/ul/li[1]/a")
	private WebElementFacade bpmStartProcessLink;
	
	// BPM Portal
	public void bpmOpenTestService() {
		bpmStartProcessLink.click();
	}
	
	// Brazos Portal
	public void bpOpenTestService() {
		bpStartProcessLink.click();
		bpStartBrazosDemoLink.click();
	}
	
}
