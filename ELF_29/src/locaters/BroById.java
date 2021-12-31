package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroById {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.actitime.com/login.do");
		Thread.sleep(2000);
WebElement eusername = driver.findElement(By.name("username"));
eusername.sendKeys("username");
WebElement password = driver.findElement(By.name("pwd"));
password.sendKeys("passwors");


}
}
//username
//pwd
//./softwares/chromedriver.exe"