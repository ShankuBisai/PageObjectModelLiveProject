package com.shanku.pages.crm.accounts;

import org.openqa.selenium.By;

import com.shanku.base.Page;

public class CreateAccountPage extends Page {
	
	public void verifyCreateAccountPage() {
		
		
	}
	
	
	public void createAccount(String AccountName) {
		type("accountName_XPATH", AccountName);
	}
	
	
	
	
	

}
