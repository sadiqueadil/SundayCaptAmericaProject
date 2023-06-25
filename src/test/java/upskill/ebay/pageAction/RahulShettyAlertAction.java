package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import upskill.ebay.pageElements.RahulShettyAlertLocator;
import upskill.utilities.SetupDrivers;

public class RahulShettyAlertAction {
	RahulShettyAlertLocator RSAlertLocator;
	
	public RahulShettyAlertAction(){
		RSAlertLocator = new RahulShettyAlertLocator();
		PageFactory.initElements(SetupDrivers.driver, RSAlertLocator);
	}
	
	public void handleAlertOK() throws Exception{
		SetupDrivers.driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	
	public void typeNameClickConfirm() throws Exception{
		RSAlertLocator.txtBxaltEx.sendKeys("Sohagh");
		RSAlertLocator.btnConfirm.click();
		Thread.sleep(2000);
	}
	
	public void handleAlertCancel() throws Exception{
		Thread.sleep(2000);
		SetupDrivers.driver.switchTo().alert().dismiss();
	}
	
	

}
