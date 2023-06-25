package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import upskill.ebay.pageAction.EbaySearchResultActions;

public class EbaySigninResultSteps {
	
	EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Then("^The user Should Have Logged in Successfully$")
	public void the_user_Should_Have_Logged_in_Successfully() throws Throwable {
		EbaySearchResultActionsObj.ValidateSignin();
		Thread.sleep(2000);
	}


}
