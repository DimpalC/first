package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile {
	public static String readExcelFile(int row, int col) throws Exception
	{
		
		FileInputStream file= new FileInputStream("C:\\Users\\Ganesh P\\eclipse-workspace\\frame30April\\src\\TestData\\zerodha_dashboard.xlsx");
		Sheet excelSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
		 String value = excelSheet.getRow(row).getCell(col).getStringCellValue();
		return value;
		 
	}
}
