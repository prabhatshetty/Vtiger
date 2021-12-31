import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class ZerodhaFormat {
	public static void main(String[] args) throws InterruptedException {

		//step1:Open the Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser is launched");
		driver.manage().window().maximize();
		System.out.println("window is mazimized successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//step2:Enter the Url
		driver.get("https://kite.zerodha.com/");
		String actualTitle = driver.getTitle();
		String espectedTitle = "Login to Kite";
		if(espectedTitle.equals(actualTitle))
		{
			System.out.println("login page is displayed");
		}else{
			System.err.println("Login page is not displayed");
		}
		//step3:Entervalid credientials
		//System.out.println(driver.findElement(By.xpath("//button[text()='Login ']")).isEnabled());
		String expectedSendkey = "QF8271";
		WebElement Useriid = driver.findElement(By.xpath("//input[@label='User ID']"));
		Useriid.clear();
		Useriid.sendKeys("QF8271");
		String ActualId = Useriid.getAttribute("value");
		if(expectedSendkey.equals(ActualId))
		{
			System.out.println("user id enterd correctly");
		}else {
			System.err.println("User id is wrong");
		}
		String expectedPassword ="Prabhatshetty@";
		WebElement Password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		Password.sendKeys(expectedPassword);
		String actualpassword = Password.getAttribute("value");
		if(expectedPassword.equals(actualpassword))
		{
			System.out.println("Password entered correctly");
		}else
		{
			System.err.println("Password enterd wrong");
		}

		driver.findElement(By.xpath("//button[text()='Login ']")).click();
		String expeclogintittle = driver.getTitle();
		String actuallogintittle = "QF8271";
		if(actuallogintittle.equals(expeclogintittle))
		{
			System.out.println("enter Pin page isdisplayed");
		}else
		{
			System.err.println("enter pin pageisnot displayed");
		}
	}

}
//label[text()='Password']

//input[@placeholder='User ID (eg: AB0001)']