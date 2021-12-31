package addtocartandremove;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakeMyTripFour {

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
		int date=18;
		String mn="Apr";
		int year=2022;
		pass(driver,mn,date,year);
	}
		private static void pass(WebDriver driver, String mn, int date, int year)
		{
		for(;;)
		{
			try {driver.findElement(By.xpath("//div[contains(@aria-label,'"+mn+" "+date+" "+year+"')]")).click();
			break;	
			}
			catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}		
}

