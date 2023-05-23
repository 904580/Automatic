package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class automation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("problem_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
		
		String currentWindow=driver.getWindowHandle();
		driver.switchTo().window(currentWindow);
		WebElement AddtoCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		AddtoCart.click();
		WebElement AddtoCart2 = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
		AddtoCart2.click();
		
//		WebElement CartIcon = driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
//		CartIcon.click();
//		
//		WebElement Checkout=driver.findElement(By.xpath("//button[@id='checkout']"));
//		Checkout.click();
//		
//		WebElement Fn=driver.findElement(By.xpath("//input[@id='first-name']"));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
//		
//		 wait.until(ExpectedConditions.visibilityOf(Fn));
//		 Fn.sendKeys("anoop");
//		
//		WebElement Lastname=driver.findElement(By.xpath("//input[@id='last-name']"));
//		WebDriverWait wait2 = new WebDriverWait(driver,Duration.ofSeconds(40));
//		
//		 wait2.until(ExpectedConditions.visibilityOf(Lastname));
//		 Lastname.sendKeys("saini");
//		
//		WebElement PostalCode=driver.findElement(By.xpath("//input[@id='postal-code']"));
//		PostalCode.sendKeys("110096");
//		
//		WebElement Continue=driver.findElement(By.xpath("//input[@id='continue']"));
//		Continue.click();*/
//		
//		
		WebElement dropdownclk = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select se= new Select(dropdownclk);
		se.selectByVisibleText("Price (low to high)");
		dropdownclk.click();
		
		
		
		
		
		
		
		
		
		
		
	 
	
	}

}
