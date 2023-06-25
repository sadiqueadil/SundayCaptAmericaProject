package upskill.ebay.stepDef;

import cucumber.api.java.en.Then;
import upskill.ebay.pageAction.RahulShettyAlertAction;

public class RahulShettyAlertStep {
	RahulShettyAlertAction RSAlertAction = new RahulShettyAlertAction();
	
	@Then("^Handle the Pop-Up Simple Alert with OK Button$")
	public void handle_the_Pop_Up_Simple_Alert_with_OK_Button() throws Throwable {
		RSAlertAction.handleAlertOK();
	}

	@Then("^Type Your Name Under Switch To Alert Example Text Box and Click Confirm Button$")
	public void type_Your_Name_Under_Switch_To_Alert_Example_Text_Box_and_Click_Confirm_Button() throws Throwable {
		RSAlertAction.typeNameClickConfirm();
	}

	@Then("^Handle the Pop-Up Confirmation Alert with Cancel Button$")
	public void handle_the_Pop_Up_Confirmation_Alert_with_Cancel_Button() throws Throwable {
		RSAlertAction.handleAlertCancel();
	}
}
