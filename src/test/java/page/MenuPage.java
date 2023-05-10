package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;

public class MenuPage extends Base {
	
	public void user_click_on_the_three_line() {
		
		WebElement clickable=driver.findElement(By.xpath("//div[@class='bm-burger-button']"));
		try {
		clickable.click();
		}catch(Exception e) {
			javaExecutor(clickable);
		}
		   
	}
	
public void user_click_on_the_about() {
	
	WebElement about=driver.findElement(By.xpath("(//a[@class='bm-item menu-item'])[2]"));
	try {
	about.click();
	}catch(Exception e) {
		javaExecutor(about);
	}
		
}
	

/*public void user_click_on_the_product() {
	
	WebElement mouse=driver.findElement(By.xpath("(//span[@class='MuiTypography-root MuiTypography-buttonLabelNav css-1pj3is7'])[2]"));
	Actions a = new Actions(driver);
	a.moveToElement(mouse).build().perform();
}*/

public void user_click_on_the_request_on_a_demo() {
	
//	 driver.findElement(By.linkText("/request-demo")).click();
	
	driver.navigate().refresh();
	WebElement Demo=driver.findElement(By.xpath("//button[@class='MuiButtonBase-root MuiButton-root MuiButton-outlined MuiButton-outlinedDark MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation MuiButton-fullWidth MuiButton-root MuiButton-outlined MuiButton-outlinedDark MuiButton-sizeMedium MuiButton-outlinedSizeMedium MuiButton-disableElevation MuiButton-fullWidth css-grxcpp']"));
	Demo.click();
}

}
