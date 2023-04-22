package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	static {
	
	try {
		FileInputStream file= new FileInputStream("TestData/TestData.properties");
		 prop =new Properties();
		prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	}
	
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

	
	 
	 public void mouseHover(WebElement ele) {//GENERIC METHOD 
		 Actions a = new Actions(driver);
		 a.moveToElement(ele).build().perform();
		 
	 }
		 public void selectByVisibleText(WebElement ele, String value) { //generic method
			 Select s = new Select(ele);
			 s.selectByVisibleText(value);
			 
		 }
		 
		 public void selectByIndex(WebElement ele,  int value) { //generic method
			 
			 Select s = new Select(ele);
			 s.selectByIndex(value);
		
		}
		 
		 public void javaExecutor(WebElement element) {
		 JavascriptExecutor jse = (JavascriptExecutor) driver;
		 jse.executeScript("arguments[0].click();",element);
		 }
		 
		 public void explicitWait(WebElement element, int timeouts) {
			 
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			 wait.until(ExpectedConditions.visibilityOf(element));	 
		 }
		 
		 public void JavaPopUpAlert( int timeouts) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			 wait.until(ExpectedConditions.alertIsPresent());	
			Alert a= driver.switchTo().alert();
			a.accept();
		 }
		 
		 public void waitForElementClickable(WebElement ele, int timeouts) {
			 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeouts));
			 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 }
		 
	 }






