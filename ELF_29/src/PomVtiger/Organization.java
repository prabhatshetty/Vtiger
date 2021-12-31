package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {
public Organization(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

@FindBy(xpath="//a[@id='1']")
private WebElement ProductMoto;

public WebElement getProductMoto() {
	return ProductMoto;
}
}
