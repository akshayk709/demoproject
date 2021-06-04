package demoproject;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class JenkinTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:/Project/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test1() throws IOException {
		
		driver.get("https://www.amazon.ae/");
		System.out.println("Commit Test");
		Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@Test
	public void Test2() throws IOException {
		
		driver.get("https://www.google.com/");
		
		Screenshot src = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(src.getImage(), "PNG", new File("F:\\Project\\result.png"));
	}
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}

}
