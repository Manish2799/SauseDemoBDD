package StepDefinations;

import BaseLayer.BaseClass;
import io.cucumber.java.AfterAll;

public class Hooks extends BaseClass{

	@AfterAll
	public static void terminate()
	{
		driver.quit();
	}
	
}
