package demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {
	
	WebDriver driver;
	
	public void setupDriver() {
		
		System.setProperty("webdriver.chrome.driver", "F:/Project/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		
	}

}
