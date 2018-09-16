package sampleTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass {
	static WebDriver driver;

	@BeforeSuite (description = "This test case opens browser.")	// It is run once, before all Tests in the suite
	public void browserSetup() throws InterruptedException {
		System.out.println("Inside BeforeSuite:");
	  System.setProperty("webdriver.chrome.driver", "D:/Eclipse Workspace/Softwares/chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("Chrome Browser is opened.");
	  driver.manage().window().maximize();
	  System.out.println("Browser is maximized. Now exiting BeforeSuite.");
	}
	
	@AfterSuite()
	public void closeBroser() {
		driver.quit();
		System.gc();
	}
}
