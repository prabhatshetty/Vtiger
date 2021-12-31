package VtigerAssignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestCaseThree {
	public static void main(String[] args) {
		//step 1: open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implcitlyWait();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browserlaunched successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//step 2: Enter the Url 
		driver.get("http://localhost:8888/index.php");


		//step 3:Enter valid credientials
		String parent = driver.getWindowHandle();
		WebElement username = driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		String actual = username.getAttribute("value");
		String espected="admin";
		if( espected.equals(actual))
		{
			System.out.println("User name is entered sussessfully");
		}else {
			System.out.println("User name is not entered sussessfully");
		}
		WebElement password = driver.findElement(By.xpath("//input[@name='user_password']"));
		password.sendKeys("root");
		String actuale = password.getAttribute("value");
		String espectede="root";
		if( espectede.equals(actuale))
		{
			System.out.println("password is entered sussessfully");
		}else {
			System.out.println("password is not  entered sussessfully");
		}
		//step 4:Click on login button
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		//step 5:click on more
		driver.findElement(By.xpath("//a[text()='More']")).click();	
		//step 7:click on invoice
		driver.findElement(By.xpath("//a[text()='Invoice']")).click();
		String espectedtinvoice = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		String actualtitle = driver.getTitle();
		if(espectedtinvoice.equals(actualtitle))
		{
			System.out.println("Invoice page is displayed");
		}else {
			{
				System.err.println("Invoice page is not displayed");
			}
		}
		//step 8:create Invoice
		driver.findElement(By.xpath("//img[@alt='Create Invoice...']")).click();
		String espectednewinvoicetitle = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		String actualnewinvoicetitle = driver.getTitle();
		if(espectednewinvoicetitle.equals(actualnewinvoicetitle))
		{
			System.out.println("creating New Invoice page is be display");
		}else {
			System.err.println(actualnewinvoicetitle+"    "+"creating New Invoice page is not display"+"    "+espectednewinvoicetitle);
		}
		//step 9:Enter the information
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Motog   Billing");
		//driver.findElement(By.xpath("//textarea[@class='detailedViewTextBox'][1]")).sendKeys("Hadapsar,Pune");
		//	driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Hadapsar,Pune ");

		//step 10: click on "Look-UP" image beside the "Organisation" field
		driver.findElement(By.xpath("//td[text()='Organization Name 			']/..//img[@alt='Select']")).click();
		Set<String> allgwindow = driver.getWindowHandles();
		allgwindow.remove(parent);
		for(String windowId:allgwindow) {
			driver.switchTo().window(windowId);
			System.out.println("Organisation Page is displayed");
			driver.findElement(By.xpath("//a[@id='1']")).click(); 
		}
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.switchTo().window(parent);
		driver.findElement(By.xpath("//textarea[@class='detailedViewTextBox'][1]")).sendKeys("Hadapsar,Pune");
		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Hadapsar,Pune ");
		//step 11: click on products Look Up image
		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();    
		Set<String> allproduct = driver.getWindowHandles();
		allproduct.remove(parent);
		for(String windowId:allproduct)
			driver.switchTo().window(windowId);
		driver.findElement(By.xpath("//a[@id='popup_product_4']")).click();
		driver.switchTo().window(parent);
		//Step 12: Enter the QTY
		WebElement quantity = driver.findElement(By.xpath("//input[@id='qty1']"));
		quantity.sendKeys("1");
		String espectedqty="1";
		String aspectedqty = quantity.getAttribute("value");	
		if( espectedqty.equals(aspectedqty))
		{
			System.out.println("quantity is entered sussessfully");
		}else {
			System.out.println(quantity+"quantity is not entered sussessfully");
		}
		//Step 13: select the status
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='invoicestatus']"));
		Select select = new Select(dropdown);
		select.selectByIndex(2);
		WebElement droptext = select.getFirstSelectedOption(); 
		String abc = droptext.getText();
		String espectedstatus="Approved";
		if(espectedstatus.equals(abc))
		{
			System.out.println("Status Approved is selected successfully");
		}else {
			System.out.println("Status Approved is not selected successfully");
		}
		//step 14: Click on save
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		Actions actions=new Actions(driver);
		System.out.println("clickon save button");
		//step 15: click on sign out
		WebElement signout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		actions.moveToElement(signout).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		System.out.println("sign out is successfull");
	}

}

