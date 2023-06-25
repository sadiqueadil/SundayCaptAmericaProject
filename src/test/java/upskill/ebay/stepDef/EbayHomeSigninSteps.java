package upskill.ebay.stepDef;


import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomepageActions;

public class EbayHomeSigninSteps {
	
	EbayHomepageActions EbayHomepageActionsObj = new EbayHomepageActions();
	
	@When("^Click on the Homepage Signin link$")
	public void click_on_the_Homepage_Signin_link() throws Throwable {
		EbayHomepageActionsObj.ClickSighIn();
		Thread.sleep(2000);
	}

	@When("^Write Username and Click Continue Button$")
	public void write_Username_and_Click_Continue_Button() throws Throwable {
		EbayHomepageActionsObj.WriteEmail();
		Thread.sleep(2000);
	}

	@When("^Write Password and Click Signin$")
	public void write_Password_and_Click_Signin() throws Throwable {
		EbayHomepageActionsObj.WritePass();
		Thread.sleep(2000);
	}
}
