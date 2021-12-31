package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroNavUrL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		driver.get("http://www.swiggy.com/");
		Thread.sleep(2000);
	driver.get("http://www.zomato.com/");
	driver.navigate().to("http://www.flipkart.com/");
	}
}
