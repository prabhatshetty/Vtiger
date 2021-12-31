package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroLinkText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
//WebElement username = driver.findElement(By.linkText("Forgot password?"));
//username.click();
WebElement usernamee = driver.findElement(By.cssSelector("button[class='button-orange wide']"));
usernamee.click();
	}	

}
//button-orange wide