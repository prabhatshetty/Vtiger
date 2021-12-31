package VtigerAssignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DemTestCaseOne {
	public static void main(String[] args) throws InterruptedException {
		//step 1: open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implcitlyWait();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browserlaunched successfully");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//step 2: Enter the Url 
		driver.get("http://localhost:8888/index.php");

		String parent = driver.getWindowHandle();

//FROM THIS
		WebElement username = driver.findElement(By.xpath("//input[@name='user_name']"));
		username.sendKeys("admin");
		String actual = username.getAttribute("value");
		System.out.println("user");
		String espected="admin";
		if( espected.equals(actual))
		{
			System.out.println("User name is entered sussessfully");
		}else {
			System.out.println("User name is not entered sussessfully");
		}
		//till here


		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");

		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		driver.findElement(By.xpath("//a[text()='More']")).click();	
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

		driver.findElement(By.xpath("//img[@alt='Create Invoice...']")).click();
		String espectednewinvoicetitle = " Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		String actualnewinvoicetitle = driver.getTitle();
		if(espectednewinvoicetitle.equals(actualnewinvoicetitle))
		{
			System.out.println("creating New Invoice page is be display");
		}else {
			System.err.println(actualnewinvoicetitle+"    "+"creating New Invoice page is not display"+"    "+espectednewinvoicetitle);
		}

		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("Motog   Billing");
		//driver.findElement(By.xpath("//textarea[@class='detailedViewTextBox'][1]")).sendKeys("Hadapsar,Pune");
		//driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Hadapsar,Pune ");

		//organisation
		driver.findElement(By.xpath("//td[text()='Organization Name 			']/..//img[@alt='Select']")).click();
		Set<String> allgwindow = driver.getWindowHandles();//change from here
		System.out.println(allgwindow);

		allgwindow.remove(parent);
		//System.out.println(allgwindow);
		for(String windowId:allgwindow) {
			driver.switchTo().window(windowId);
		driver.findElement(By.xpath("//a[@id='1']")).click();
		}
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.switchTo().window(parent);
		//select the order test case7
	
		driver.findElement(By.xpath("//img[@onclick='selectSalesOrder();']")).click();
		Set<String> allorderwindow = driver.getWindowHandles();
		allorderwindow.remove(parent);
		String espectedorderurl="http://localhost:8888/index.php?module=SalesOrder&action=Popup&html=Popup_picker&popuptype=specific&form=EditView&relmod_id=2&parent_module=Accounts";
		for(String windowId:allorderwindow) 
		{
			driver.switchTo().window(windowId);
		String actualorder = driver.getCurrentUrl();
		if(espectedorderurl.equals(actualorder))
		{
			driver.findElement(By.xpath("//a[text()='Motog']")).click();
			System.out.println("Sales Order page in new-Browser-Window is displayed");
		}
		}
		driver.switchTo().window(parent);
		//test case eight
		driver.findElement(By.xpath("//img[@onclick='selectContact(\"false\",\"general\",document.EditView)']")).click();
		Set<String> allcontactwindow = driver.getWindowHandles();
		allcontactwindow.remove(parent);
		System.out.println("Pass 1");
		String espectedcontacturl="http://localhost:8888/index.php?module=Contacts&action=Popup&html=Popup_picker&popuptype=specific&form=EditView";
		for(String windowId:allcontactwindow) 
		{
			driver.switchTo().window(windowId);
		String actualcontact = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='Depankar Deb']")).click();
		
		Alert c = driver.switchTo().alert();
		c.accept();
		}
		System.out.println("contact page in new-Browser-Window is displayed");
	/*	if(espectedcontacturl.equals(actualcontact))
		{
			System.out.println("Pass2.1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='Depankar Deb']")).click();
			System.out.println("Pass 2");
			Alert c = driver.switchTo().alert();
			c.accept();
			System.out.println("contact page in new-Browser-Window is displayed");
		}
		}*/
		
		
		//driver.switchTo().window(win);
		//driver.findElement(By.xpath("//a[text()='Motog']")).click();
		//System.out.println(allorderwindow);
		//	System.out.println("Pass");
	//	int i=1;
	//	for(String windowId:allgwindow) {
		//	driver.switchTo().window(windowId);//
			
		//		if(i==3) {
			//driver.switchTo().window(windowId);
		//	driver.findElement(By.xpath("//a[text()='Motog']")).click();
		//}
		//i++;
//	}
		//end
		/*driver.switchTo().window(parent);
		driver.findElement(By.xpath("//textarea[@class='detailedViewTextBox'][1]")).sendKeys("Hadapsar,Pune");

		driver.findElement(By.xpath("//textarea[@name='ship_street']")).sendKeys("Hadapsar,Pune ");

		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();    //img[@title='Products']      //img[@id='searchIcon1']//switch the control to product
		System.out.println("pass");


		Set<String> allproduct = driver.getWindowHandles();
		allproduct.remove(parent);
		for(String windowId:allproduct)
			driver.switchTo().window(windowId);
		driver.findElement(By.xpath("//a[@id='popup_product_4']")).click();
		driver.switchTo().window(parent);

		//start status 
		//driver.findElement(By.xpath("//select[@name='invoicestatus']")).click();
		//driver.findElement(By.xpath("//option[@value='Created']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='invoicestatus']"));
		Select select = new Select(dropdown);
		
		select.selectByIndex(1);
		WebElement droptext = select.getFirstSelectedOption(); 
		String abc = droptext.getText();
		String espectedstatus="Created";
		if(espectedstatus.equals(abc))
		{
			System.out.println("Status Created is selected seuccessfully");
		}else {
			System.out.println("Status Created is not selected seuccessfully");
		}
		//Created
		//Approved
		//Sent
		// Credit Invoice
		//Paid
		System.out.println("seleted"+abc);
		//end updated
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
	
	driver.findElement(By.xpath("//input[@title='Save [Alt+S]'][1]")).click();
		Actions actions=new Actions(driver);
		WebElement signout = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		actions.moveToElement(signout).perform();
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();*/
	}

}
