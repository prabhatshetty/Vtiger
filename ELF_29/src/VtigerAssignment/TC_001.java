package VtigerAssignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ConfigurationAnnotation.ListenerImplementationClass;
import PomVtiger.HomePage;
import PomVtiger.Homeone;
import PomVtiger.InvoiceInformation;
import PomVtiger.LoginPage;
import PomVtiger.Organization;
import PomVtiger.Product;
import PomVtiger.Signout;
/***
 * 
 * @author Prabhat
 *
 */

public class TC_001 extends BaseTest {
	@Test
	public void invoice()
	{
		//step 1:validate the Home Page
		String parent = driver.getWindowHandle();
		Homeone homePagee = new Homeone(driver);
		String expectedHomePageTittle = "Administrator - Home - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(expectedHomePageTittle,driver.getTitle(),"Home Page is not Displayed");
		Reporter.log("Home Page is Displayed",true);
		
		//step 2:click on more
		homePagee.getMoreDropDown().click();
		
		//step 3:click on Invoice
		homePagee.getInvoiceSubMenu().click();
		String espectedtinvoiceTittle = "Administrator - Invoice - vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(driver.getTitle(),espectedtinvoiceTittle,"Invoice page is not displayed");
		
		//step 4:create Invoice
		homePagee.getCreateInvoiceLookUpImage().click();
		
		//step 5:Enter the Details
		homePagee.getSubjectTextField().sendKeys("Motog   Billing ");
		homePagee.getBillingAdressTextField().sendKeys("Hadapsar,Pune");
		homePagee.getShippingAdressTextField().sendKeys("Hadapsar,Pune");
		
		//step 6:click on Organization Look Up Image 
		homePagee.getLookUpImageOfOrganization().click();
		Set<String> allgwindoworg = driver.getWindowHandles();
		allgwindoworg.remove(parent);
		Organization organization = new Organization(driver);
		for(String windowId:allgwindoworg) {
			driver.switchTo().window(windowId);
			organization.getProductMoto().click();
			Reporter.log("Organisation Page is displayed",true);
		}
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.switchTo().window(parent);
		
		//step 7:click on Product Look Up Image 
		homePagee.getProductLookupImage().click();
		
		//step 8: select the product
		Set<String> allgwindowproduct = driver.getWindowHandles();
		allgwindowproduct.remove(parent);
		Product productMoto = new Product(driver);
		for(String windowId:allgwindowproduct) {
			driver.switchTo().window(windowId);
			Reporter.log("product Page is displayed",true);
			productMoto.getProductMoto1().click();
		}
		driver.switchTo().window(parent);
		
		//step 9: enter the Quantity
		homePagee.getQuantityTextField().clear();
		homePagee.getQuantityTextField().sendKeys("1");
		String espectedqty="1";
		WebElement qtytextfiels = homePagee.getQuantityTextField();
		String actualqty = qtytextfiels.getAttribute("value");
		Assert.assertEquals(espectedqty,actualqty,""+actualqty+"quantity is not entered successfully");
		Reporter.log("quantity ("+actualqty+") is entered successfully",true);
		
		//step 10: Click on save
		homePagee.getSaveButton().click();
		Actions actions=new Actions(driver);
		Reporter.log("click on save button is successful",true);
		InvoiceInformation invoiceinformationn = new InvoiceInformation(driver);
		String actualinvoinfo = driver.getCurrentUrl();
		String expectedurl = "http://localhost:8888/index.php?action=DetailView&module=Invoice&parenttab=Sales&record=52&viewname=0&start=";
		Reporter.log("Invoice info page is display",true);
		String actualsubject = invoiceinformationn.getSubject().getText();
		String expectedsubject = "Motog Billing";
		Assert.assertEquals(expectedsubject,actualsubject,"subject("+actualsubject+") is not display");
		Reporter.log("Subject("+actualsubject+") is  display",true);
		String actualbilladdres = invoiceinformationn.getBillingAddress().getText();
		String expectedbilladdress = "Hardespur pune";
		Assert.assertEquals(expectedbilladdress,actualbilladdres,"Address("+actualbilladdres+") is not display");
		Reporter.log("Address("+actualbilladdres+") is display",true);
		String actualshipaddress = invoiceinformationn.getShippingAddress().getText();
		String expectedshipaddress = "Hardespur pune";
		Assert.assertEquals(actualshipaddress,expectedshipaddress,""+actualqty+"Address("+actualshipaddress+") is not display");
		Reporter.log("Address("+actualshipaddress+") is display",true);
		String actualquantity = invoiceinformationn.getQuantity().getText();
		String expectedquantity = "1.00";
		Assert.assertEquals(actualquantity,expectedquantity,"Quantity("+actualquantity+") is not display");
		Reporter.log("Quantity("+actualquantity+") is display",true);
	}
}
