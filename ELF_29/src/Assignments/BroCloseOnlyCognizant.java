package Assignments;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroCloseOnlyCognizant {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> all = driver.getWindowHandles();	
		String expectedis="https://company.naukri.com/popups/cognizant/22112021/index.html";
		for(String windowId:all)
		{
			driver.switchTo().window(windowId);
			if(expectedis.equals(driver.getCurrentUrl()))
			{
				driver.close();
			}
		}
	}
}

