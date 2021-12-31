package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCompatibility {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		Rectangle output = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).getRect();
		Dimension sizee = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).getSize();
		Point loc = driver.findElement(By.xpath("//input[@aria-label='Email address or phone number']")).getLocation();

		WebElement abc = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Dimension passsize = driver.findElement(By.xpath("//input[@placeholder='Password']")).getSize();
		System.out.println(output);
		System.out.println(sizee);
		System.out.println(sizee.height);
		System.out.println(sizee.width);
		System.out.println(loc);
		System.out.println(passsize.height);
		System.out.println(passsize.width);


	}

}
