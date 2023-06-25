package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.RahulShettyPracticePageAction;

public class RahulShettyPracticePageStep {
	
	RahulShettyPracticePageAction RSPageAction = new RahulShettyPracticePageAction();
	
	@Given("^Open Rahul Shetty Automation Practice Page$")
	public void open_Rahul_Shetty_Automation_Practice_Page() throws Throwable {
		RSPageAction.loadShettyPracticePage();
		Thread.sleep(3000);
	}
	
	@When("^Type Your Name Under Switch To Alert Example Text Box and Click Alert Button$")
	public void type_Your_Name_Under_Switch_To_Alert_Example_Text_Box_and_Click_Alert_Button() throws Throwable {
		RSPageAction.typeNameClickAlert();
		Thread.sleep(2000);
	}
	
	@When("^Click on iFrame Home$")
	public void click_on_iFrame_Home() throws Throwable {
		RSPageAction.linkIShettyframeHome();
	}
	
	@Then("^It should reload iframe homepage$")
	public void it_should_reload_iframe_homepage() throws Throwable {
		RSPageAction.verifyShettyframeHome();
	}

}
