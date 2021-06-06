package demoproject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;



public class JenkinTest extends BaseClass{
	
	@BeforeSuite
	public void suite() {
		System.out.println("Im Before Suite of jenkins");
	}
	
	@BeforeClass
	public void reporting() {
		
		
		System.out.println("Im Beforeclass of jenkins");
		
	}
	
	
	@BeforeMethod
	public void setup()
	{
		//setupDriver();
		
	}
	
	@Test(priority=-3)
	public void Test1() throws IOException {
		System.out.println("Im Test1 of Jenkin CLass");
		//driver.get("https://www.amazon.ae/");
		System.out.println();
		
		//ExendReport.test1.log(LogStatus.PASS, "Akshay passed the test1");
		
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@Test(priority=-4)
	public void Test2() throws IOException {
		System.out.println("Im Test2 of jenkin CLass");
		driver.get("https://www.google.com/");
		ExendReport.test.log(LogStatus.PASS, "Akshay passed the test2");
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	
	@Test(priority=-5)
	public void Test3() throws IOException {
		System.out.println("Im Test3 of Jenkin CLass with priority0");
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		ExendReport.test.log(LogStatus.PASS, "Arun passed the test3");
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@AfterMethod
	public void teardown() {
		//driver.quit();
	}
	
	@AfterClass
	public void endTest() {
		
		ExendReport.reports.endTest(ExendReport.test);
		ExendReport.reports.endTest(ExendReport.test1);
		ExendReport.reports.flush();
		}
	
	
	@AfterSuite
	public void Asuite() {
		System.out.println("Im After Suite of jenkins");
	}

}
