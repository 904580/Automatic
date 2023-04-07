package script;

import java.io.File;
//import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Takescreen {
	WebDriver driver;
	
		@BeforeMethod
		//@Test(priority=0,description="browser launch")
		public void Takescreen() throws Exception {
		//public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		
		File scrfile = scrshot.getScreenshotAs(OutputType.FILE);
		
		File Destfile = new File("C:\\Users\\Anoop saini\\eclipse-workspace\\com.Bot\\ScreenShot\\"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(scrfile, Destfile);
		

	}
		@Test(priority=1,description="logout page")
		public void login() {
			System.out.println("Testing");
		}

		@Test(priority=2,description="login page")
		public void logout() {
			System.out.println("logout");
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
