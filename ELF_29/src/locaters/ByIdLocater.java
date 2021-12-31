package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByIdLocater {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
WebElement username = driver.findElement(By.id("userid"));
username.sendKeys("Qa1234G");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("Prabhatshetty");
//WebElement button = driver.findElement(By.className("button-orange wide"));
//button.click();

}
}