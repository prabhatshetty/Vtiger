package WebElements;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartDependentIndipendentPath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/50/50/image/7e6171c69f3c3c2d.jpg?q=50']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'OPPO A53s 5G (Ink Black, 128 GB)')]")).click();
		driver.findElement(By.xpath("//div[text()='OPPO A53s 5G (Crystal Blue, 128 GB)']")).click();
		driver.findElement(By.xpath("//div[text()='OPPO A53s 5G (Crystal Blue, 128 GB)']")).click();
		Set<String> allwindow = driver.getWindowHandles();
	//	driver.findElement(By.xpath("//div[text()='Infinix Smart 5 (Morandi Green, 32 GB)']")).click();
		allwindow.remove(parent);
		for(String windowId:allwindow)
		{
			driver.switchTo().window(windowId);
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		}
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//a[text()='OPPO A53s 5G (Crystal Blue, 128 GB)']/../../../..//div[text()='Remove']")).click();
		System.err.println("pass");
		driver.findElement(By.xpath("//div[text()='Remove Item']/../..//div[text()='Remove']")).click();
		System.err.println("pass");
		
		
			}
}
