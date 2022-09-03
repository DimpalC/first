package TestCase;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Test_Base_logo;
import Pages.Test_Page_login;
import utility.TakeScreenShot;

public class Test_Page_loginTest extends Test_Base_logo {
		//assert.assertEqual= expt,actual (wrong asel tr tyachya Next statment print hoil)
Test_Page_login login;

@BeforeMethod(groups="sanity")
	public void setup() throws Exception
	{
		initalization();
		login= new Test_Page_login();
	}
@Test(enabled=false,priority=0,groups="sanity")
			public void verifyAppTitleTest() 
			{
				String Act = login.verifyAppTitle();
				System.out.println(Act);
//				String ExpTitle="12Kite - Zerodha's fast and elegant flagship trading platform"; 
//		        String actualTitle=login.verifyAppTitleTest();
//		        Assert.assertEquals(actualTitle,ExpTitle,"statments wrong hai" );

				
		      }

			@Test(enabled=false,priority=1,groups="sanity")
			public void VerifyZerodhaTitleTest()
			{
                String Act = login.VerifyZerodhaTitle();
				System.out.println(Act);
//				String expTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
//				String ActualTitle = login.verifyAppTitle();
//				//SoftCode
//				AssertJUnit.assertEquals(expTitle,ActualTitle,"title is wrong");
				
				
			}
			@Test(enabled=false,priority=2)
		    public void VerifyKiteLogoTest()
		    {
				Boolean result=login.VerifyKiteLogo();
				System.out.println(result);
				//HardCode
//				Assert.assertTrue(false);
//				System.out.println("result is failed");
				
				
		    }
			@Test(enabled=false,priority=3)
			public void VerifyZerodhaLogoTest()
			{
				boolean resul=login.VerifyZerodhaLogo();
				System.out.println(resul);
//				AssertJUnit.assertEquals(resul, true);
			//	Assert.assertFalse(false);

				
			}
			
			@Test(enabled=true)
			public void signInTest() throws Throwable
			{
				login.signIn();
				
			}
			@AfterMethod(groups="sanity")
			public void exit(ITestResult z) throws Exception 
			{
				if(ITestResult.FAILURE==z.getStatus())
				{
					TakeScreenShot.TakeScreenShotFailedTC(driver, z.getName());
				}
				driver.close();
			}
			
}
