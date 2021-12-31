package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickAlibaba {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.alibaba.com/");
		Actions actions=new Actions(driver);
		WebElement tradeshows = driver.findElement(By.xpath("//a[text()='Buyer Central']"));
		actions.contextClick(tradeshows).perform();//used to perform the right click action on the element

	}
}
