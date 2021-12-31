package SeleniumAssignment2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdWindow {
	public static void main(String[] args) {

		//step1:Open the Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("window is mazimized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step2:Enter the Url
		driver.get("https://www.jiomart.com/");
		String parent = driver.getWindowHandle();
		WebElement textboxx = driver.findElement(By.xpath("//input[@id='search']"));
		textboxx.sendKeys("fruits",Keys.ENTER);
		
		WebElement banana = driver.findElement(By.xpath("//img[@src=\'https://www.jiomart.com/images/product/150x150/590001285/banana-robusta-6-pcs-box-0-20201126.jpg\']"));
		banana.click();
		driver.switchTo().window(parent);
		
		WebElement applee = driver.findElement(By.xpath("src=\'https://www.jiomart.com/images/product/150x150/590034369/orange-6-pcs-pack-0-20200917.jpg\']"));
		applee.click();
		System.out.println(driver.getWindowHandles());
	System.out.println(driver.getWindowHandle()); 
		
	
	}

}
