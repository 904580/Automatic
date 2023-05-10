package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



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
		 
		 
		 public void getScreenshot() {
			 
			 TakesScreenshot ts =  (TakesScreenshot)driver;						
			 File srcFile= ts.getScreenshotAs(OutputType.FILE);
			 
			 File destFile= new File("C:\\Users\\Anoop saini\\eclipse-workspace\\com.Bot\\ScreenShot\\"+System.currentTimeMillis()+".png");
			 try {
				FileUtils.copyFile(srcFile, destFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
}
		 
			
		 
	 
			 
	 







