package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Com {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("admin",Keys.CONTROL+"a"+"c");
	 WebElement password = driver.findElement(By.xpath("//input[@type='password']"));//.getText(); 
	 password.sendKeys(Keys.CONTROL+"v");
	System.out.println(username.getLocation().getX());
	System.out.println(password.getLocation().getX());
	String zz = password.getText();
	System.out.println(zz);
	if(username.getLocation().getX()==password.getLocation().getX())
	{
	System.err.println("pass");
}
	//System.out.println((username.getLocation().getY())+password.getLocation().getY());
	Dimension usersize = username.getSize();
	System.out.println((username.getLocation().getY())+usersize.height+"total height till usertextfield");
	//System.err.println(usersize.height);
	System.err.println(password.getLocation().getY());
	driver.quit();	
	}
}

