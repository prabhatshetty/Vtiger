package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Trello {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.trello.com/login/");
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("prabhat515shetty@gmail.com");
		//	WebDriverWait wait = new WebDriverWait(driver,10);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login']")).click();

		driver.findElement(By.id("password")).sendKeys("Prabhatshetty@");
		driver.findElement(By.id("login-submit")).click();
		driver.findElement(By.xpath("//h3[text()='YOUR WORKSPACES']/..//div[text()='ELF_29']/../..")).click();
		WebElement manual = driver.findElement(By.xpath("//h2[text()='To Do']/../..//span[@class='list-card-title js-card-name']"));
		//WebElement manual = driver.findElement(By.xpath("//h2[text()='To Do']/../..//span[text()='adhoc']"));
		WebElement notes = driver.findElement(By.xpath("//textarea[text()='java']"));
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
	actions.dragAndDrop(manual,notes).perform();
	
	
		//actions.clickAndHold(manual).perform();
	}
}
