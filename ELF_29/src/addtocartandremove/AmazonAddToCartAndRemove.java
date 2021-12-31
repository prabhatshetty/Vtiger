package addtocartandremove;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCartAndRemove {public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(2000);
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//span[text()='Hello, Sign in']/..")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9482928782",Keys.ENTER);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Prabhatshetty@",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi note 10 pro",Keys.ENTER);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Redmi Note 10 Lite Aurora Blue 6GB RAM 128GB ROM | Alexa Built-in']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Redmi Note 10 Lite Glacier White 6GB RAM 128GB ROM | Alexa Built-in']")).click();
	driver.findElement(By.xpath("//span[text()='Redmi Note 10 Lite Champagne Gold 6GB RAM 128GB ROM | Alexa Built-in']")).click();
	Set<String> allwindow = driver.getWindowHandles();
	allwindow.remove(parent);
	for(String windowId:allwindow)
	{
		driver.switchTo().window(windowId);
		driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	}
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//img[@alt='Redmi Note 10 Lite Aurora Blue 6GB RAM 128GB ROM | Alexa Built-in, Opens in a new tab']/../../..//input[@value='Delete']")).click();
	System.out.println("Remove1");
	driver.findElement(By.xpath("//img[@alt='Redmi Note 10 Lite Glacier White 6GB RAM 128GB ROM | Alexa Built-in, Opens in a new tab']/../../..//input[@value='Delete']")).click();
	//img[@alt='Redmi Note 10 Lite Glacier White 6GB RAM 128GB ROM | Alexa Built-in, Opens in a new tab']/../../..//input[@value='Delete']
	System.out.println("Remove2");
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();

}

}
