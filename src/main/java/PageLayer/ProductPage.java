package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.ElementHelper;
import UtilityLayer.HandleDropdown;

public class ProductPage extends BaseClass {

	@FindBy(className = "product_sort_container")
	private WebElement dropSort;

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement addProduct1;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement addProduct2;

	@FindBy(id = "shopping_cart_container")
	private WebElement clickContainer;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

	public void userisonproductpage() {
		HandleDropdown.selectByVisibleText(dropSort, "Price (high to low)");

	}

	public void useraddproducts() {
		ElementHelper.click(addProduct1);
		ElementHelper.click(addProduct2);

	}

	public void clickonshopingcartcontainerbutton() {
		ElementHelper.click(clickContainer);

	}
}
