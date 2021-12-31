package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementalibaba {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.alibaba.com/");

		Actions actions=new Actions(driver);
		WebElement apperal = driver.findElement(By.xpath("//span[text()='Apparel']"));
		actions.moveToElement(apperal).perform();
		WebElement europecloth = driver.findElement(By.xpath("//a[text()='European Clothing']"));
		actions.click(europecloth).perform();


	}
}
