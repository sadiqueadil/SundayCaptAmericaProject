package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RahulShettyPracticePageLocator {
	
	@FindBy(xpath="//input[@id='name']")
	public WebElement txtBxaltEx;
	
	@FindBy(xpath="//input[@id='alertbtn']")
	public WebElement btnAlert;
	
	@FindBy(xpath="(//a[text()='Home'])[1]")
	public WebElement iframeHomeBtn;

}
