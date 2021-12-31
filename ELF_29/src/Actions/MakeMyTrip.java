package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTrip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		Actions actions=new Actions(driver);
		actions.click().perform();
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
		for(;;)
		{
			try {driver.findElement(By.xpath("//div[@aria-label='Sat Mar 12 2022']")).click();
			break;	
			}
			catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
		
		
		//driver.findElement(By.xpath("//p[text()='Login or Create Account']")).click();
		//driver.navigate().refresh();
	//	driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		//driver.findElement(By.xpath("//span[text()='Flights']")).click();
		//WebElement flights = driver.findElement(By.xpath("//span[text()='From']"));//.click();
		
		//actions.doubleClick(flights).perform();
		//driver.findElement(By.xpath("//a[text()='Search']")).click();
	
	
	}

}
