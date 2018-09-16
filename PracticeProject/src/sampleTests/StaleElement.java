package sampleTests;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class StaleElement extends BaseClass{
	
	String URL = "https://erail.in/";
	
	@BeforeTest (alwaysRun = true, description = "This test case is to open URL in browser.")
	public void openURL() {
		driver.get(URL);
		System.out.println("URL is opened.");
	}
	
	@Test()
	public void checkBrokenLinks() {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links are: "+links.size());
		
		for(int i=0; i<links.size()-125; i++) {
			String url = links.get(i).getAttribute("href");
			try {
				
				URL link = new URL(url);
				HttpURLConnection httpURLConnect=(HttpURLConnection)link.openConnection();
				httpURLConnect.setConnectTimeout(3000);
				httpURLConnect.connect();
				System.out.println((i+1)+") Response code for URL: "+url+" is: "+httpURLConnect.getResponseCode());
				
			}
			catch(IOException e) {
				e.printStackTrace();
				System.out.println("Broken URL is: "+url);
			}
		}
	}
	
	@Test(enabled = false)
	public void handleWindows() {
		String mainHandle= driver.getWindowHandle();
		System.out.println("Main Window Handle: "+mainHandle);
		driver.findElement(By.id("button1")).click();
		Set handles = driver.getWindowHandles();
		//System.out.println(handles);
		Iterator i=handles.iterator();
		while (i.hasNext()) {
			String str = (String) i.next();
			driver.switchTo().window(str);
			System.out.println(str);
		}
            driver.close();
		
		for(String popup : driver.getWindowHandles())
		{
			//driver.switchTo().window(popup); 
			//System.out.println(popup);
			
		}
			
	}
	
	@Test(enabled = false)
	public void checkTextInPage() {
		String textToSearch = "Indian Railways Enquiry PNR Status Live Status IRCTC Reservation Seats";
		String pageSource = driver.getPageSource();
		boolean isTextPresent = pageSource.contains(textToSearch);
		System.out.println(isTextPresent);
	}
	
	@Test (enabled = false)
	public void getExe() throws InterruptedException {
		System.out.println("Testing Method.");
		WebElement Search_Box = driver.findElement(By.xpath("//*[@id='lst-ib']"));
		Search_Box.sendKeys("Hello");
		Search_Box.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		for(int i=0; i<4;i++)
            try {
             driver.findElement(By.xpath("//*[@id='lst-ib']")).clear();
             System.out.println("Cleared.");
                break;
            } 
			catch(StaleElementReferenceException e) {
            e.toString();
            System.out.println("Recovering from a stale element :" + e.getMessage());
			}
 
		//Search_Box.clear(); 
	  
	}
	
	@AfterTest(alwaysRun = true)
	public void clearMemory() {
		Runtime.getRuntime().gc();
	}
}
