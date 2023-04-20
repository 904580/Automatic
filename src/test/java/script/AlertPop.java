package script;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		WebElement alert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		alert.click();
		
		Alert a =driver.switchTo().alert();
		
		String str =  a.getText();
		System.out.println(str);
		
		//Thread.sleep(900);
		a.accept();
		
		WebElement al =driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
		al.click();
		
		//Thread.sleep(900);'
		a.dismiss();
		
		WebElement a2 =driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));
		a2.click();
		
		a.sendKeys("TestAutomation");
		
		
	
	}

}
