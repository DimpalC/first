package TestCase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Test_Base_logo;
import Pages.Order_zerodha_page;
import Pages.Test_Page_login;

public class Order_zerodha_pageTest extends Test_Base_logo{
	

		
		Order_zerodha_page order;
		Test_Page_login login;
		
		@BeforeMethod
		public void setUp() throws Throwable
		{
			initalization();
			order= new Order_zerodha_page();
			login= new Test_Page_login();
			login.signIn();
	    }
		
		@Test(enabled=false)
		public void orderIcon() throws Exception
		{
			order.orderIcon();
		}
		@Test(enabled=false)
		public void GTT_iconTest() throws Exception
		{
			order.GTT_icon();
		}
		

		@Test(enabled=false)
		public void BasketIconTest() throws Exception
		{
			order.BasketIcon();
		}
		
		@Test
		public void SIPTest() throws Exception
		{
			order.SIP();
		}
		}

