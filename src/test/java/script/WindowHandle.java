package script;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		
		String ParentWindowID= driver.getWindowHandle();//getWindowHandle generate the UNIQUE window ID
		System.out.println(ParentWindowID);
		
		WebElement btnclick=driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		btnclick.click();
		
		Set<String> ChildWindow = driver.getWindowHandles();//its capture the all possible parent window id or child window id
		
		for(String window:ChildWindow) {
			if(!ParentWindowID.equals(window)) {
				driver.switchTo().window(window);
				break;
	}
				}
		
		WebElement firstname =driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Test");
		
		
	}

}
