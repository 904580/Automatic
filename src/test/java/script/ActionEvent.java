package script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvent {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://www.browserstack.com/");

		driver.manage().window().maximize();

//		WebElement link = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//	wait.until(ExpectedConditions.visibilityOf(link));
//
//		Actions a = new Actions(driver);
//		a.moveToElement(link);
//		a.click();
//		a.contextClick(link);
//		a.doubleClick(link).build().perform();
//		a.sendKeys("Manish");
	
		
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
	j.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@class='btn col-center btn-primary btn-xl open-csf-form-v2 btn-lg custom-btn-amp-events ']")));
		
		
	
	}

}
