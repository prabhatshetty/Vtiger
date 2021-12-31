package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Salespage {
public Salespage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[text()='Motog']")
private WebElement salesorderMotoG;
public WebElement getSalesorderMotoG() {
	return salesorderMotoG;
}
}
