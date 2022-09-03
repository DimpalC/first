package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Test_Base_logo;
import Pages.Holding_zerodha_page;
import Pages.Test_Page_login;

public class Holding_zerodha_pageTest extends Test_Base_logo{
	
	     
		
		Test_Page_login login;
		Holding_zerodha_page hold;

		@BeforeMethod(groups= {"regression","sanity"})
		public void setup() throws Throwable
		{
			initalization();
			login= new Test_Page_login();
			login.signIn();
			hold= new Holding_zerodha_page();
		}
		
		@Test(enabled=true,invocationCount=2)
		public void holding_iconTest() throws Exception
		{
			hold.holding_icon();
		}
		
		@Test(enabled=true,priority=-1,groups="sanity")
		public void analyticsTest()throws Exception
		{
			hold.analytics();
		}
		
		@Test(enabled=true,priority=0,groups="regression")
		public void dropDownTest()throws Exception
		{
			hold.dropDown();
		}
		
		@AfterMethod(groups= {"regression","sanity"})
		public void exit()
		{
			driver.close();
		}
	}

