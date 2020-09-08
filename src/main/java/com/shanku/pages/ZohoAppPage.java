package com.shanku.pages;

import com.shanku.base.Page;
import com.shanku.pages.crm.CRMHomePage;


public class ZohoAppPage extends Page {


	public void goToBooks() {
		click("book_XPATH");
		driver.navigate().back();
	}

	public void goToCalender() {
		click("calender_XAPTH");
		driver.navigate().back();
	}

	public void goToCampaigns() {
		click("campaign_XAPTH");
		driver.navigate().back();
	}
	
	public CRMHomePage goToCRM() {
		click("crm_XPATH");
		return new CRMHomePage();
	}

}
