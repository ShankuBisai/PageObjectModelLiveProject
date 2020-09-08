package com.shanku.pages;

import com.shanku.base.Page;

public class HomePage extends Page {
	

	public void gotoSupport() {	
		click("support_XPATH");		
	}
	
	public void gotoSignUp() {	
		click("freesignup_XPATH");
	}
	
	public LoginPage goToLogin() {
		click("login_XPATH");
		return new LoginPage();
	}
	
	public void goToCustomers() {
		click("customers_XPATH");
	}
	
	public void goToZohoOne() {
		click("learnmore_XPATH");
	}
	
	public void validateFooterLinks() {
	
	}
	
}
