package Frameword_practice.test;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class TC003 {

	@Test
	public void excelData() throws IOException
	{
		String path = "C:\\Users\\chinn\\OneDrive\\Documents\\Test.xlsx";
		XSSFWorkbook xssfbook = new XSSFWorkbook(path);
		XSSFSheet sheet = xssfbook.getSheet("Sheet1");
		String name = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
	}
	
	
}
