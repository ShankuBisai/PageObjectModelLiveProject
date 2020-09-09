package com.shanku.testcases;

import org.testng.annotations.Test;

import com.shanku.pages.HomePage;
import com.shanku.pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	//Adding a comment here.Using EGit plugin
	@Test
	public void loginTest() throws InterruptedException {
		HomePage homepage = new HomePage();
		LoginPage loginpage = homepage.goToLogin();
		loginpage.doLogin("shankubisai3333@gmail.com","Ashok12345#");		
	}
}
