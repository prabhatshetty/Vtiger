import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class TakeScreenShotJioMart {
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
		//step:Takescreenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File screenshot = new File("./screenshot/screenshot.png");
		tempScreenshot.renameTo(screenshot);
		System.out.println("Pass");
	}
}