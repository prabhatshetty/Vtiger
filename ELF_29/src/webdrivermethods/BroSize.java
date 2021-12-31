package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroSize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.zomato.com/");
		Thread.sleep(2000);
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getSize().height);
		System.out.println(driver.manage().window().getSize().width);
		
		
	}

}
