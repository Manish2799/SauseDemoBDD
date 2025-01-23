package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;

public class InformationPage extends BaseClass {

	@FindBy(id = "first-name")
	private WebElement fName;

	@FindBy(id = "last-name")
	private WebElement lName;

	@FindBy(id = "postal-code")
	private WebElement pincode;

	@FindBy(id = "continue")
	private WebElement clickContinue;

	public InformationPage() {
		PageFactory.initElements(driver, this);
	}

	public void userfillsfirstNamelastNamepincode() {

		ElementHelper.sendKeys(fName, "Shriya");
		ElementHelper.sendKeys(lName, "Jadhav");
		ElementHelper.sendKeys(pincode, "411010");

	}

	public void clickoncontinuebutton() {
		ElementHelper.click(clickContinue);

	}

}
