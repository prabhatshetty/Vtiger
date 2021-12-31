package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class TweTitle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.com/");
		System.out.println(driver.getTitle());
	}

}
