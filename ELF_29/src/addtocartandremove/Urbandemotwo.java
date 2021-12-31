package addtocartandremove;

import java.security.Key;
import java.util.Set;
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
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement start = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-lower']"));
		action.dragAndDropBy(start,48,0).perform();
		// Thread.sleep(2000);
		action.moveToElement(pricemover).perform();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']"))));
		WebElement stop = driver.findElement(By.xpath("//div[@class='noUi-handle noUi-handle-upper']"));
		
		action.dragAndDropBy(stop,-180,0).perform();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.findElement(By.xpath("(//a[@class='product-img'])[4]")).click();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);
		for(String windowId:allwindow)
		{
			driver.switchTo().window(windowId);
		}
		String name = driver.findElement(By.xpath(" //h1[@itemprop='name']")).getText();
		System.out.println(name);
		String price = driver.findElement(By.xpath(" //div[@class='price discounted-price']")).getText();
		System.out.println("Product price:   "+price);
		 String warrenty = driver.findElement(By.xpath("//div[@class='warranty-module']")).getText();
		System.out.println(warrenty);
		String details = driver.findElement(By.xpath(" //span[@class=\"product-property-title with-stroke\"]/..")).getText();
		System.out.println(details);
		driver.findElement(By.xpath("//button[@data-event='add_to_cart']")).click();
		System.out.println("DONE");



	}

}
