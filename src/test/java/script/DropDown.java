package script;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	Select dropdown = new Select( driver.findElement(By.name("country")));
	//dropdown.selectByVisibleText("INDIA");
	//dropdown.deselectByVisibleText("INDIA");
	//dropdown.selectByIndex(1);
	//dropdown.selectByValue("value");
	dropdown.isMultiple();
	}

}
