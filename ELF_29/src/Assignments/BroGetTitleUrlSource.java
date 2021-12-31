package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroGetTitleUrlSource {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	//string a =driver.getCurrentUrl();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	System.out.println(driver.getPageSource());
	}
}
