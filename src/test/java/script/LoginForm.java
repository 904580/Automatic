package script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginForm {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		//options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.vuse.com/gb/en/customer/account/create/");
		driver.manage().window().maximize();
		
		
		WebElement Cookiesaccept=driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
		Cookiesaccept.click();
		
		WebElement button=driver.findElement(By.xpath("//button[@wz_dt_ref='true']"));
		button.click();
		
//		WebElement firstname = driver.findElement(By.xpath("(//input[@id='firstname'])[1]"));
//		firstname.sendKeys("Anoop");
//		
//		WebElement lastname = driver.findElement(By.xpath("(//input[@id='lastname'])[1]"));
//		lastname.sendKeys("kumar");
//		
//		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
//		email.sendKeys("today1@yopmail.com");
//		
//		WebElement dob = driver.findElement(By.xpath("//input[@id='dob']"));
//		dob.sendKeys("01071998");
//		
//		WebElement dropdown = driver.findElement(By.xpath("//select[@id='gender']"));
//		
//		Select se = new Select(dropdown);
//		se.selectByVisibleText("Male");
//		
//		WebElement manually=driver.findElement(By.xpath("//div[@class='address-manual-button']"));
//		manually.click();
//		
//		WebElement street = driver.findElement(By.xpath("(//input[@name='street[]'])[1]"));
//		street.sendKeys("Delhi India");
//		
//		WebElement area = driver.findElement(By.xpath("(//input[@name='street[]'])[2]"));
//		area.sendKeys("Mayur Vihar phase-3");
//		
//		WebElement near = driver.findElement(By.xpath("(//input[@name='street[]'])[3]"));
//		near.sendKeys("metro station-15");
//		
//		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
//		city.sendKeys("New Delhi");
//		
//		WebElement region = driver.findElement(By.xpath("//input[@id='region']"));
//		region.sendKeys("UP");
//		
//		WebElement zipcode = driver.findElement(By.xpath("//input[@id='zip']"));
//		zipcode.sendKeys("110096");
//		
//		WebElement lookupaddress = driver.findElement(By.xpath("//div[@class='address-search-button']"));
//		lookupaddress.click();
//		
//		WebElement addressfinder = driver.findElement(By.xpath("//input[@id='address-search']"));
//		addressfinder.sendKeys("India");
//		
//		WebElement phone = driver.findElement(By.xpath("(//input[@id='telephone'])[1]"));
//		phone.sendKeys("9878694481");
//		
//		WebElement tick = driver.findElement(By.xpath("//span[@class='small-checkbox-text']"));
//		tick.click();
//		
//		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
//		password.sendKeys("today@123");
//		
//		WebElement cnfrmpassword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
//		cnfrmpassword.sendKeys("today@123");
//		
//		WebElement condition = driver.findElement(By.xpath("//div[@class='field choice terms-and-conditions choice-box__container']"));
//		condition.click();
//		
		
	

	}

}
