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
public class UsingName {
	public static void main(String[] args) throws InterruptedException {
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("http://demo.actitime.com/login.do");
		WebElement eusername = driver.findElement(By.name("username"));
		eusername.sendKeys("username");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("passwors");
	}
}