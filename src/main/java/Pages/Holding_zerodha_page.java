package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Test_Base_logo;
import utility.ReadExcelFile;

public class Holding_zerodha_page extends Test_Base_logo {
	@FindBy(xpath="(//span[text()='Holdings'])[1]")private WebElement holding_icon;
	@FindBy (xpath="//button[@class='button-blue']")private WebElement GetStarted;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement searchBttn;
	@FindBy(xpath="//button[text()='Create GTT ']")private WebElement createGTT;
	@FindBy(xpath="//input[@label='Trigger price']")private WebElement triggerPrice;
	@FindBy(xpath="//input[@label='Qty.']")private WebElement Qty;
	@FindBy(xpath="//input[@label='Price']")private WebElement price;
	@FindBy(xpath="//button[@type='submit' and @class='button-outline cancel']")private WebElement cancelBttn;
	@FindBy(xpath="//a[@class='inline-image-text']")private WebElement analytics;
	@FindBy(xpath="//div[@class='su-select holdings-selector']")private WebElement dropDown;
	@FindBy(xpath="//a[text()='Open Coin']")private WebElement coin_Bttn;


	public Holding_zerodha_page()
	{
		PageFactory.initElements(driver, this);
	}

	public void holding_icon() throws Exception
	{
	  holding_icon.click();
	  GetStarted.click();
	  searchBttn.sendKeys(ReadExcelFile.readExcelFile(5,0));
	  Actions a1= new Actions(driver);
	  for(int i=0;i<=2;i++)
	  {
		  a1.sendKeys(Keys.ARROW_DOWN).build().perform();
	  }
	  a1.sendKeys(Keys.ENTER).build().perform();
		a1.click(createGTT).build().perform();
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("argument[0].ScroolintoView()",triggerPrice);
		a1.moveToElement(triggerPrice).click().sendKeys(ReadExcelFile.readExcelFile(5,1)).build().perform();
		a1.moveToElement(Qty).click().sendKeys(ReadExcelFile.readExcelFile(5,2)).build().perform();
		a1.moveToElement(price).click().sendKeys(ReadExcelFile.readExcelFile(5,3)).build().perform();
		cancelBttn.click();
	}

	public void analytics()throws Exception
	{
		holding_icon.click();
		analytics.click();
	}

	public void dropDown()throws Exception
	{
		holding_icon.click();
		Actions a1=new Actions(driver);
		a1.moveToElement(dropDown).click().build().perform();
	    for(int i=0;i<=3;i++)
	    {
	    	a1.sendKeys(Keys.ARROW_DOWN).build().perform();
	    }
	    a1.sendKeys(Keys.ENTER).build().perform();
	    a1.moveToElement(coin_Bttn).click().build().perform();
	}
	}
	
	
	
	
	
	
	

