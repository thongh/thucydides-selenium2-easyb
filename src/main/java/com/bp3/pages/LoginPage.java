package com.bp3.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.findby.FindBy;
import net.thucydides.core.pages.PageObject;
import net.thucydides.core.pages.WebElementFacade;

//@DefaultUrl("https://bpm856ps:9443/brazos-portal/login")
@DefaultUrl("https://bpm856ps:9443/ProcessPortal/login.jsp")
public class LoginPage extends PageObject {
		
	@FindBy(id="username")
	private WebElementFacade usernameInput;
	
	@FindBy(id="password")
	private WebElementFacade passwordInput;
	
	@FindBy(id="submitBtn")
	private WebElementFacade BPLoginButton;
	
	@FindBy(id="log_in")
	private WebElementFacade BPMLoginButton;
	
	// Login
	public void login(String username, String password) {
		usernameInput.type(username);
    	passwordInput.type(password);
    	BPMLoginButton.click();
	}	
	public void login() {
		usernameInput.type("thongh");
    	passwordInput.type("Pa55w0rd131!!");
    	BPMLoginButton.click();
    	
	}
	
}