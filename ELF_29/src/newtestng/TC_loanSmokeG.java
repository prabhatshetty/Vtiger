package newtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_loanSmokeG {
	@Test(groups="Smoke")
	public void loan_Account()
	{
		Reporter.log("loan",true);
	}

}

