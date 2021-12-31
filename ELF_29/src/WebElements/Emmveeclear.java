package WebElements;

import org.openqa.selenium.chrome.ChromeDriver;

public class Emmveeclear {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emmvee.com/.com/");
		Thread.sleep(2000);

}
}