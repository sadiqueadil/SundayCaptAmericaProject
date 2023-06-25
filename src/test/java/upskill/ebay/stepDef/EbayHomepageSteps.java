package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomepageSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
		Thread.sleep(2000);
	}

	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
		EbayHomepageActionsObj.searchShoes();
		Thread.sleep(2000);
	}
	
	@When("^Search for Shirt$")
	public void search_for_Shirt() throws Throwable {
		EbayHomepageActionsObj.searchShirt();   
	}
	
	@When("^Click Search Button$")
	public void click_Search_Button() throws Throwable {
		EbayHomepageActionsObj.searchButton();
	}
	
	@When("^Search for Laptop$")
	public void search_for_Laptop() throws Throwable {
		EbayHomepageActionsObj.searchLaptop();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomepageActionsObj.searchItems(items);
		Thread.sleep(2000);
	}
	
	@Given("^Search for Big Tall Cotton Tee Made USA$")
	public void search_for_Big_Tall_Cotton_Tee_Made_USA() throws Throwable {
		EbayHomepageActionsObj.searchItems("Big Tall Cotton Tee Made USA");
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
		EbayHomepageActionsObj.mouseHover();
	}
	
	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
		EbayHomepageActionsObj.clickSummary();
	}
	
}
