package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product {
public Product(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
@FindBy(xpath="//a[@id='popup_product_4']")
private WebElement ProductMoto1;
public WebElement getProductMoto1() {
	return ProductMoto1;
}

}
