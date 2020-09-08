package com.shanku.pages.crm.accounts;

import org.openqa.selenium.By;

import com.shanku.base.Page;

public class AccountsPage extends Page {
	
	
	
	public void verifyAccountPage() {
		
		
	}
	
	public void verifyFilterAccountsByOption() {
		
		
	}
	
	public void gotToImportAccounts() {
		
		
		
	}
	
	public void goToImportNotes() {
		
		
		
	}
	
	public CreateAccountPage gotToCreateAccount() {
		
		driver.findElement(By.xpath(OR.getProperty("createAccount_XPATH"))).click();
		return new CreateAccountPage();
		
	}

}
