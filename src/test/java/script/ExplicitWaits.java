package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitWaits {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			options.addArguments("--incognito");
			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
			
			
			WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
			
			
			WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
			
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(50));
		
			 wait.until(ExpectedConditions.visibilityOf(username));
			 username.sendKeys("problem_user");
			 
				WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(15));
				
				 wait2.until(ExpectedConditions.visibilityOf(password));
				 password.sendKeys("secret_sauce");
				 
					WebDriverWait wait3 = new WebDriverWait(driver,Duration.ofSeconds(15));
					
					 wait3.until(ExpectedConditions.visibilityOf(login));
					 login.click();
					 
				 		

	}

}
