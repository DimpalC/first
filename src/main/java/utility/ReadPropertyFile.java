package utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
	public static String readPropertyFile(String value) throws Exception
	{
		Properties prop= new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\Ganesh P\\eclipse-workspace\\frame30April\\src\\TestData\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}	
	
}
