package sampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RightClass {
	
	//@FindBy(id="btnLive")
	//WebElement GetLiveStatus;
	By GetLiveStatus = By.id("btnLive");
	
  @Test
  public void RightClickOn() {
	  WebDriver driver;
		String URL = "https://news.google.com/";
		System.setProperty("webdriver.chrome.driver", "D:/Eclipse Workspace/Softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(200,5000)");
		
		/*
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 5);
		action.contextClick(driver.findElement(GetLiveStatus)).build().perform();
		*/
  }
}
