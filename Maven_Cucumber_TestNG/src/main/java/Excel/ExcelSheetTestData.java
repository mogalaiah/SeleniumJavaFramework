package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelSheetTestData {
	static String filepath;
	static FileInputStream file;
	static HSSFWorkbook workbook;
	static HSSFSheet sheet;;

	public static void getRowCount() throws IOException {
	try {
			filepath = System.getProperty("user.dir");
			file= new FileInputStream(filepath+"/TestData/TestData.xlsx");
			workbook = new HSSFWorkbook(file);
			sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of row count is: "+rowcount);
		}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
	}
	
	public static void getCellData() throws IOException {
		try {
		filepath = System.getProperty("user.dir");
		file= new FileInputStream(filepath+"/TestData/TestData.xlsx");
		workbook = new HSSFWorkbook(file);
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Cell Data is: "+cellData);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
