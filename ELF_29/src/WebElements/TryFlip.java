package WebElements;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryFlip {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/50/50/image/7e6171c69f3c3c2d.jpg?q=50']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'OPPO A53s 5G (Ink Black, 128 GB)')]")).click();
		Thread.sleep(2000);
		 //driver.getWindowHandle();
		driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/50/50/image/114626aeb0252883.jpg?q=50']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Infinix Smart 5 (Morandi Green, 32 GB)']")).click();
		Thread.sleep(2000);
		Set<String> allWindows = driver.getWindowHandles();
		
		allWindows.remove(parent);
		for(String windowId:allWindows) {
			driver.switchTo().window(windowId);
	
		
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(2000);
		}
		}
		
		
		/*driver.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/flap/50/50/image/114626aeb0252883.jpg?q=50']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Infinix Smart 5 (Morandi Green, 32 GB)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();*/
		driver.close();

}
