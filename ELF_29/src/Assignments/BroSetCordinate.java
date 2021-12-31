package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroSetCordinate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zomato.com/");
		Thread.sleep(2000);
		Dimension dimen=new Dimension(100,50);
		driver.manage().window().setSize(dimen);
}
}
