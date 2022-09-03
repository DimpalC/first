package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import utility.ReadPropertyFile;

public class Test_Base_logo {
	public static WebDriver driver;
	
	public void initalization() throws Exception
	{
		  WebDriverManager.chromedriver().setup();
		      driver= new ChromeDriver();
		
			 driver.get(ReadPropertyFile.readPropertyFile("url"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	
	
	
	
	
	
	
}

