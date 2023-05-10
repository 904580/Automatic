package script;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webelementscreenshot {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
	

	WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));

	
	File scrfile = login.getScreenshotAs(OutputType.FILE);
	
	File Destfile = new File("C:\\Users\\Anoop saini\\eclipse-workspace\\com.Bot\\ScreenShot\\"+System.currentTimeMillis()+".png");
	
	try {
		FileUtils.copyFile(scrfile, Destfile);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}


