package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class BronavBack {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		driver.get("http://www.swiggy.com/");
		Thread.sleep(2000);
	driver.get("http://www.zomato.com/");	
	Thread.sleep(2000);
	driver.navigate().back();
	Thread.sleep(2000);
	driver.navigate().forward();
	driver.navigate().refresh();
	}
}
