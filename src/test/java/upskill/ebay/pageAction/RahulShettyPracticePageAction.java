package upskill.ebay.pageAction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.RahulShettyPracticePageLocator;
import upskill.utilities.SetupDrivers;

public class RahulShettyPracticePageAction {
	RahulShettyPracticePageLocator RSPPLocator;
	
	public RahulShettyPracticePageAction(){
		RSPPLocator = new RahulShettyPracticePageLocator();
	PageFactory.initElements(SetupDrivers.driver, RSPPLocator);
		
	}
	
	public void loadShettyPracticePage() throws Exception{
		SetupDrivers.driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
	}
	
	public void typeNameClickAlert() throws Exception{
		Thread.sleep(3000);
		RSPPLocator.txtBxaltEx.sendKeys("Sadique");
		Thread.sleep(3000);
		RSPPLocator.btnAlert.click();
		Thread.sleep(3000);
	}
	
	public void linkIShettyframeHome() throws Exception{
		List<WebElement> framelist = SetupDrivers.driver.findElements(By.id("courses-iframe"));
		
		for(int i = 0; i<framelist.size(); i++)
		SetupDrivers.driver.switchTo().frame(i);
		
		try{
		RSPPLocator.iframeHomeBtn.click();
		} catch (Exception e){
			System.out.println("Element not Found in this iframe");
		}
		
	}
	
	public void verifyShettyframeHome() throws Exception{
		Thread.sleep(3000);
		RSPPLocator.iframeHomeBtn.isDisplayed();
	}

}
