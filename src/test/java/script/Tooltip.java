package script;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tooltip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		String Actualstring=driver.findElement(By.xpath("//a[@href='/reg/']")).getAttribute("title");
		
		String Expectedstring= "Sign up for Facebook";
		if(Actualstring.equals(Expectedstring)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}
	
	}

}
