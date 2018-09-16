package pages;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ErailHomePage {
	 /**
     * All WebElements are identified by @FindBy annotation
     */

    WebDriver driver;

    @FindBy(id="txtPNR")
    WebElement txtPNR;

    @FindBy(xpath = "//a[contains(@title,'Click to get the Status of PNR')]")
    WebElement lnkPNRStatus;
    
    @FindBy(xpath = "//select[@title='Select seat reservation quota']")
    WebElement DDQuota;

    @FindBy(xpath = "//input[contains(@value,'Get Trains')]")
    WebElement btnGetTrains;
    
	public ErailHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void printColour() {
		System.out.println("Colour of Get Trains button is: " +btnGetTrains.getCssValue("color"));
	}
	//Set PNR in the textbox and click on 'PNR Status' link.
	public void checkPNR(String strPNR){
		txtPNR.clear();
		txtPNR.sendKeys(strPNR);
		lnkPNRStatus.click();
	}
	
	public String getPNR() {
			//	.getText() function cannot be used for user typed text.
		//System.out.println(txtPNR.getAttribute("value"));
		return (txtPNR.getAttribute("value"));
	}
	
	public void getSizeOfBox() {
		System.out.println("Height is: "+txtPNR.getSize().getHeight());
		System.out.println("Width is: "+txtPNR.getSize().getWidth());
	}
	
	public void getallCheckBoxes() {
		List<WebElement> listCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println("No. of checkboxes is "+listCheckBoxes.size());
		
		for(WebElement l1:listCheckBoxes)
			l1.click();
	}

	public void selectTatkal() {
		List<WebElement> list = DDQuota.findElements(By.tagName("option"));
		for(WebElement DDValues:list)
			System.out.println(DDValues.getText());
		Select select = new Select (DDQuota);
		select.selectByVisibleText("Ladies");
	}
  
	  
}
