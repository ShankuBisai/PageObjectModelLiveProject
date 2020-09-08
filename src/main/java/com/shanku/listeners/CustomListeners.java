package com.shanku.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;

import com.relevantcodes.extentreports.LogStatus;
import com.shanku.base.Page;
import com.shanku.utilities.TestUtil;

public class CustomListeners extends Page implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		test = rep.startTest(result.getName());
		System.out.println("Testcase name is"+result.getName());
		//runmodes-Yes
		if(!TestUtil.isTestRunnable(result.getName(), excel)) {
			throw new SkipException("Skipping the Test "+result.getName()+" as the Run mode is NO");	
		}	
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getName()+" PASS" );
		rep.endTest(test);
		rep.flush();	
	}

	public void onTestFailure(ITestResult result) {
		
		System.setProperty("org.uncommons.reportng.escape-output","false");
		try {
			TestUtil.captureScreenshot();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		test.log(LogStatus.FAIL, result.getName()+" Failed with Exception : "+result.getThrowable() );
		test.log(LogStatus.FAIL, test.addScreenCapture(TestUtil.screenshotName));
		
		Reporter.log("Click to see Screenshot");
		Reporter.log("<a target=\" _blank\"href="+TestUtil.screenshotName+">Screenshot</a>");
		Reporter.log("<br>");
		Reporter.log("<br>");
		Reporter.log("<a target=\" _blank\"href="+TestUtil.screenshotName+">"
				+ "<img src="+TestUtil.screenshotName+" height=200 width=200></a>");
		
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestSkipped(ITestResult result) {
		test.log(LogStatus.SKIP, result.getName()+" Skipped the Testcase as the Runmode is NO");
		rep.endTest(test);
		rep.flush();
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
