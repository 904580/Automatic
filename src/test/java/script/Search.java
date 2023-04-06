package script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		WebElement box=driver.findElement(By.xpath("//*/form/div[1]/div[1]/div[1]/div/div[2]/input"));
		box.sendKeys("paython");
		box.sendKeys(Keys.RETURN);
		Thread.sleep(2000);
		driver.close();

	}

}
