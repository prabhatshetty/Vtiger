package Assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroRemoveAllChild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> all = driver.getWindowHandles();	
		String parentidisthere = driver.getWindowHandle();
		all.remove(parentidisthere);
		for(String windowId:all)
		{
		driver.switchTo().window(windowId);
		driver.close();
		}
		
		
	}

}
