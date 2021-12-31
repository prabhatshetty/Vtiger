package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(2000);
		WebElement from = driver.findElement(By.xpath("////label[text()='FROM']"));
		//from.clear();
		//from.sendKeys("bangluru");
		//(By.xpath("//input[@type='password']")); 
		System.out.println(from.getAttribute("style"));
	//System.out.println(driver.findElement(By.xpath("//input[@type='password']")).getText());
		
	}
	
	 
}
