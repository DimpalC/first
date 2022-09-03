package Pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Test_Base_logo;
import utility.ReadExcelFile;

public class Order_zerodha_page extends Test_Base_logo {
	@FindBy(xpath="//span[text()='Orders']")private WebElement orderIcon;
	@FindBy(xpath="//button[@type='button']")private WebElement getStarted;
	@FindBy(xpath="//a[@class='router-link-exact-active router-link-active']")private WebElement OrderBttn;
	@FindBy(xpath="//span[text()='GTT']")private WebElement GTT_icon;
	@FindBy(xpath="//span[text()='Baskets']")private WebElement BasketIcon;
	@FindBy(xpath="//span[text()='SIP']")private WebElement SIP_icon;
	@FindBy(xpath="//span[text()='Alerts']")private WebElement alert_icon;
	@FindBy(xpath="//span[text()='IPO']")private WebElement IPO_icon;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement search_button;
	@FindBy(xpath="//button[@type='button' and @class='button-outline button-blue' and text()='Create GTT ']")private WebElement createGTT ;
	@FindBy(xpath="//button[@type='submit' and @class='button-outline cancel']")private WebElement cancelButton;
	@FindBy(xpath="//button[@type='button']")private WebElement NewGTT_Button;
	@FindBy(xpath="//button[@class='button-outline']")private WebElement closeBttn;
	@FindBy(xpath="(//span[text()='Orders'])[1]")private WebElement order_buttn;
	@FindBy(xpath="//button[text()='New basket']")private WebElement NewBasketBttn;
	@FindBy(xpath="(//input[@type='text'])[2]")private WebElement basketName;
	@FindBy(xpath="//button[@class='button button-blue wide']")private WebElement createBttn;
	@FindBy(xpath="(//input[@type='number'])[1]")private WebElement triggerPrice;
	@FindBy(xpath="(//input[@type='number'])[3]")private WebElement Qty;	
	@FindBy(xpath="(//input[@type='number'])[4]")private WebElement price;
	@FindBy(xpath="//span[text()='SIP']")private WebElement SIP;
	@FindBy(xpath="//button[text()='Create new SIP']")private WebElement CreateSIP;
	@FindBy(xpath="//input[@label='Name']")private WebElement label;
	@FindBy(xpath="//span[@class='su-checkbox-box']")private WebElement checkBox;
	@FindBy(xpath="//div[@class='su-select' and @name='day']//i")private WebElement date_dropDown;
	@FindBy(xpath="//div[@class='su-select' and @name='time']//i")private WebElement time_dropDown;
	@FindBy(xpath="//span[text()='Cancel']")private WebElement cancel_button;

	public Order_zerodha_page()
		{
			PageFactory.initElements(driver, this);
		}
		
		public void orderIcon() throws Exception
		{
			Thread.sleep(2000);
			orderIcon.click();
			Thread.sleep(3000);
			OrderBttn.click();
			Thread.sleep(3000);
			getStarted.click();
			Thread.sleep(2000);
			search_button.sendKeys(ReadExcelFile.readExcelFile(3,0));
			Actions a= new Actions(driver);
			for(int i=0;i<=2;i++)
			{
				a.sendKeys(Keys.ARROW_DOWN).build().perform();
			}
	a.sendKeys(Keys.ENTER).build().perform();
	a.click(createGTT).build().perform();
	a.click(triggerPrice).sendKeys(ReadExcelFile.readExcelFile(3,1)).build().perform();
	a.click(Qty).sendKeys(ReadExcelFile.readExcelFile(3,2)).build().perform();
	a.click(price).sendKeys(ReadExcelFile.readExcelFile(3,3)).build().perform();
	a.click(cancelButton).build().perform();
	}
		
	public void GTT_icon() throws Exception
	{

	orderIcon.click();
	GTT_icon.click();
	getStarted.click();
	search_button.sendKeys(ReadExcelFile.readExcelFile(1,0));
	Actions a1= new Actions(driver);
	for(int i=0;i<=1;i++)
	{
				a1.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
	a1.sendKeys(Keys.ENTER).build().perform();

	a1.moveToElement(createGTT).click().build().perform();
	a1.moveToElement(triggerPrice).sendKeys(ReadExcelFile.readExcelFile(1,1)).build().perform();
	a1.moveToElement(Qty).sendKeys(ReadExcelFile.readExcelFile(1,2)).build().perform();
	a1.moveToElement(price).sendKeys(ReadExcelFile.readExcelFile(1,3)).build().perform();
	a1.moveToElement(cancelButton).click().build().perform();
	}
	public void BasketIcon() throws Exception
	{
	order_buttn.click();
	BasketIcon.click();
	NewBasketBttn.click();
	basketName.sendKeys("infy");
	createBttn.click();
	}
		
	public void SIP() throws Exception
	{
	orderIcon.click();
	SIP.click();
	CreateSIP.click();
	label.sendKeys(ReadExcelFile.readExcelFile(7,0));
	checkBox.click();

	Actions a= new Actions(driver);
	a.moveToElement(date_dropDown).click().build().perform();

	for(int i=0;i<=15;i++)
	{
		date_dropDown.sendKeys(Keys.ARROW_DOWN);
	}
	date_dropDown.sendKeys(Keys.ENTER);
	a.moveToElement(time_dropDown).click().build().perform();

	for(int i=0;i<=11;i++)
	{
		time_dropDown.sendKeys(Keys.ARROW_DOWN);
	}
	time_dropDown.sendKeys(Keys.ENTER);
		
	cancel_button.click();	
		
		
		
		
		
	}


	
	}
	
	
	
	
	
	
	
	
	
	
	



