package demoproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("deviceName", "37928915");
		cap.setCapability("platformName", "Android");
		cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(CapabilityType.VERSION, "10.0");
		
		
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"),cap);
		
		driver.get("https://www.udemy.com/course/rest-api-automation-testing-rest-assured/");
		

	}

}
