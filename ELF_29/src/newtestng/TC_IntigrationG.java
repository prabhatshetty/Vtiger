package newtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_IntigrationG {

	@Test(groups="Intigration")
	public void create_AccountTextField()
	{
		Reporter.log("create account intigration",true);
	}

}