package StepDefinations;

import BaseLayer.BaseClass;
import PageLayer.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ProductStep extends BaseClass {

	static ProductPage product;

	@Given("user is on productpage")
	public void user_is_on_productpage() {
		product = new ProductPage();
		product.userisonproductpage();

	}

	@When("user sorts poroduct and add products")
	public void user_sorts_poroduct_and_add_products() {
		product.useraddproducts();

	}

	@When("click on shoping cart container button")
	public void click_on_shoping_cart_container_button() {
		product.clickonshopingcartcontainerbutton();

	}

}
