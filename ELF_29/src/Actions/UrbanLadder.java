package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadder {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.get("https://www.urbanladder.com//");
		Actions actions=new Actions(driver);
		WebElement living = driver.findElement(By.xpath("//li[@class='topnav_item verymerrysaleunit']"));
		actions.moveToElement(living).perform();
	WebElement languechairs = driver.findElement(By.xpath("//span[text()='Lounge Chairs']"));//.click();
	actions.click(languechairs).perform();
				Thread.sleep(10000);
			//	driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
				driver.findElement(By.partialLinkText("Close")).click();	
				 WebElement emailid = driver.findElement(By.xpath("//input[@placeholder='Email Address*']"));//.sendKeys("prabhatshetty23@gmail.com");
				WebElement password = driver.findElement(By.xpath("//input[@class='textfield required input_authentication']"));//.sendKeys("Prabhatshetty@");
				driver.findElement(By.xpath("//input[@value='Sign Up']"));
				//input[@value='Sign Up']
				
				JavascriptExecutor js=(JavascriptExecutor) driver;
				js.executeScript("arguments[0].value='prabhatshetty23@gmail.com';",emailid);
				js.executeScript("arguments[0].value='Prabhatshetty@';",password);
	
	
	}
}