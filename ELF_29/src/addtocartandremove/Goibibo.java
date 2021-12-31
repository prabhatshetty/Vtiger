package addtocartandremove;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Goibibo {
	@Test
	public void goibibo() throws InterruptedException {
		//step 1: open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browserlaunched successfully",true);
		LocalDateTime ldt =LocalDateTime.now().plusMonths(2);     //can Add months,days Here
		String mname = ldt.getMonth().toString();

		mname=mname.substring(0,3);
		String mnn = ""+mname.substring(0,1).toUpperCase()+mname.substring(1,3).toLowerCase();

		int date = ldt.getDayOfMonth();
		int year = ldt.getYear();
		String day = LocalDate.now().getDayOfWeek().name();
		Reporter.log(day,true);
		Reporter.log(""+year,true);
		day=day.substring(0,3);
		String actualday = ""+day.substring(0,1).toUpperCase()+day.substring(1,3).toLowerCase();
		Reporter.log(actualday,true);
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//input[@id='departureCalendar']")).click();//aria-label="Tue Dec 28 2021"
		for(;;)
		{
			Thread.sleep(2000);
			try {driver.findElement(By.xpath("//div[contains(@aria-label,'"+actualday+" "+mnn+" "+date+" "+year+"')]")).click();
			break;	
			}
			catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
}
}