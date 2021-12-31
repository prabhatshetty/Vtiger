package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homeone {
	public Homeone(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getMoreDropDown() {
		return moreDropDown;
	}
	public WebElement getInvoiceSubMenu() {
		return invoiceSubMenu;
	}
	public WebElement getCreateInvoiceLookUpImage() {
		return createInvoiceLookUpImage;
	}
	public WebElement getSubjectTextField() {
		return subjectTextField;
	}
	public WebElement getBillingAdressTextField() {
		return billingAdressTextField;
	}
	public WebElement getShippingAdressTextField() {
		return shippingAdressTextField;
	}
	public WebElement getLookUpImageOfOrganization() {
		return lookUpImageOfOrganization;
	}
	public WebElement getProductLookupImage() {
		return productLookupImage;
	}
	public WebElement getQuantityTextField() {
		return quantityTextField;
	}
	public WebElement getStatus() {
		return status;
	}
	public WebElement getSalesLookupImage() {
		return salesLookupImage;
	}
	public WebElement getContactlookupimage() {
		return contactlookupimage;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	@FindBy(xpath="//a[text()='More']")
	private WebElement moreDropDown;
	@FindBy(xpath="//a[text()='Invoice']")
	private WebElement invoiceSubMenu;
	@FindBy(xpath="//img[@alt='Create Invoice...']")
	private WebElement createInvoiceLookUpImage;
	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjectTextField;
	@FindBy(xpath="//textarea[@class='detailedViewTextBox'][1]")
	private WebElement billingAdressTextField;
	@FindBy(xpath="//textarea[@name='ship_street']")
	private WebElement shippingAdressTextField;
	@FindBy(xpath="//td[text()='Organization Name 			']/..//img[@alt='Select']")
	private WebElement lookUpImageOfOrganization;
	@FindBy(xpath="//img[@id='searchIcon1']")
	private WebElement productLookupImage;
	@FindBy(xpath="//input[@id='qty1']")
	private WebElement quantityTextField;
	@FindBy(xpath="//select[@name='invoicestatus']")
	private WebElement status;
	@FindBy(xpath="//img[@onclick='selectSalesOrder();']")      //img[@onclick='selectSalesOrder();
	private WebElement salesLookupImage;
	@FindBy(xpath="//img[@onclick='selectContact(\"false\",\"general\",document.EditView)']")
	private WebElement contactlookupimage;
	@FindBy(xpath="//input[@title='Save [Alt+S]'][1]")
	private WebElement saveButton;

	}

