package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Contact {
public Contact(WebDriver driver) {
PageFactory.initElements(driver,this);
}
public WebElement getSelectcontact() {
	return selectcontact;
}
@FindBy(xpath="//a[text()='Depankar Deb']")
private WebElement selectcontact;
}