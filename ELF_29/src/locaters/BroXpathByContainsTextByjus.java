package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroXpathByContainsTextByjus {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.byjus.com/");
		Thread.sleep(2000);
WebElement eusername = driver.findElement(By.xpath("//span[contains(text(),'Name of your Child')]"));
eusername.sendKeys("1998");

}
}
////a[@data-toggle='collapse']