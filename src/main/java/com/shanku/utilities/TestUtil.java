	package com.shanku.utilities;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.DataProvider;

import com.shanku.base.Page;

public class TestUtil extends Page {
	
	public static String screenshotPath;
	public static String screenshotName;
	
	
	public  static void captureScreenshot() throws IOException {
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		screenshotName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\target\\surefire-reports\\html\\"+screenshotName));
		
		
	}
	
	
	@DataProvider(name = "dp")
	public Object[][] getData(Method m) {
		String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int columns = excel.getColumnCount(sheetName);
		
		Object[][] data = new Object[rows-1][columns];
		
		for(int rowNum = 2;rowNum<=rows;rowNum++)
		{
			for(int colNum = 0;colNum<columns;colNum++)
			{
				data[rowNum-2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
			}
		}
		
		return data;
		
	}
	
	public static boolean isTestRunnable(String testname,ExcelReader excel) {
		String sheetName = "Test_Suite";
		int rows = excel.getRowCount(sheetName);
		for(int rNum=2;rNum<=rows;rNum++) {
			String testCase=excel.getCellData(sheetName, "TCID", rNum);
			System.out.println("Testcase from excel is "+testCase);
			if(testCase.equalsIgnoreCase(testname)) {
				String runmode=excel.getCellData(sheetName, "Runmode", rNum);
				if(runmode.equalsIgnoreCase("Yes")) 
					return true;
				else 
					return false;	
			}
			
		}
		
		return false;	
	}




}
