package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchUrl {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
       ChromeDriver driver=new ChromeDriver();
       driver.get("https://www.amazon.com/");
       
	}

}
