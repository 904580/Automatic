package script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaits {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://vuse.com/gb/en");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		WebElement searchField=driver.findElement(By.xpath("//input[@id='search']"));
		searchField.sendKeys("test@gmail.com");
		
		WebElement cartIcon=driver.findElement(By.xpath("//a[@class='action showcart']"));
		cartIcon.click();
			
		
	}
}