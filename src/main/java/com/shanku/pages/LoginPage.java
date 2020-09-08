package com.shanku.pages;

import com.shanku.base.Page;

public class LoginPage extends Page {
	
	
	public ZohoAppPage doLogin(String emailID,String password) {
		type("loginid_XPATH", emailID);
		click("nextbutton_XPATH");
		type("password_XPATH", password);
		click("nextbutton_XPATH");
		return new ZohoAppPage();
		
	}
	
//	public void goToOneAuth() {
//		driver.findElement(By.xpath("//a[text()='OneAuth']")).click();
//	}

}
