package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroQuit {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		Thread.sleep(4000);
		driver.quit();
	}

}
