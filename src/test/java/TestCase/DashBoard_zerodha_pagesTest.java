package TestCase;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Test_Base_logo;
import Pages.DashBoard_zerodha_page;
import Pages.Test_Page_login;

public class DashBoard_zerodha_pagesTest {
	public class DashBoard_zerodha_pageTest extends Test_Base_logo {

		DashBoard_zerodha_page dash;
		Test_Page_login login;
		
		@BeforeMethod
		public void Setup() throws Throwable
		{
			initalization();
			login= new Test_Page_login();
			dash= new DashBoard_zerodha_page();
			login.signIn();
			
			
		}
		@Test(enabled= true)
		public void nickNameTest() throws Throwable
		{
			String nick= dash.nickName();
			System.out.println(nick);
			String ExpTitle = "rani";
			String actualTitle = dash.nickName();
		}
		
		@Test(enabled= false)
		public void userNameTest() throws Throwable
		{
			String name = dash.userName();
			System.out.println(name);
		}
		
		@Test(enabled= false)
		public void mailIDTest() throws Throwable
		{
			String  mail = dash.mailID();
			System.out.println(mail);
		}
		
		@Test(enabled= false)
		public void searchTest() throws Throwable
		{
			dash.search();
		}
		@Test(enabled= true)
		public void activateBttnTest() throws Throwable
	    {
	    	dash.activateBttn();
	    	
	    }
		@Test (enabled= true)
		public void investBttnTest() throws Throwable
		{
			dash.investBttn();
		}
		@Test(enabled= true)
		public void logOutTest() throws Throwable
		{
			dash.logOut();
		}
		
	  @AfterMethod
		public void exit(ITestResult z) throws Exception
		{
//		    if(ITestResult.FAILURE== z.getStatus())
//		    {
//		    	TakeScreenshot.CaptureScreenshotFailedTC(driver,z.getName());
//		    }
		driver.close();
		}
	}

	
		
	}


