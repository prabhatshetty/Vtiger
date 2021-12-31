package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroGetPosition {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.zomato.com/");
		Thread.sleep(2000);
		
		System.out.println(driver.manage().window().getPosition());
		System.out.println(driver.manage().window().getPosition().getX()+" its x ");
		System.out.println(driver.manage().window().getPosition().getY()+"   its y");
	}

}
