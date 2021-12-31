package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin",Keys.CONTROL+"a"+"c");
		//username.sendKeys(Keys.CONTROL+"c");
	 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));//.getText(); 
	 password.sendKeys(Keys.CONTROL+"v");
	// String print="";
	String print = driver.findElement(By.xpath("//input[@type='password']")).getText();
	 	
System.out.println(print);
}
}
