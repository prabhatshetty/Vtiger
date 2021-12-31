import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotOfWebelement {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.findElement(By.xpath("//span[text()='YouTube']")).click();
		
		//span[text()="YouTube"]
		
		//driver.get("https://www.google.com/");
//driver.findElements(By.CssSelector)
		
		//a[@aria-label="Google apps"]
}
}