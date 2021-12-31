package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroPrintCurrentWinId {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com/");
		System.out.println(	driver.getWindowHandle());
	}

}
