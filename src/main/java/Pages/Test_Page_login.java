package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Test_Base_logo;
import utility.ReadExcelFile;
import utility.ReadPropertyFile;

public class Test_Page_login extends Test_Base_logo {

	@FindBy(xpath="//img[@alt='Kite']")private WebElement KiteLogo;
	@FindBy(xpath="//img[@alt='Zerodha']")private WebElement ZerodhaLogo;
	@FindBy(xpath="//input[@id='userid']")private WebElement userID;
	@FindBy(xpath=" //input[@type='password']")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	 @FindBy(xpath="//input[@id='pin']")private WebElement pin;  
	 @FindBy(xpath="//button[@type='submit']")private WebElement contBtn;
	public Test_Page_login() 
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    public String verifyAppTitle() 
	    {
	    	return driver.getTitle();
	        
	    } 
	   public String VerifyZerodhaTitle()
	    {
	    	return driver.getTitle();
	  
	    }
	 
	     public boolean  VerifyKiteLogo()
	     {
	    	return KiteLogo.isDisplayed();
	     }
	     public boolean  VerifyZerodhaLogo() 
	     {
	    	return ZerodhaLogo.isDisplayed();
	     }
	      public void signIn() throws Throwable
	{
	    userID.sendKeys(ReadPropertyFile.readPropertyFile("userID"));
	    password.sendKeys(ReadPropertyFile.readPropertyFile("password"));
	         
	    loginButton.click();
	         
	    pin.sendKeys(ReadPropertyFile.readPropertyFile("pin"));
	    Thread.sleep(2000);
	    contBtn.click();
	         
	      }
	      }


	
	
	
	
	
	
	
	
	
	
	
	
	

 