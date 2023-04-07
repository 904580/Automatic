package script;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {
	Properties prop;

	@Test
	public void configReader() {
		prop=new Properties();
		
		File src = new File("C:\\Users\\Anoop saini\\eclipse-workspace\\com.Bot\\Doc\\employeeinfo.properties");
		
		try {
			FileInputStream file= new FileInputStream(src);
			try {
				prop.load(file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(prop.getProperty("usernmae"));
	}

}
