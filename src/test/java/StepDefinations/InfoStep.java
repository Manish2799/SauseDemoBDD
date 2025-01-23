package StepDefinations;

import BaseLayer.BaseClass;
import PageLayer.InformationPage;
import io.cucumber.java.en.Given;

public class InfoStep extends BaseClass {

	static InformationPage informationPage;

	@Given("user fills firstName, lastName, pincode")
	public void user_fills_first_name_last_name_pincode() {
		informationPage = new InformationPage();
		informationPage.userfillsfirstNamelastNamepincode();

	}

	@Given("click on continue button")
	public void click_on_continue_button() {
		informationPage.clickoncontinuebutton();

	}

}
