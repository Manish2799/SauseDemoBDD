package StepDefinations;

import java.io.IOException;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginStep extends BaseClass {

	static LoginPage login;

	@Given("user is on login page")
	public void user_is_on_login_page() {

		try {
			BaseClass.initialization();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() {

		login = new LoginPage();

		login.userentervalidusernameandpassword();
	}

	@When("click on login button")
	public void click_on_login_button() {

		login.clickonloginbutton();
	}

	
}
