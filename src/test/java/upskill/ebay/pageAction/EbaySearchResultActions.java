package upskill.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import upskill.ebay.pageElements.EbaySearchResultLocators;
import upskill.utilities.SetupDrivers;

public class EbaySearchResultActions {

	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver, EbaySearchResultLocatorsObj);
		}
	
	public void verifyShoesItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shoes", EbaySearchResultLocatorsObj.txtShoes.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShoes.isDisplayed();
		
	}
	
	public void verifyShirtItems(){
		
		//Option 1
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirt.isDisplayed());
		
		//Option 2
		Assert.assertEquals("Shirts", EbaySearchResultLocatorsObj.txtShirt.getText());
		
		//Option 3
		EbaySearchResultLocatorsObj.txtShirt.isDisplayed();
		
	}
	
	public void verifyLaptopItems(){
		EbaySearchResultLocatorsObj.txtLaptop.isDisplayed();
	}
	
	public void ValidateSignin(){
		EbaySearchResultLocatorsObj.txtHi.isDisplayed();
	}
	
	public void filterBrand(String brand){
		if(brand.equals("Adidas")){
			EbaySearchResultLocatorsObj.chbxBrandAdidas.click();
		} else if(brand.equals("Nike")){
			EbaySearchResultLocatorsObj.chbxBrandNike.click();
		} else if(brand.equals("Unbranded")){
			EbaySearchResultLocatorsObj.chbxBrandUnbranded.click();
		} else {
			System.out.println("Brand not Found");
		}
	}
	
	public void verifyBrandItems(String brand){
	
	if(brand.equals("Adidas")){
	Assert.assertTrue(EbaySearchResultLocatorsObj.txtShirt.isDisplayed());
	} else if(brand.equals("Nike")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtShoes.isDisplayed());
	} else if(brand.equals("Unbranded")){
		Assert.assertTrue(EbaySearchResultLocatorsObj.txtPants.isDisplayed());
	} else {
		System.out.println("Brand not Found");
	}
	
	}
	
	public void SelectBigTallTeeShirt() throws Exception{
		Thread.sleep(3000);
		EbaySearchResultLocatorsObj.slctFstShirt.click();
		Thread.sleep(3000);
	}
}
