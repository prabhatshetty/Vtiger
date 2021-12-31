package GroupExecution;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AmazonGroup {
	@Parameters("url2")
	@Test
	public void amazon(String amazon)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browserlaunched successfully",true);
		//step 2: Enter the Url 
		driver.get(amazon);
		Reporter.log("amazon");
	}
}
