package Assignment2sel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class UsingClassName {
	public static void main(String[] args) {
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("https://www.bigbasket.com/");
		String espected = "Online Grocery Shopping and Online Supermarket in India - bigbasket";
		String actual = driver.getTitle();
		if(espected.equals(actual))
		{
			System.out.println("Homepageis displayed");
		}else
		{
			System.err.println("Home page is not displayed");
		}
		//step 3:get the text
		WebElement titlee = driver.findElement(By.className("basket-content"));
		System.out.println(titlee.getText());
		System.out.println("Pass");
		driver.close();
	}

}
