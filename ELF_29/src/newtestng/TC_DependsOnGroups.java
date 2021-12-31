package newtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_DependsOnGroups {
	@Test(dependsOnGroups={"Smoke","Intigration"})
	public void modify_Account()
	{
		Reporter.log("modify",true);
	}

}
