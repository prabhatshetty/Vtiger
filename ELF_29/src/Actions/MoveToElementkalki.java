package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementkalki {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.kalkifashion.com/");


		Actions actions=new Actions(driver);
		actions.moveToElement(driver.findElement(By.linkText("MEN"))).perform();


		WebElement kurtas = driver.findElement(By.linkText("Kurtas for Men"));

		actions.click(kurtas).perform();
		//WebElement element = driver.findElement(By.xpath("//h2[text()='Download the App for free']"));



	}
}