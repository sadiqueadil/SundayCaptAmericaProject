package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import upskill.ebay.pageElements.EbayHomepageLocators;
import upskill.utilities.SetupDrivers;

public class EbayHomepageActions {
	
	EbayHomepageLocators EbayHomepageLocatorsObj;
	
	public EbayHomepageActions(){
		EbayHomepageLocatorsObj = new EbayHomepageLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayHomepageLocatorsObj);
		}
	
	
	public void searchShoes(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shoes");
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchShirt(){
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Shirts");
	}
	
	public void searchButton(){
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	public void searchLaptop() throws InterruptedException{
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys("Laptop");
		Thread.sleep(2000);
		EbayHomepageLocatorsObj.btnSearch.click();
	}
	
	
	public void ClickSighIn(){
		EbayHomepageLocatorsObj.lnkSigninPath.click();
		
	}
	
	public void WriteEmail() throws InterruptedException{
		EbayHomepageLocatorsObj.txtBoxUserPath.sendKeys("sadiqueadil");
		EbayHomepageLocatorsObj.BtnContPath.click();
		Thread.sleep(2000);
	}
	
	public void WritePass() throws InterruptedException{
		EbayHomepageLocatorsObj.txtBoxPassPath.sendKeys("Sadique82");
		EbayHomepageLocatorsObj.BtnSigninPath.click();
		Thread.sleep(2000);
	}
	
	public void searchItems(String items) throws Exception{
		EbayHomepageLocatorsObj.txtbxSearch.sendKeys(items);
		Thread.sleep(2000);
		EbayHomepageLocatorsObj.btnSearch.click();
		Thread.sleep(2000);
		
		//EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
	}
	
	public void mouseHover() throws Exception{
		Actions mouseHoverObj = new Actions(SetupDrivers.driver);
		mouseHoverObj.moveToElement(EbayHomepageLocatorsObj.myEbayMH);
		mouseHoverObj.perform();
		Thread.sleep(2000);
	}
	
	public void clickSummary() throws Exception{
		EbayHomepageLocatorsObj.summaryLink.isEnabled();
		EbayHomepageLocatorsObj.summaryLink.click();
		Thread.sleep(2000);
	}

	
	public void synchronization(){
		// Selenium Wait : 
			//	1. Implicit wait(Global), (No such Elements)
			//	2. Explicit wait(Specific Conditional), (Element Not Visible)
			//	3. Fluent wait(intermittent)
			
		//Implicit Wait
		SetupDrivers.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Explicit Wait (Popular in Selenium)
		WebDriverWait explicitWait = new WebDriverWait(SetupDrivers.driver, 10);
		explicitWait.until(ExpectedConditions.elementToBeClickable(EbayHomepageLocatorsObj.btnSearch));
		
		//Fluent Wait
		FluentWait fluentWait = new FluentWait(SetupDrivers.driver);								
		fluentWait.withTimeout(10, TimeUnit.SECONDS);
		fluentWait.pollingEvery(2, TimeUnit.SECONDS);
	}
	
	public void keyboardKeys(){
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.ENTER);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.UP);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DOWN);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.CLEAR);
		EbayHomepageLocatorsObj.btnSearch.sendKeys(Keys.DELETE);
	}
	
	public void handleAlert(){  // *Simple Alert *Confirmation Alert *
		SetupDrivers.driver.switchTo().alert().accept(); 	
		SetupDrivers.driver.switchTo().alert().dismiss();	
		SetupDrivers.driver.switchTo().alert().getText();
		SetupDrivers.driver.switchTo().alert().sendKeys("awesome");
	}
	
public void javaScriptExecutor(){
		
		JavascriptExecutor js = (JavascriptExecutor)SetupDrivers.driver;	//Creating JS object
		
		js.executeScript("");
		
		js.executeScript("EbayHomepageLocatorsObj.btnSearch.click();"); //Clicking on element
		
		js.executeScript("EbayHomepageLocatorsObj.txtbxSearch.value ='shirt';"); //Writing something
		
		js.executeScript("EbaySearchResultLocatorsObj.cbxBrandNike.checked=true;"); //Interect Checkbox
		
		js.executeScript("window.location = 'http://upskill.com';"); // initializing location
		
		js.executeScript("location.reload()"); 						//Refresh browser
		
		js.executeScript("alert('Confirmation');");					//Alert
		
		js.executeScript("arguments[0].scrollIntoView();", EbayHomepageLocatorsObj.btnSearch);  //Scroll to a object
	
		js.executeScript("window.scrollBy(0,500)", ""); 			//Scroll down to specific pixel
		
		js.executeScript("window.scrollBy(0,-500)", ""); 			//Scroll up to specific pixel
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)"); //Scroll down to bottom of website
		
	}

}
