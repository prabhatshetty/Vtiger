package newtestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenWithMulVal {

	@DataProvider(name="sendData",parallel=true)
	public String[][] sendData()
	{
		String[][] a= {{"9482928782","Prabhatshetty@"},{"14215425w6","dgdgdgdgd"}};
		return a;
	}
	@Test(dataProvider="sendData")
	public void create_loan(String[] value)
	{
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']/..")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys(value[0],Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys(value[1],Keys.ENTER);
	}

}
