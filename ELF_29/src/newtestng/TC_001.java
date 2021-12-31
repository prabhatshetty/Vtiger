package newtestng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_001 {
	@Test
	public void create_Account()
	{
		Reporter.log("create",true);
		String a="hello im";
		String e="hello im";
		Assert.assertEquals(a,e,"not correct");
		Reporter.log("awersome",true);
	}
//	@Test (dependsOnMethods= {"create_Account"},priority=-2)                               //(priority=-1)
//	public void read_Account()
//	{
//		Reporter.log("read",true);
//	}
//	@Test//(priority=-2,invocationCount=10,threadPoolSize=5)
//	public void update_Account()
//	{
//		Reporter.log("update ",true);
//	}
//	@Test
//	public void delete_Account()
//	{
//		Reporter.log("delete",true);
//	}

}
