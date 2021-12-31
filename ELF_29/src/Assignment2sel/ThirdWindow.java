package Assignment2sel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdWindow {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://www.naukri.com/");
		Set<String> allids = driver.getWindowHandles();
		String espected="Sopra";
		for(String windowId:allids) {
			driver.switchTo().window(windowId);
			String actual = driver.getTitle();
			if(espected.equals(actual))
			{
				driver.manage().window().maximize();

			}
		}

	}
}

