package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroSetSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(2000);
		Dimension dimen=new Dimension(500,500);
		driver.manage().window().setSize(dimen);
	}

}
