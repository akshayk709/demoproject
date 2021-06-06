package demoproject;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExendReport {
	
	static ExtentReports reports;
	static ExtentTest test;
	static ExtentTest test1;
	
	public void reporting() {
		String basepath = System.getProperty("user.dir");
		reports = new ExtentReports(basepath+"\\target\\myreport.html");
		test1 = reports.startTest("Test1");
		test = reports.startTest("Test3");
		
	}
	
	

}
