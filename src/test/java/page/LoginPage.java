package page;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.Base;

public class LoginPage extends Base {

		public void user_enter_the_valid_username_and_password() {
		WebElement username1 = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(username1));
		username1.sendKeys("standard_user");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		 
	}
	
	public void click_on_the_login_button() {
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}

}
