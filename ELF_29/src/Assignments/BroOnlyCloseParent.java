package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;

public class BroOnlyCloseParent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.naukri.com/");
		Thread.sleep(2000);
		driver.close();
	}		
}
//C:\Users\Prabhat\Downloads