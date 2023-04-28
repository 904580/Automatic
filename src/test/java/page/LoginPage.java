package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import base.Base;

public class LoginPage extends Base {

		public void user_enter_the_valid_username_and_password(String uname , String pass) {
		WebElement username1 = driver.findElement(By.xpath("//input[@id='user-name']"));	
		explicitWait(username1, 15);
		
		username1.sendKeys(uname);
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys(pass);
		 
	}
	
	public void click_on_the_login_button() {
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		try {
			login.click();
		}catch (Exception e) {
			javaExecutor(login);
		}
	}

}
