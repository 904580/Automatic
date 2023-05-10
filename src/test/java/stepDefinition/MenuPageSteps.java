package stepDefinition;

import org.openqa.selenium.WebDriver;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MenuPage;

public class MenuPageSteps extends Base {
	public static WebDriver driver;
	
	MenuPage page= new MenuPage();
	
	@Given("user click on the Three line")
	public void user_click_on_the_three_line() {
		page.user_click_on_the_three_line();
	   
	}

	@When("user click on the about")
	public void user_click_on_the_about() {
	  page.user_click_on_the_about();
	}

	@Then("navigate to about page")
	public void navigate_to_about_page() {
	   
	}

	/*@Given("user click on the product")
	public void user_click_on_the_product() {
		page.user_click_on_the_product();
	}*/
	
	@Given ("user click on the request on a demo")
		public void user_click_on_the_request_on_a_demo() {
			page.user_click_on_the_request_on_a_demo();
		}
	}


