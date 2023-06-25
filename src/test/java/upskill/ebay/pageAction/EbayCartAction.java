package upskill.ebay.pageAction;

//import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import upskill.ebay.pageElements.EbayCartLocator;
import upskill.utilities.ReadExcelSheet;
import upskill.utilities.SetupDrivers;

public class EbayCartAction {
	
	EbayCartLocator EbayCartLocatorObj;
	Select dropDownObj;
	
	public EbayCartAction(){
		EbayCartLocatorObj = new EbayCartLocator();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorObj);
		}
	
	public void switchNewWindow(){
		//for loop > String varwinhandle: > SetupDrivers.driver.getWindowHandles()
		
		for(String winhadle: SetupDrivers.driver.getWindowHandles()){
		SetupDrivers.driver.switchTo().window(winhadle);
		}
	}
	
	/*
	public void switchOnSpecificWindowByIndex(){

		List<String> windowHandles = new ArrayList<>(SetupDrivers.driver.getWindowHandles());
		int windowIndex = 1; // Index of the window you want to switch to (0-based index)

		SetupDrivers.driver.switchTo().window(windowHandles.get(windowIndex));
	}
	
	public void switchOnSpecificWindowByTitle(){
		String desiredTitle = "My Desired Window Title";

		for (String windowHandle : SetupDrivers.driver.getWindowHandles()) {
			SetupDrivers.driver.switchTo().window(windowHandle);
		    if (SetupDrivers.driver.getTitle().equals(desiredTitle)) {
		        break;
		    }
		}
	}
	*/

	public void selectShirtSize() throws Exception{
		Thread.sleep(2000);
		dropDownObj = new Select(EbayCartLocatorObj.slctSize);
		//dropDownObj.selectByVisibleText("Big & Tall");
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Size"));
		Thread.sleep(2000);
	}
	
	public void selectMenSize() throws Exception{
		Thread.sleep(2000);
		dropDownObj = new Select(EbayCartLocatorObj.slctMenSize);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("MenSize"));
		//dropDownObj.selectByVisibleText("8XLT");
		Thread.sleep(2000);
	}
	
	public void selectShade() throws Exception{
		Thread.sleep(2000);
		dropDownObj = new Select(EbayCartLocatorObj.slctShade);
		dropDownObj.selectByVisibleText(ReadExcelSheet.getMapData("Shade"));
		//dropDownObj.selectByVisibleText("White");
		Thread.sleep(2000);
	}
	
	public void writeQuantity() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorObj.txtBxQty.clear();
		Thread.sleep(1000);
		EbayCartLocatorObj.txtBxQty.sendKeys(ReadExcelSheet.getMapData("Quantity"));
		//EbayCartLocatorObj.txtBxQty.sendKeys("2");
		Thread.sleep(2000);
	}
	
	public void addToCart() throws Exception{
		Thread.sleep(2000);
		EbayCartLocatorObj.addCrtBtn.click();
		Thread.sleep(3000);
	}

}
