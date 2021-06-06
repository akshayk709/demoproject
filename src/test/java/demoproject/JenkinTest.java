package demoproject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class JenkinTest extends BaseClass{
	static ExtentReports reports;
	static ExtentTest test;
	static ExtentTest test1;
	
	@BeforeClass
	public void reporting() {
		
		String basepath = System.getProperty("user.dir");
		
		reports = new ExtentReports(basepath+"\\target\\myreport.html");
		test1 = reports.startTest("Test1");
		test = reports.startTest("Test3");
	}
	
	
	@BeforeMethod
	public void setup()
	{
		setupDriver();
		
	}
	
	@Test
	public void Test1() throws IOException {
		
		driver.get("https://www.amazon.ae/");
		System.out.println();
		
		test1.log(LogStatus.PASS, "Akshay passed the test1");
		
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@Test
	public void Test2() throws IOException {
		
		driver.get("https://www.google.com/");
		test.log(LogStatus.PASS, "Akshay passed the test2");
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	
	@Test
	public void Test3() throws IOException {
		
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		test.log(LogStatus.PASS, "Arun passed the test3");
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
	@AfterClass
	public void endTest() {
		
		reports.endTest(test);
		reports.endTest(test1);
		reports.flush();
		}

}
