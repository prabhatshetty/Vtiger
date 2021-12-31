package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class Aaa {
	public static void main(String[] args) {
		//step 1: open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Browserlaunched successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//step 2: Enter the Url 
		driver.get("https://www.flipkart.com/");
		String parent = driver.getWindowHandle();
		String actual = driver.getTitle();
		String espectedtitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		if(espectedtitle.equals(actual))
		{
			System.out.println("Home page is displayed");
		}else 
			{
				System.err.println("Home page is not displayed");
			}
		
		//step 3: Manage the popup
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		System.out.println("Popup ManagedSuccessfully");
		//step 4: Entr the product name in the textfield
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));//.sendKeys("bottle",Keys.ENTER);
		search.sendKeys("realme 8i",Keys.ENTER);
		driver.navigate().refresh();
		System.out.println("pass");
		
		driver.findElement(By.xpath("//div[text()='realme 8i (Space Black, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='realme 8i (Space Purple, 64 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='realme Narzo 50i (Mint Green, 32 GB)']")).click();
		//driver.findElement(By.xpath("//div[text()='realme 8i (Space Purple, 64 GB)']")).click();
		//driver.findElement(By.xpath("//div[text()='REDMI 9i (Nature Green, 64 GB)']")).click();
		Set<String> allwindowids = driver.getWindowHandles();

		allwindowids.remove(parent);
		for(String windowId:allwindowids)
		{
			driver.switchTo().window(windowId);
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		
		driver.findElement(By.xpath("//a[text()='realme Narzo 50i (Mint Green, 32 GB)']/../../../..//div[text()='Remove']")).click();
		driver.findElement(By.xpath("//div[text()='Remove Item']/..//div[text()='Remove']")).click();	
		
}
}
