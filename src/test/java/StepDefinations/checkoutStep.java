package StepDefinations;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.CheckoutPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class checkoutStep extends BaseClass {

	static CheckoutPage check;
	
	@When("click on checkout button")
	public void click_on_checkout_button() {
		 check= new CheckoutPage(); 
		 check.clickFunctionality();
	}
	
	
	@Then("validate URL")
	public void validate_url() {

		String URL=check.validateUrl();
		Assert.assertEquals(URL.contains("https://www.saucedemo.com/checkout-step-one.html"), true);
	}
	
}
