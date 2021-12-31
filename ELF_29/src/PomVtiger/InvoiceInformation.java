package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoiceInformation {
	public InvoiceInformation(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//span[@class='lvtHeaderText']")
private WebElement invoiceiInformation;
@FindBy(xpath="//span[@id='dtlview_Subject']")   //getext()
private WebElement subject;
@FindBy(xpath="//span[@id='dtlview_Billing Address']")
private WebElement billingAddress;
@FindBy(xpath="//span[@id='dtlview_Shipping Address']")
private WebElement shippingAddress;
@FindBy(xpath="//td[@class='crmTableRow small lineOnTop'][3]")
private WebElement quantity;
@FindBy(xpath="//span[@id='dtlview_Status']")
private WebElement statusdata;

public WebElement getStatusdata() {
	return statusdata;
}
public WebElement getInvoiceiInformation() {
	return invoiceiInformation;
}
public WebElement getSubject() {
	return subject;
}
public WebElement getBillingAddress() {
	return billingAddress;
}
public WebElement getShippingAddress() {
	return shippingAddress;
}
public WebElement getQuantity() {
	return quantity;
}



}
