package Assignment2sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */

public class LinkText {
	public static void main(String[] args) {
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("https://www.bira91.com/");
		
		WebElement username = driver.findElement(By.id("age_validation_input"));
		username.sendKeys("1998");
		WebElement enterbitton = driver.findElement(By.id("age_validation_btn"));
		enterbitton.click();
		WebElement boom = driver.findElement(By.partialLinkText("LIGHT"));
		boom.click();

	}
}