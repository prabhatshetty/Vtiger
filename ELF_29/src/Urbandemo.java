import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Urbandemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.urbanladder.com/");
	String parent = driver.getWindowHandle();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Actions action = new Actions(driver);
	WebElement living = driver.findElement(By.xpath("//li[@class='topnav_item livingunit']"));
	action.moveToElement(living).perform();
	driver.findElement(By.xpath("//span[text()='Lounge Chairs']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	WebElement product = driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']/li[3]"));//.click();
	product.click();
	Thread.sleep(2000);
//WebElement productamount = driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']/li[3]//div[@class='price-number']/span"));
	System.out.println(product.getText());
	//product.click();
	Set<String> allwindow = driver.getWindowHandles();
	;
	allwindow.remove(parent);
	for(String windowId:allwindow)
	{
		driver.switchTo().window(windowId);
	}
	//driver.findElement(By.xpath("
	driver.findElement(By.xpath("//a[contains(text(),'Close')]")).click();
	}

}
