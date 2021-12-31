package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {
	public Signout(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']")
private WebElement signouticon;
@FindBy(xpath="//a[text()='Sign Out']")
private WebElement signoutbutton;
public WebElement getSignouticon() {
	return signouticon;
}
public WebElement getSignoutbutton() {
	return signoutbutton;
}
}
