package webdrivermethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class BroSetPosition {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.zomato.com/");
	Point pointooo=new Point(4,8);
	driver.manage().window().setPosition(pointooo);
}
}
