package stepDefinition;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginPageSteps extends Base {
	public static WebDriver driver;
	
	LoginPage login = new LoginPage();
	
	@Given("we have a URL and launch the browser")
	public void we_have_a_url_and_launch_the_browser() {
		mysetup();
		
	}

	@When("user enter the valid username and password")
	public void user_enter_the_valid_username_and_password() {
		login.user_enter_the_valid_username_and_password();
		
	}

	@When("click on the login button")
	public void click_on_the_login_button() {
		login.click_on_the_login_button();
	
	}

	@Then("validate the user to navigate to the home page")
	public void validate_the_user_to_navigate_to_the_home_page() {
	   
	}

}
