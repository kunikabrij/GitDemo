package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WebTestStepdefination {
	
	@Given("Internet connection is there")
	public void internet_connection_is_there() {
		
		System.out.println("internet connection is checking");
	}
	@When("^UserName is (.+) and password is (.+)$")
	public void user_name_is_and_password_is(String userName, String password) {
	  System.out.println("UserName :" + userName + "," + "Password :" + password);
	}

	@Then("FaceBook Home page should be displayed")
	public void face_book_home_page_should_be_displayed() {
	    System.out.println("FaceBook Home page should be displayed");
	}

}
