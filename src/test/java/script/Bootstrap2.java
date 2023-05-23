package script;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		driver.manage().window().maximize();
		
		WebElement el=driver.findElement(By.xpath("//button[@id='menu1']"));
		el.click();
		
		List<WebElement> list1=driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
		
		for(WebElement t:list1){
			String txt=t.getText();
			if(txt.contains("JavaScript")) {
				Thread.sleep(300);
				t.click();
				
				break;
				
			}
			
			 
				
			}
			
		}
}
		
		
		
		
		
		
	
