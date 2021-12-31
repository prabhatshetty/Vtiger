package ConfigurationAnnotation;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Configuration {
	//public WebDriver driver;

	@BeforeSuite()
	public void beforesuite() {
		Reporter.log("before suite",true);
	}
	@BeforeTest
	public void beforetest() {
		Reporter.log("before test",true);	
	}
	@BeforeClass
	public void beforeclass() {
		Reporter.log("before class",true);
	}
	@BeforeMethod
	public void beforemethod() {
		Reporter.log("before method",true);
	}
	@AfterMethod
	public void aftermethod() {
		Reporter.log("after method",true);
	}
	@AfterClass
	public void afterclass() {
		Reporter.log("after class",true);
	}
	@AfterTest
	public void aftertest() {
		Reporter.log("after test",true);
	}
	@AfterSuite
	public void aftersuite() {
		Reporter.log("after suite",true);
	}

}
