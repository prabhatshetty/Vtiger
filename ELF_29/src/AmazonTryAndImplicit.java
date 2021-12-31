import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTryAndImplicit {
	public static void main(String[] args){
		
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	String parent = driver.getWindowHandle();
	driver.findElement(By.xpath("//span[text()='Hello, Sign in']/..")).click();
	driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9482928782",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Prabhatshetty@",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("redmi note 10 pro",Keys.ENTER);
	driver.findElement(By.xpath("//span[text()='Redmi Note 10 Lite Aurora Blue 6GB RAM 128GB ROM | Alexa Built-in']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("//span[text()='Redmi Note 10 Lite Glacier White 6GB RAM 128GB ROM | Alexa Built-in']")).click();
	driver.findElement(By.xpath("//span[text()='Redmi Note 10 Lite Champagne Gold 6GB RAM 128GB ROM | Alexa Built-in']")).click();
	
	//span[text()='Redmi Note 10 Lite Champagne Gold 6GB RAM 128GB ROM | Alexa Built-in']
	
	Set<String> allwindow = driver.getWindowHandles();
	allwindow.remove(parent);
	for(String windowId:allwindow)
	{
		driver.switchTo().window(windowId);
	driver.findElement(By.xpath("//input[@id='buy-now-button']")).click();
	}
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	driver.findElement(By.xpath("//img[@alt='Redmi Note 10 Lite Aurora Blue 6GB RAM 128GB ROM | Alexa Built-in, Opens in a new tab']/../../..//input[@value='Delete']")).click();
	System.out.println("Pass");
	
	}
}