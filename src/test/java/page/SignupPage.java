package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class SignupPage  extends Base {
	
	public void click_on_the_i_am_or_above(Integer int1) {
	WebElement button=driver.findElement(By.xpath("//button[@wz_dt_ref='true']"));
	button.click();
		
}
	
	public void Click_on_the_Accept_all_cookies() {
		
		WebElement Cookiesaccept=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click",Cookiesaccept);
		
		
	}
	
	public void user_enter_the_first_name() {
		WebElement FirstName=driver.findElement(By.xpath("//input[@id='ec0c4708-2292-476e-a9fe-b5b18b232dcf']"));
		FirstName.sendKeys("Anoop");
		
		
	}
	
	public void user_enter_the_last_name() {
		WebElement lastName=driver.findElement(By.xpath("//input[@id='b34fa46b-15d0-4241-acdf-e8176da2246b']"));
		lastName.sendKeys("Saini");
		
	}
	
	public void user_enter_the_email() {
		WebElement Email=driver.findElement(By.xpath("//input[@id='735812d6-0333-48f1-b6e1-3fda7098eaf4']"));
		Email.sendKeys("Anoopkumar8171@gmail.com");
	}
	
	public void user_enter_the_date_of_birth() {
		WebElement dob=driver.findElement(By.xpath("//input[@id='c436d062-5ff4-4e8d-b28e-be6aabe07ca5']"));
		dob.sendKeys("01071998");
	}
	
	
	public void user_click_on_the_ENTER_ADDRESS_MANUALLY() {
		WebElement manullyclick=driver.findElement(By.xpath("//span[@wz_dt_ref='true']"));
		manullyclick.click();
	}
	
	public void user_select_the_country() {
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='country-root-kCo']"));
		
		Select se = new Select(dropdown);
		se.selectByVisibleText("United Kingdom");
	}
}
