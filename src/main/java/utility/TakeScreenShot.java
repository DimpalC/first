package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {



public static void TakeScreenShotFailedTC(WebDriver driver, String  methodName) throws Exception {
	
	 File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\Ganesh P\\eclipse-workspace\\frame30April\\src\\main\\java\\TakeScreenShot/" +methodName+ ".jpg");
		FileHandler.copy(source, dest);
}


}

