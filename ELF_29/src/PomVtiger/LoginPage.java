package PomVtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

	public WebElement getUserNameTextField() {
		return userNameTextField;
	}
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	public WebElement getLoginButton() {
		return LoginButton;
	}
	@FindBy(xpath="//input[@name='user_name']")
	private WebElement userNameTextField;
	@FindBy(xpath="//input[@name='user_password']")
	private WebElement passwordTextField;
	@FindBy(xpath="//input[@id='submitButton']")
	private WebElement LoginButton;
}
