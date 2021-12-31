package ConfigurationAnnotation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementationClass.class)
public class Tcc_000111 extends Configuration {
	
	public static WebDriver driver;

	@Test
	public void homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browserlaunched successfully",true);
		Reporter.log("Home Page is Displayed",true);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();//aria-label="Tue Dec 28 2021"
		int i=1/0;

	}

}
