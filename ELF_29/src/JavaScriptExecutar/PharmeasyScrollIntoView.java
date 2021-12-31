package JavaScriptExecutar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PharmeasyScrollIntoView {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.pharmeasy.in/");
		WebElement element = driver.findElement(By.xpath("//h2[text()='Download the App for free']"));
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("arguments[0].scrollIntoView(true);",element);//top to bottom
	
	}
}