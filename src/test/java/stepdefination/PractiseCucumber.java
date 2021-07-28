package stepdefination;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;

import cucumberautomation.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PractiseCucumber {
	public WebDriver driver;
	String URL = "https://rahulshettyacademy.com/seleniumPractise/#/";

	@Given("User is on greenkart home page")
	public void User_is_on_greenkart_home_page() throws IOException {
		driver = Base.getDriver();
		// driver.get("url");
		driver.manage().window().maximize();
	}

	@When("User searchs for {string} in the search box")
	public void user_search_for_in_the_search_box(String string1) throws Throwable {
		// System.out.println(string1);
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string1);
		Thread.sleep(3000);

	}

	@Then("{string} results are displayed")
	public void results_are_displayed(String string) {
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(string));
	}

	@And("added items to the bag")
	public void added_items_to_the_bag() {
		driver.findElement(By.xpath("//*[@class='increment']")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]")).click();// button[contains(text)='ADD
																							// TO CART')]

	}

	@And("proceed for the check out")
	public void proceed_for_the_check_out() {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}

	@Then("Verify selected {string} is displayed in the checkout page")
	public void verify_selected_is_displayed_in_the_checkout_page(String string) {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(string));
		//driver.close();
	}

	@When("^User search for (.+) in the search box$")
	public void user_search_for_beet_root_in_the_search_box(String string) throws InterruptedException {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(string);
		Thread.sleep(3000);
	}

	@Then("^Verify selected (.+) is displayed in the checkout page$")
	public void verify_selected_beet_root_is_displayed_in_the_checkout_page(String string2) {
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(string2));
		//driver.close();
	}
}
