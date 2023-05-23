package script;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsMethods {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.browserstack.com/");
		driver.manage().window().maximize();
		
		WebElement al =driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
		WebElement al2 =driver.findElement(By.xpath("//a[@class='menu-item-live']"));
		WebElement searchIcon =driver.findElement(By.xpath("//button[@class='doc-search-menu dropdown-toggle doc-search-cta doc-search-menu-icon doc-menu-toggle']"));
		searchIcon.click();
		WebElement searchInput =driver.findElement(By.xpath("//input[@id='doc-search-box-input']"));
		searchInput.sendKeys("test");
		
			Actions a = new Actions(driver);
		a.sendKeys(Keys.ENTER).build().perform();
		//a.moveToElement(al);//mouse hover
//		a.contextClick(al2);// right click
//		a.doubleClick();// double click
//		a.click();//for clicking
//		a.dragAndDrop(al, al2);//drag and drop
		
	//	a.click(al2).build().perform();
		

	}

}
