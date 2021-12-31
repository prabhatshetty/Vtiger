package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByLinkTexbira {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bira91.com/");
		Thread.sleep(2000);
WebElement username = driver.findElement(By.id("age_validation_input"));
username.sendKeys("1998");
WebElement enterbitton = driver.findElement(By.id("age_validation_btn"));
enterbitton.click();
WebElement boom = driver.findElement(By.partialLinkText("LIGHT"));
boom.click();


	}
}
//age_validation_btn
//Boom strong