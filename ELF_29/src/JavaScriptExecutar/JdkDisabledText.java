package JavaScriptExecutar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JdkDisabledText {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8u211-later-archive-downloads.html");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.findElement(By.xpath("//a[text()='jdk-8u291-linux-aarch64.rpm']")).click();
		WebElement disabledbutton = driver.findElement(By.xpath("//a[text()='Download jdk-8u291-linux-aarch64.rpm']"));
	js.executeScript("arguments[0].click();",disabledbutton);
	System.out.println("Pass");
	}

}
