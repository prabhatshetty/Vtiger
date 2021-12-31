package Assignment2sel;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class GetLinkText {
	public static void main(String[] args) {
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		System.out.println("Window is maximized successfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("https://mvnrepository.com/");
		WebElement links = driver.findElement(By.xpath("//a[text()='net.brunomendola.querity']"));
		System.out.println(links.getText());
	}

}
