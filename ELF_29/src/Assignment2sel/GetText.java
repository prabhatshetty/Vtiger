package Assignment2sel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
/***
 * 
 * @author Prabhat
 *
 */
public class GetText {
	public static void main(String[] args) {
		//step 1:Open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println("Browser launched successfully");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//step 2:enter the url
		driver.get("http://www.bigbasket.com/");
		WebElement Textfield = driver.findElement(By.xpath("//input[@id='input']"));
		Textfield.sendKeys("Apple");
		System.out.println(Textfield.getAttribute("value"));
		WebElement eusername = driver.findElement(By.linkText("bb Daily"));
		System.out.println(eusername.getText());
		eusername.click();

	}
}
