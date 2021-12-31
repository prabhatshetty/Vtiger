package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class BroGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> allllwindow = driver.getWindowHandles();
		String expected= "https://company.naukri.com/popups/cognizant/22112021/index.html";
		for(String windowId: allllwindow)
		{
			driver.switchTo().window(windowId);
			if(expected.equals(driver.getCurrentUrl()))
				driver.manage().window().maximize();
				//driver.close();
			System.out.println(driver.getWindowHandle());
		}
	
	}
}
