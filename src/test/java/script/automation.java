package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("problem_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
//		  username.clear();			
//		  password.clear();
				
		
		WebElement error = driver.findElement(By.xpath("//button[@class='error-button']"));
		error.getText();
	
	}

}
