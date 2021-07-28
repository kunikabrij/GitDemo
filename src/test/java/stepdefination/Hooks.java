package stepdefination;

import org.openqa.selenium.WebDriver;

import cucumberautomation.Base;
import io.cucumber.java.After;

public class Hooks extends Base {

	@After("@seleniumTest")
	public void afterValidation() {
		driver.quit();
	}
}
