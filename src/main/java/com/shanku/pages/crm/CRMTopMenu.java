package com.shanku.pages.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.shanku.pages.crm.accounts.AccountsPage;

public class CRMTopMenu {

	/*
	 * 
	 * This Part is very very Important 
	 * 
	 * CRMTopMenu is not a page
	 * 
	 * CRMHomePage HAS A CRMTopMenu 
	 * AccountsPage HAS A CRMTopMenu 
	 * CreateAccount HAS A CRMTopMenu
	 * ImportAccountsPage HAS A CRMTopMenu
	 * ImportNotesPage HAS A CRMTopMenu
	 * 
	 * Since CRMTopMenu is already encapsulated inside the Pages class like as
	 * menu=new CRMTopMenu(); So we cannot extend the Pages class here so challenge
	 * is how would we call the driver here so what we would do is we would create
	 * the constructor of the CRMTopMenu
	 * 
	 */
	
	WebDriver driver;
	
	public CRMTopMenu(WebDriver driver) {
		
		this.driver = driver;
	}

	public void goToHome() {

	}

	public void goToLeads() {

	}

	public void goToContacts() {

	}

	public AccountsPage goToAccounts() {

		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		return new AccountsPage();
		
	}

	public void goToDeals() {

	}

	public void SignOut() {

	}

}
