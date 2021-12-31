package newtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_accSmokeG {
	@Test(groups="Smoke")
	public void create_Account() 
	{
		Reporter.log("account",true);
	}

}
