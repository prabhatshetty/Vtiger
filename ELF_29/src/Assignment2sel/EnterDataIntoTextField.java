package Assignment2sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class EnterDataIntoTextField {
	public static void main(String[] args){
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("https://www.amazon.in/");
		String espected = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String aspected = driver.getTitle();
		if(espected.equals(aspected))
		{
			System.out.println("Home pageis displayed");
		}else
			System.err.println("Home page is not displayed");
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']/..")).click();
		//step 3:Enter valid credientials
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9482928782",Keys.ENTER);
		
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Prabhatshetty@",Keys.ENTER);
}
}