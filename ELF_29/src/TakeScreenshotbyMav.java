import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotbyMav {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		driver.findElement(By.xpath("//span[text()='Kolkata']")).click();
		//span[text()='Kolkata']
		TakesScreenshot ts = (TakesScreenshot)driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File screenshot = new File("./screenshot/screenshot.png");
		//tempScreenshot.renameTo(screenshot);
		FileUtils.copyFile(tempScreenshot,screenshot);
		
	}

}
