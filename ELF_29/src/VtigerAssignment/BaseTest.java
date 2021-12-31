package VtigerAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomVtiger.Homeone;
import PomVtiger.LoginPage;
import PomVtiger.Signout;

public class BaseTest {
	public static WebDriver driver;
	@BeforeClass
	public void launchingBrowser() {
		//step 1: open the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Prabhat\\Downloads\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implcitlyWait();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Reporter.log("Browserlaunched successfully",true);	
	}
	@BeforeMethod
	public void login() {
		//step 1: Enter the Url 
		driver.get("http://localhost:8888/index.php");
		String expectedLoginPageTittle="vtiger CRM 5 - Commercial Open Source CRM";
		Assert.assertEquals(expectedLoginPageTittle,driver.getTitle(),"Login Page is not Displayed");
		Reporter.log("Login Page is Displayed",true);
		LoginPage loginpage=new LoginPage(driver);
		loginpage.getUserNameTextField().clear();
		loginpage.getUserNameTextField().sendKeys("admin");
		String espectedusername="admin";
		String actualusername =loginpage.getUserNameTextField().getAttribute("value");
		Assert.assertEquals(actualusername,espectedusername,"User name is wrong");
		Reporter.log("User name("+actualusername+") entered successfully",true);
		loginpage.getPasswordTextField().clear();
		loginpage.getPasswordTextField().sendKeys("root");
		String espectedpassword="root";
		String actualpassword = loginpage.getPasswordTextField().getAttribute("value");
		Assert.assertEquals(actualpassword,espectedpassword,"Password  is wrong");
		Reporter.log("Password ("+actualpassword+") entered sussessfully",true);
		//step 4:Click on login button
		loginpage.getLoginButton().click();

	}

	@AfterMethod
	public void logout()
	{
		//step 2: click on sign out
				Signout signout = new Signout(driver);
				Actions actions=new Actions(driver);
				WebElement signouticon = signout.getSignouticon();
				actions.moveToElement(signouticon).perform();
				signout.getSignoutbutton().click();
				Reporter.log("Sign out is successful",true);
				driver.close();
	}
}
