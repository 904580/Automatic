package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demoqa.com/upload-download");
		driver.manage().window().maximize();
		 
		WebElement fileupload=driver.findElement(By.xpath("//input[@id='uploadFile']"));
		fileupload.sendKeys("C:\\Users\\Anoop saini\\Desktop/33 Selenium Java Interview Questions.pdf");
	}

}
