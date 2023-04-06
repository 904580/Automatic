package script;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Boot {

	public static void main(String[] args) throws Exception {
	
WebDriverManager.chromedriver().setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");

		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html");
		
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		
	WebElement DropdownBtn=	driver.findElement(By.xpath("//button[@id='menu1']"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	 WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
	 wait.until(ExpectedConditions.visibilityOf(DropdownBtn));
	 
	 DropdownBtn.click();
	 
	   List<WebElement>dropdownList =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
	   
	   
	   for(WebElement ele :dropdownList) {
		   
		   wait.until(ExpectedConditions.visibilityOf(ele));
		   
		  System.out.println(ele.getAttribute("innerHTML"));
		  
		  if(ele.getAttribute("innerHTML").contains("About Us")) {
			 
			  ele.click();
			    
			  
		  }else if( ele.getAttribute("innerHTML").contains("CSS")) {
			  ele.click();
			 
	    
		  }else {
			  System.out.println("Fields ");
		  }
		 
		 FluentWait<WebDriver> wait1= new FluentWait<WebDriver>(driver);
		 wait1.withTimeout(Duration.ofSeconds(20));
		 wait1.pollingEvery(Duration.ofSeconds(5));
		 wait1.until(ExpectedConditions.visibilityOf(DropdownBtn));
		 
		 
		 Actions a1= new Actions(driver);
		 a1.moveToElement(DropdownBtn).build().perform();
		 
		 a1.click();
		 a1.contextClick();
		 
		 a1.doubleClick();
		 
		 a1.dragAndDrop(DropdownBtn, ele);
	   }
	}
}
		 
		 
		 
		 
		 
		 
		  