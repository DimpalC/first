package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Test_Base_logo;
import utility.ReadExcelFile;

public class DashBoard_zerodha_page extends  Test_Base_logo  {

	@FindBy(xpath=" //span[@class='user-id']")private WebElement userID;
	   @FindBy(xpath="//span[@class='nickname']")private WebElement nickName;
	@FindBy(xpath="//input[@type='text']")private WebElement search;
	   @FindBy(xpath="//h4[@class='username']")private WebElement userName ;
	   @FindBy(xpath="//div[@class='email']")private WebElement mailID ;
	 @FindBy(xpath="//a[@href='/logout']")private WebElement logOut;
	@FindBy(xpath="//a[@class='button button-blue']")private WebElement activateBttn;
	  @FindBy(xpath="//button[text()='Start investing ']")private WebElement investBttn;
	@FindBy(xpath="(//input[@icon='search'])[2]")private WebElement searchBttn;
	@FindBy(xpath="(//button[@class='button-outline button-blue' and @type='button'])[1]")private WebElement createGTT;
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement triggerPrice;
	@FindBy(xpath="(//input[@type='number'])[3]")private WebElement Qty;
	@FindBy(xpath="(//input[@type='number'])[4]")private WebElement price;
	@FindBy(xpath="//button[@type='submit' and @class='button-outline cancel']")private WebElement cancelBttn;




	public  DashBoard_zerodha_page()
	   {
		   
	        PageFactory.initElements(driver, this);
	 }
	    public String nickName() throws Throwable
	    {
	    	Thread.sleep(3000);
	    	return nickName.getText();
	    
	    }
	    
	    public String userName() throws Throwable
	    {
	    	 Thread.sleep(3000);
	    	 userID.click();
	    	 
	    	return userName.getText();
	    }
	    public String mailID() throws Throwable
	    {
	    	Thread.sleep(3000);
	    	 userID.click();
	    	return mailID.getText();
	    }
	    public void search() throws Throwable
	    {
	    	Thread.sleep(2000);
	    	Actions a= new Actions(driver);
	    	a.click(search).build().perform();
	    	a.sendKeys("tcs").build().perform();
	    	for(int i=0;i<4;i++)
	    	{
	    		a.sendKeys(Keys.ARROW_DOWN).build().perform();
	    	}
	    	a.click().build().perform();
	    	
	    }
	    
	    public void activateBttn() throws Throwable
	    {
	    	Thread.sleep(2000);
	    	activateBttn.click();
	    	
	   }
	    public void investBttn() throws Throwable
	    {
	    	Thread.sleep(3000);
	    	investBttn.click();
	    	Thread.sleep(2000);
	    	searchBttn.sendKeys(ReadExcelFile.readExcelFile(1,0));
	    	Actions a1= new Actions(driver);
	    	for(int i=0;i<=1;i++)
	    	{
	           a1.sendKeys(Keys.ARROW_DOWN).build().perform();
	    	}
	   a1.sendKeys(Keys.ENTER).build().perform();
	   Thread.sleep(2000);
	   a1.moveToElement(createGTT).click().build().perform();
	   Thread.sleep(2000);
	   a1.moveToElement(triggerPrice).sendKeys(ReadExcelFile.readExcelFile(1,1)).build().perform();
	   Thread.sleep(2000);
	   a1.moveToElement(Qty).sendKeys(ReadExcelFile.readExcelFile(1,2)).build().perform();
	   Thread.sleep(2000);
	   a1.moveToElement(price).sendKeys(ReadExcelFile.readExcelFile(1,3)).build().perform();
	   Thread.sleep(2000);
	   cancelBttn.click();
	    	
	    	
	    }
	    
	 
	    public void logOut() throws Throwable
	    {
	    	Thread.sleep(3000);
	    	userID.click();
	    	logOut.click();
	    }
	 }
	
	
	hello i m update
	
	
	

