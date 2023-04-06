package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='menu1']"));
		ele.click();

		
		List<WebElement> dropdownlist=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		for(WebElement ele2 :dropdownlist) {
			String value =ele2.getText();
			if(value.equals("JavaScript")) {
				Thread.sleep(9000);
				ele2.click();
				break;
				
			}
			
			
		}
		
		
	}

}
