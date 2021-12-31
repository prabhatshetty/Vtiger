package addtocartandremove;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MakemytripCal {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./elfsoftwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	LocalDateTime ldt =LocalDateTime.now().plusMonths(4);     //can Add months,days Here
	String mname = ldt.getMonth().toString();

mname=mname.substring(0,3);
String mn = " "+mname.substring(0,1).toUpperCase()+mname.substring(1,3).toLowerCase();

int date = ldt.getDayOfMonth();
int year = ldt.getYear();
System.out.println(mn);
System.out.println(date);
System.out.println(year);
driver.get("https://www.makemytrip.com/");
Actions actions=new Actions(driver);
actions.click().perform();
driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
driver.findElement(By.xpath("//span[text()='DEPARTURE']")).click();
//from here updated
for(;;)
{
	try {driver.findElement(By.xpath("//div[contains(@aria-label,'"+mn+" "+date+" "+year+"')]")).click();
	break;	
	}
	catch (NoSuchElementException e) {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	}
}


}
}
