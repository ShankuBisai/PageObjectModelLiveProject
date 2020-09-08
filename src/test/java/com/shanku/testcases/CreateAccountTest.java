package com.shanku.testcases;

import org.testng.annotations.Test;

import com.shanku.base.Page;
import com.shanku.pages.ZohoAppPage;
import com.shanku.pages.crm.accounts.AccountsPage;
import com.shanku.pages.crm.accounts.CreateAccountPage;

public class CreateAccountTest extends BaseTest {
	
	@Test
	public void createAccountTest() throws InterruptedException {
		
		ZohoAppPage zp = new ZohoAppPage();
		zp.goToCRM();
		AccountsPage account = Page.menu.goToAccounts();
		CreateAccountPage createaccount = account.gotToCreateAccount();
		createaccount.createAccount("SHanku Bisai");
		Thread.sleep(15000);
		
		
	}
	
	
	

}
