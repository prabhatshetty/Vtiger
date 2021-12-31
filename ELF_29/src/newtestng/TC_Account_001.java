package newtestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Account_001 {
@Test
public void create_Account()
{
	Reporter.log("hello",true);
}
@Test(priority=-1)
public void read_Account()
{
	Reporter.log("hi",true);
}
@Test(priority=-2,invocationCount=10,threadPoolSize=5)
public void update_Account()
{
	Reporter.log("how r u ",true);
}
@Test(timeOut=2000,enabled=false)
public void delete_Account()
{
	Reporter.log("end",true);
}
}
