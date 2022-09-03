package TestCase;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	@Test
	public void test1()
	{
		SoftAssert s= new SoftAssert();
	System.out.println("execution of test1 started");
//	Assert.assertEquals(200, 201,"checked if it is failed");
	System.out.println("checking the firt assertion");
	AssertJUnit.assertEquals("java", "java","check if it is failed");
	System.out.println("execution of test1 ended");
//	s.assertAll();
}
	
	@Test
	public void test2()
	{
    
	System.out.println("execution of test2 started");
	Assert.assertEquals(200, 201,"checked if it is failed");
	System.out.println("checking the firt assertion");
//	AssertJUnit.assertEquals("java", "java","check if it is failed");
//	System.out.println("execution of test2 ended");
	
}
}

