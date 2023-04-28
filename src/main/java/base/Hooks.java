package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base {

	 
		@Before		
		 public static void mysetup() {
			 
				String browserName= prop.getProperty("browser");
				if(browserName.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options= new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--incognito");
				driver= new ChromeDriver(options);
				}else if(browserName.equals("firebox")) {
					WebDriverManager.firefoxdriver().setup();
					FirefoxOptions options= new FirefoxOptions();
					options.addArguments("--remote-allow-origins=*");
					options.addArguments("--incognito");
					driver = new FirefoxDriver(options);
				}else if (browserName.equals("edge")) {
					WebDriverManager.edgedriver().setup();
					EdgeOptions options = new EdgeOptions();
					options.addArguments("--remote-allow-origins=*");
					options.addArguments("--incognito");
					driver= new EdgeDriver(options);
				}
				driver.get(prop.getProperty("url"));
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
			}


		 @After
		 public void tearDown(Scenario s) {
			 if(s.isFailed());
			 {
				 getScreenshot();
			 }
			 driver.quit();
			 
		 }
	}


