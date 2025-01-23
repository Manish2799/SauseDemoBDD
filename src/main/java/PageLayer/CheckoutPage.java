package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;

public class CheckoutPage extends BaseClass{

	
	@FindBy(id="checkout")
	WebElement checkoutButton;
	
	
	public CheckoutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String validateUrl()
	{
		return driver.getCurrentUrl();
	}
	

	public void clickFunctionality()
	{
		ElementHelper.click(checkoutButton);
	}
}
