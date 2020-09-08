package com.shanku.testcases;

import org.testng.annotations.AfterSuite;

import com.shanku.base.Page;

public class BaseTest {
	
	@AfterSuite
	public void tearDown() {
		Page.quit();
			
	}

}
