package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomepageLocators {
	
	//Search Text Box
	@FindBy(xpath="//input[@placeholder='Search for anything']")
	public WebElement txtbxSearch;
	
	//Click Button
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
	
	
	//Click Sign in link
	@FindBy(xpath="(//a[text()='Sign in'])[1]")
	public WebElement lnkSigninPath;
		
	//TextBox Email or User
	@FindBy(xpath="//input[@type='text']")
	public WebElement txtBoxUserPath;
		
	//Click Cont button
	@FindBy(xpath="//button[@id= 'signin-continue-btn']")
	public WebElement BtnContPath;
			
	//TextBox Password
	@FindBy(xpath="//input[@type= 'password']")
	public WebElement txtBoxPassPath;
			
	//Click Sign In button
	@FindBy(xpath="//button[text()= 'Sign in']")
	public WebElement BtnSigninPath;
	
	//Ebay Mouse Hover MyEbay
	@FindBy(xpath="//a[@title='My eBay']")
	public WebElement myEbayMH;
	
	//Ebay Summary
		@FindBy(xpath="//a[text()=' Summary']")
		public WebElement summaryLink;
	
	
	
}
