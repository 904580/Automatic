package stepDefinition;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SignupPage;

public class SignupPageSteps extends Base  {
	public static WebDriver driver;
	
	SignupPage sign = new SignupPage();
	
	@Given("Launch the Browser")
	public void launch_the_Browser() {
	  
}

	@When("Click on the I am {int} or Above")
	public void click_on_the_i_am_or_above(Integer int1) {
		sign.click_on_the_i_am_or_above(18);
	}
	
	@When ("Click on the Accept all cookies")
	public void Click_on_the_Accept_all_cookies() {
		sign.Click_on_the_Accept_all_cookies();
	}
	

	@Then("Navigate to Home Page")
	public void navigate_to_home_page() {
	   
	}

	@When("user enter the first Name")
	public void user_enter_the_first_name() {
		sign.user_enter_the_first_name();
	}
	    

	@When("user enter the last Name")
	public void user_enter_the_last_name() {
	   sign.user_enter_the_last_name();
	}

	@When("user enter the email")
	public void user_enter_the_email() {
	  sign.user_enter_the_email();
	}

	@When("user enter the DateOfBirth")
	public void user_enter_the_date_of_birth() {
		sign.user_enter_the_date_of_birth();
	}
	
	@When("user click on the ENTER ADDRESS MANUALLY")
	public void user_click_on_the_ENTER_ADDRESS_MANUALLY() {
		sign.user_click_on_the_ENTER_ADDRESS_MANUALLY();
	}

	@When("user select the Country")
	public void user_select_the_country() {
		sign.user_select_the_country();
	}

	@When("user enter the Street Address name")
	public void user_enter_the_street_address_name() {
	   
	}

	@When("user enter the Street Address2 name")
	public void user_enter_the_street_address2_name() {
	   
	}

	@When("user enter the city name")
	public void user_enter_the_city_name() {
	   
	}

	@When("user enter the country")
	public void user_enter_the_country() {
	   
	}

	@When("user enter the postcode")
	public void user_enter_the_postcode() {
	   
	}

}
