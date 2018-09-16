package sampleTests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ErailHomePage;

public class ErailPNREnquiry {
	WebDriver driver;
	String URL = "https://erail.in/";
	String strPNR = "6717129844";
	ErailHomePage objErailHomePage;
	
	@BeforeSuite (description = "This test case opens browser.")	// It is run once, before all Tests in the suite
	public void browserSetup() throws InterruptedException {
	  System.out.println("Launching Browser");
	  
	  //Mention the path of chromedriver file.
	  System.setProperty("webdriver.chrome.driver", "D:/Eclipse Workspace/Softwares/chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("Chrome Browser is opened.");
	  
	  //Comment above section to use firefox browser
	  
	  /*
	  //Mention the path of firefoxdriver file.
	  System.setProperty("webdriver.gecko.driver","D:\\Eclipse Workspace\\Softwares\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  System.out.println("FireFox Browser is opened.");
	  */
	  
	  driver.manage().window().maximize();
	  System.out.println("Browser is maximized.");
	}

	@BeforeTest (alwaysRun = true, enabled = true)
	public void openURL() throws Exception {
		driver.get(URL);
		System.out.println("URL is opened.");
	}

  @Test (description = "This method is to perform various operations.", enabled = true)
  public void checkPNRStatus() throws IOException, InterruptedException {
	  
	  objErailHomePage = new ErailHomePage(driver);
	  
		FileInputStream fis = new FileInputStream("D:\\Eclipse Workspace\\PracticeProject\\test-input\\PNRs.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
	    
		//Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
		for(int i = 1; i<=2; i++) {
			String PNRValue = sheet.getRow(i).getCell(0).getRawValue();
			System.out.println(PNRValue);
			objErailHomePage.checkPNR(PNRValue);
			Thread.sleep(2000);
		}
		
	  try {
		File SrcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    //Move image file to new destination
	    File DestFile=new File("D:\\Eclipse Workspace\\PracticeProject\\test-output\\test.png");
	    //Copy file at destination
	    FileUtils.copyFile(SrcFile, DestFile);
	  
	  	} catch (Exception e) {
			System.out.println("Screenshot not captured.");
			e.printStackTrace();
	  		}
	  
	  //objErailHomePage.printColour();
	  //objErailHomePage.checkPNR(strPNR);
	  //System.out.println("PNR requested is : "+objErailHomePage.getPNR());
	  //objErailHomePage.getSizeOfBox();
	  //objErailHomePage.getallCheckBoxes();
	  //objErailHomePage.selectTatkal();
  }
  
  @AfterSuite(description = "This test closes the opened browser.")	// It is run once, after all Tests in the suite
  public void afterSuite() {
	  System.out.println("Tests completed.. Now closing browser");
	  driver.quit();
  }


}
