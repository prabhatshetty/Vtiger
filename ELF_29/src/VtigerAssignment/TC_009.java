package VtigerAssignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import PomVtiger.Contact;
import PomVtiger.Homeone;
import PomVtiger.InvoiceInformation;
import PomVtiger.LoginPage;
import PomVtiger.Organization;
import PomVtiger.Product;
import PomVtiger.Signout;

public class TC_009 {
	public static void main(String[] args) {
		//step 1: open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Browserlaunched successfully");
		//step 2: Enter the Url 
		driver.get("http://localhost:8888/index.php");
		String expectedLoginPageTittle="vtiger CRM 5 - Commercial Open Source CRM";
		if( expectedLoginPageTittle.equals(driver.getTitle()))
		{
			System.out.println("Login Page is Displayed");
		}else {
			System.err.println("Login Page is not Displayed");
		}
		//step 3:Enter valid credientials
		String parent = driver.getWindowHandle();
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUserNameTextField().clear();
		loginpage.getUserNameTextField().sendKeys("admin");
		String espectedusername="admin";
		String actualusername =loginpage.getUserNameTextField().getAttribute("value");
		if( espectedusername.equals(actualusername))
		{
			System.out.println("User name("+actualusername+") entered successfully");
		}else {
			System.err.println("User name is not entered successfully");
		}
		loginpage.getPasswordTextField().clear();
		loginpage.getPasswordTextField().sendKeys("root");
		String espectedpassword="root";
		String actualpassword = loginpage.getPasswordTextField().getAttribute("value");
		if( espectedusername.equals(actualusername))
		{
			System.out.println("Password ("+actualpassword+") entered sussessfully");
		}else {
			System.err.println("Password  is not entered sussessfully");
		}
		//step 4:Click on login button
		loginpage.getLoginButton().click();
		Homeone homePagee = new Homeone(driver);
		String expectedHomePageTittle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		if( expectedHomePageTittle.equals(driver.getTitle()))
		{
			System.out.println("Home Page is Displayed");
		}else {
			System.err.println("Home Page is not Displayed");
		}

		//step 5:click on more
		homePagee.getMoreDropDown().click();
		//step6:click on Invoice
		homePagee.getInvoiceSubMenu().click();
		String espectedtinvoiceTittle = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		if(espectedtinvoiceTittle.equals(driver.getTitle()))
		{
			System.out.println("Invoice page is displayed");
		}else
		{
			System.err.println("Invoice page is not displayed");
		}
		//step 8:create Invoice
		homePagee.getCreateInvoiceLookUpImage().click();
		//step 9:Enter the Details
		homePagee.getSubjectTextField().sendKeys("Motog   Billing ");
		homePagee.getBillingAdressTextField().sendKeys("Hadapsar,Pune");
		homePagee.getShippingAdressTextField().sendKeys("Hadapsar,Pune");
		//step 10:click on Organization Look Up Image 
		homePagee.getLookUpImageOfOrganization().click();
		Set<String> allgwindoworg = driver.getWindowHandles();
		allgwindoworg.remove(parent);
		Organization organization = new Organization(driver);
		for(String windowId:allgwindoworg) {
			driver.switchTo().window(windowId);
			organization.getProductMoto().click();
			System.out.println("Organisation Page is displayed");
		}
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.switchTo().window(parent);
		//step 10:click on Product Look Up Image 
		homePagee.getProductLookupImage().click();
		//step 11: select the product
		Set<String> allgwindowproduct = driver.getWindowHandles();
		allgwindowproduct.remove(parent);
		Product productMoto = new Product(driver);
		for(String windowIdd:allgwindowproduct) {
			driver.switchTo().window(windowIdd);
			System.out.println("product Page is displayed");
			productMoto.getProductMoto1().click();
		}
		driver.switchTo().window(parent);
		//step 12: Select the contact
		homePagee.getContactlookupimage().click();
		Set<String> allsaleswindowcontact = driver.getWindowHandles();
		allsaleswindowcontact.remove(parent);
		for(String windowIddd:allsaleswindowcontact) {
			driver.switchTo().window(windowIddd);
			Contact contactsel = new Contact(driver);
			contactsel.getSelectcontact().click();
			System.out.println("contact Page is displayed");
			Alert c = driver.switchTo().alert();
			c.accept();
		}
		//step 13: Select the status
		driver.switchTo().window(parent);
		WebElement dropdown = homePagee.getStatus();
		dropdown.click();
		Select select = new Select(dropdown);
		select.selectByIndex(5);
		WebElement droptext = select.getFirstSelectedOption(); 
		String abc = droptext.getText();
		String espectedstatus="Paid";
		if(espectedstatus.equals(abc))
		{
			System.out.println("Status Paid is selected successfully");
		}else {
			System.out.println("Status Paid is not selected successfully");
		}
        //step 14:Price List
		
		//step 13: enter the Quantity
		homePagee.getQuantityTextField().clear();
		homePagee.getQuantityTextField().sendKeys("1");
		String espectedqty="1";
		WebElement qtytextfiels = homePagee.getQuantityTextField();
		String actualqty = qtytextfiels.getAttribute("value");
		if( espectedqty.equals(actualqty))
		{
			System.out.println("quantity ("+actualqty+") is entered successfully");
		}else {
			System.err.println(actualqty+"quantity is not entered successfully");
		}
		//step 14: Click on save
		homePagee.getSaveButton().click();
		Actions actions=new Actions(driver);
		System.out.println("click on save button is successful");

		InvoiceInformation invoiceinformationn = new InvoiceInformation(driver);
		String actualinvoinfo = driver.getCurrentUrl();
		String expectedurl = "http://localhost:8888/index.php?action=DetailView&module=Invoice&parenttab=Sales&record=52&viewname=0&start=";
		if(expectedurl.equals(actualinvoinfo))
		{
			System.out.println("Invoice info page is display");
		}else {
			System.err.println("Invoice info page is not display");
		}
		String actualsubject = invoiceinformationn.getSubject().getText();
		String expectedsubject = "Motog Billing";
		if(expectedsubject.equals(actualsubject))
		{
			System.out.println("Subject("+actualsubject+") is  display");
		}else {
			System.err.println("subject("+actualsubject+") is not display");
		}
		String actualbilladdres = invoiceinformationn.getBillingAddress().getText();
		String expectedbilladdress = "Hardespur pune";
		if(expectedbilladdress.equals(actualbilladdres))
		{
			System.out.println("Address("+actualbilladdres+") is display");
		}else {
			System.err.println("Address("+actualbilladdres+") is not display");
		}

		String actualshipaddress = invoiceinformationn.getShippingAddress().getText();
		String expectedshipaddress = "Hardespur pune";
		if(expectedshipaddress.equals(actualshipaddress))
		{
			System.out.println("Address("+actualshipaddress+") is display");
		}else {
			System.err.println("Address("+actualshipaddress+") is not display");
		}
		String actualquantity = invoiceinformationn.getQuantity().getText();
		String expectedquantity = "1.00";
		if(expectedquantity.equals(actualquantity))
		{
			System.out.println("Quantity("+actualquantity+") is display");
		}else {
			System.err.println("Quantity("+actualquantity+") is not display");
		}
		//step 15: click on sign out
		Signout signout = new Signout(driver);
		WebElement signouticon = signout.getSignouticon();
		actions.moveToElement(signouticon).perform();
		signout.getSignoutbutton().click();
		System.out.println("Sign out is successful");
	}
}



