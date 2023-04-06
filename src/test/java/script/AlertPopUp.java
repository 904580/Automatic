package script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		   driver.get("https://testuserautomation.github.io/Alerts/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[3]")).click();
		Alert alert= driver.switchTo().alert();
		String alertMessage=alert.getText();

        //For OK button in alert, accept the PopUp
		alert.sendKeys("Test Automation");
	     Thread.sleep(3000);
	        
	        alert.accept();
	        
	        Thread.sleep(3000);
	    
	        driver.close();

	    }
		

}


