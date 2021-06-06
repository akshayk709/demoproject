package demoproject;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class AkshayTest extends BaseClass{
	
	LoginPage l1 = new LoginPage();
	
	@BeforeClass
	public void before() {
		
		System.out.println("Im Before CLass");
			setupDriver();	
	}
	
	
	@Test(priority=-1)
	public void Test1() throws IOException {
		System.out.println("Im Test1 of Akshay CLass");
		
		System.out.println(l1.logindata());
		driver.get("https://www.amazon.ae/");
		System.out.println();
		
		ExendReport.test1.log(LogStatus.PASS, "Akshay passed the test1");
		
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@Test(priority=-2)
	public void Test2() throws IOException {
		System.out.println("Im Test2 of Akshay CLass");
		//driver.get("https://www.google.com/");
		//test.log(LogStatus.PASS, "Akshay passed the test2");
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	
	@Test
	public void Test3() throws IOException {
		System.out.println("Im Test3 of Akshay CLass");
		driver.navigate().to("https://www.naukri.com/nlogin/login?URL=http://www.naukri.com/mnjuser/profile?id=&orgn=homepage");
		ExendReport.test.log(LogStatus.PASS, "Arun passed the test3");
		//Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		//ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	//@AfterClass
	public void After() {
		
		driver.quit();
	}

}
