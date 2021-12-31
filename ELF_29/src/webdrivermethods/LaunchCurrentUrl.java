package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCurrentUrl {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("//http:www.amazon.com/");
//string a =driver.getCurrentUrl();
System.out.println(driver.getCurrentUrl());
}
}
