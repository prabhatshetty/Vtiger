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
public class UsingId {
	public static void main(String[] args){
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		//step 2:enter the url
		driver.get("https://kite.zerodha.com/");
		WebElement username = driver.findElement(By.id("userid"));
		username.sendKeys("Qa1234G");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Prabhatshetty");
	}
}