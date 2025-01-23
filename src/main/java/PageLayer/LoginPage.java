package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;

public class LoginPage extends BaseClass{

	@FindBy(name="user-name")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(name="login-button")
	private WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void userentervalidusernameandpassword() {
		
		ElementHelper.sendKeys(username, "standard_user");
		
		ElementHelper.sendKeys(password, "secret_sauce");
		
		}
	public void clickonloginbutton() 
	{
		ElementHelper.click(loginbutton);
	}

	
	
	
}
