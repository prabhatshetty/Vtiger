package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroSwitchDriverControlToPerWin {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		Set<String> allwindow = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		String expected= "https://company.naukri.com/popups/cognizant/22112021/index.html";
		for(String windowId:allwindow)
		{
			driver.switchTo().window(windowId);
			if(expected.equals(driver.getCurrentUrl()))
			{
		
				driver.close();
			}
		driver.switchTo().window(parent);
		}
		}
}
