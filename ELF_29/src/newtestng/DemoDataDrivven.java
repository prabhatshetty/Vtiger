package newtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDataDrivven {
	@DataProvider
	public String[] sendData()
	{
		String[]a= {"https://www.amazon.com/","https://www.flipkart.com/"};
		return a;
	}
	@Test(dataProvider="sendData")
	public void create_loan(String url)
	{
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
	}

}
