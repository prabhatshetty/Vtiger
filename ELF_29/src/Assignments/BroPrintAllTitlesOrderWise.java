package Assignments;

import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroPrintAllTitlesOrderWise {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		 TreeSet l1=new TreeSet();
		Set<String> allwindow = driver.getWindowHandles();
		String parent = driver.getWindowHandle();
		String expected= "https://company.naukri.com/popups/cognizant/22112021/index.html";
		for(String windowId:allwindow)
		{
			driver.switchTo().window(windowId);
			//System.out.println(driver.getTitle());
			 String ouu = driver.getTitle();
			//PriorityQueue l1=new PriorityQueue();
			
			l1.add(ouu);
		}
		System.out.println(l1);
			//System.out.println(driver.getWindowHandles());
			//*if(expected.equals(driver.getCurrentUrl()
	}

}
