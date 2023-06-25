package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyAlertLocator {
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement txtBxaltEx;
	
	@FindBy(xpath="//input[@id='confirmbtn']")
	public WebElement btnConfirm;

}