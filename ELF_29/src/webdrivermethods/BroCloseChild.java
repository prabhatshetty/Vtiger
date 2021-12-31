package webdrivermethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroCloseChild {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		String parent = driver.getWindowHandle();
		Set<String> allids = driver.getWindowHandles();
		allids.remove(parent);
for(String windowId:allids)
{
	driver.switchTo().window(windowId);
	driver.close();
}
}

}