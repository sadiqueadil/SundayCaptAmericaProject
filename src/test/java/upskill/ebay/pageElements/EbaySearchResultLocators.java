package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {
	
	//Validate Shoes Items
		@FindBy(xpath="//span[text()='Shoes']")
		public WebElement txtShoes;
	
		
	//Validate Shirt Items
		@FindBy(xpath="//span[(text()='Shirts')]")
		public WebElement txtShirt;
		
		
	//Verify Login
		@FindBy(xpath="//button[contains(text(),'Hi')]")
		public WebElement txtHi;
		
	//Verify Laptop Items
		@FindBy(xpath="//span[(text()='Laptop')]")
		public WebElement txtLaptop;
	
	//Verify Pants Items
		@FindBy(xpath="//span[2][contains(text(), 'Pants')]")
		public WebElement txtPants;
		
		
	//	Check Brand Adidas
		@FindBy(xpath="//input[@aria-label='adidas']")
		public WebElement chbxBrandAdidas;
		
	//	Check Brand Nike
		@FindBy(xpath="//input[@aria-label='Nike']")
		public WebElement chbxBrandNike;

	//	Check Brand Unbranded
		@FindBy(xpath="//input[@aria-label='Unbranded']")
		public WebElement chbxBrandUnbranded;
		
	//	Select First Shirt Big Tall
		@FindBy(xpath="//span[text()='Big & Tall Cotton Tee. Sizes 4 XLT to 8XLT. With & without pockets. MADE IN USA']")
		public WebElement slctFstShirt;
			
		
}
