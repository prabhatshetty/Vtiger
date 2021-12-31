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
public class ByPartialLinkText {
	public static void main(String[] args) {
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("https://kite.zerodha.com/");
		String espested="Kite - Zerodha's fast and elegant flagship trading platform";
		String actual = driver.getTitle();
		if(espested.equals(actual))
		{
			System.out.println("Login page isdisplayed successfully");
		}else
		{
			System.err.println("login page isnot displayed");
		}
		//step 3:click on forgot passwordlink
		WebElement username = driver.findElement(By.partialLinkText("Forgot "));
		username.click();
	System.out.println("clicked on forgot password link");
	
	}
}