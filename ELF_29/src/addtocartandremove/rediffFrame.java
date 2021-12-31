package addtocartandremove;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediffFrame {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Rediffmail']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("sumanthelfbatch@rediffmail.com");
		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		driver.findElement(By.xpath("//li[@title='Compose a new mail']")).click();
		
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='TO_IDcmp2']")).sendKeys("sumanthelfbatch@rediffmail.com");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@class='rd_inp_sub rd_subject_datacmp4']")).sendKeys("PRABHAT SHETTY");
		driver.findElement(By.xpath("//label[text()='Subject:']/..//input[@class='rd_inp_sub rd_subject_datacmp2']")).sendKeys("PRABHAT SHETTY");
		WebElement framee = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, rdMailEditorcmp2']"));
		driver.switchTo().frame(framee);
		driver.findElement(By.xpath("//body[@contenteditable='true']")).sendKeys("Hi sir it is working");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		driver.navigate().refresh();	
		driver.findElement(By.linkText("Inbox")).click();
		driver.findElement(By.xpath("//span[text()='PRABHAT SHETTY']/..//cite[@class='rd_mail_tickbox']")).click();
		driver.findElement(By.xpath("//span[text()='Delete'][1]")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
	    System.out.println("Done");
	
	
	}
}