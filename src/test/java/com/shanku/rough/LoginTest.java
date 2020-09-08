package com.shanku.rough;


import com.shanku.base.Page;
import com.shanku.pages.HomePage;
import com.shanku.pages.LoginPage;
import com.shanku.pages.ZohoAppPage;
import com.shanku.pages.crm.accounts.AccountsPage;
import com.shanku.pages.crm.accounts.CreateAccountPage;

public class LoginTest extends Page {

	public static void main(String[] args) {
		
		HomePage homepage = new HomePage();
		LoginPage loginpage = homepage.goToLogin();
		ZohoAppPage zohoapppage=loginpage.doLogin("shankubisai3333@gmail.com","	Ashok12345");	
		zohoapppage.goToBooks();
		zohoapppage.goToCalender();
		zohoapppage.goToCampaigns();
		zohoapppage.goToCRM();
		AccountsPage accountspage=Page.menu.goToAccounts();
		CreateAccountPage createaccountpage=accountspage.gotToCreateAccount();	
		createaccountpage.createAccount("Rahul Kumar");
		
	}

}
