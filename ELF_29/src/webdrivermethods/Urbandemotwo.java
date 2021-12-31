package webdrivermethods;

import java.security.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Urbandemotwo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.urbanladder.com/");
		String parent = driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("study table",Keys.ENTER);
		driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
		Actions action = new Actions(driver);
		WebElement pricemover = driver.findElement(By.xpath("//li[@data-group='price']"));
		action.moveToElement(pricemover).perform();
		WebElement start = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']"));
		
		 action.dragAndDropBy(start,48,0).perform();
		 action.moveToElement(pricemover).perform();
		 //Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[@class='noUi-handle noUi-handle-upper']")));
		WebElement stop = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']"));
		 action.dragAndDropBy(stop,-180,0).perform();
		 
		 
		 //action.contextClick().perform();
		//action.moveByOffset(44,112).perform();
		//action.click().perform();
	
	
	
		//div[@class='noUi-handle noUi-handle-lower']
		//div[@class='noUi-handle noUi-handle-upper']
	//higherside
	}

}
