package addtocartandremove;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrbanLadder {
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
		WebElement product = driver.findElement(By.xpath("//ul[@class='productlist withdivider clearfix lounge_chairs productgrid']/child::li[3]/descendant::span[2]"));//.click();

		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(product));
		System.out.println(product.getText());
		String rate = product.getText();
		char[] arrayrate=rate.toCharArray();
		String amount="";
		for(char a:arrayrate)
		{
			if(a>=48 && a<=57)
			{
				amount=amount+a;
			}
		}

		int itemcost = Integer.parseInt(amount);
		if(itemcost>=20000)
		{
			System.out.println("Product cost is more than 20000");
		}else {
			System.out.println("Product cost is less than 20000");
		}
		product.click();
		Set<String> allwindow = driver.getWindowHandles();
		allwindow.remove(parent);
		for(String windowId:allwindow)
		{
			driver.switchTo().window(windowId);
		}
		driver.findElement(By.xpath("//button[@data-event='add_to_cart' and @data-id='93407']")).click();
		System.out.println("DONE");
	}

}
