package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocator {

		//Shirt Size Type
		@FindBy(xpath="//select[@aria-label='Please select a Size Type']")
		public WebElement slctSize;
		
		//Shirt Men Size
		@FindBy(xpath="//select[@id='x-msku__select-box-1001']")
		public WebElement slctMenSize;


		//Shirt Shade
		@FindBy(xpath="//select[@id='x-msku__select-box-1002']")
		public WebElement slctShade;

		
		//Shirt Quantity
		@FindBy(xpath="//input[@id='qtyTextBox']")
		public WebElement txtBxQty;

		//Add to Cart
		@FindBy(xpath="//span[contains(text(),'Add to cart')]")
		public WebElement addCrtBtn;
}
