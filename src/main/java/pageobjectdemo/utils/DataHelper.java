package pageobjectdemo.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHelper {
	
	public void readAllDataFromExcel(String sheetName) throws Exception {
		
				String fileLocation = "/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/main/java/pageobjectdemo/demowebshop.xlsx";
				// Establish the IO stream and set the file path
				FileInputStream  fis = new FileInputStream(fileLocation);
				// Open the workbook or set up the workbook object 
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				// workbook object getSheet() from the workbook
				XSSFSheet sheet = workbook.getSheet(sheetName);
				Iterator<Row> rows = sheet.iterator();
				// Outer loop for iterating over rows
				while(rows.hasNext()) {
					Row row = rows.next();
					Iterator<Cell> cells = row.iterator();
					// Inner loop for iterating over cells
						while(cells.hasNext()) {
								Cell cellValue = cells.next();
								String cellData = cellValue.getStringCellValue();
								System.out.print(cellData+ "  ");
						}
						System.out.println(" ");
				}		
				
	}
	
	List<String> userInfo = new ArrayList<>();
	
	public List<String> readRowSpecificDataFromExcel(String sheetName, int rowNo) throws IOException {
		
		String fileLocation = "/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/main/java/pageobjectdemo/demowebshop.xlsx";
		// Establish the IO stream and set the file path
		FileInputStream  fis = new FileInputStream(fileLocation);
		// Open the workbook or set up the workbook object 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// workbook object getSheet() from the workbook
		XSSFSheet sheet = workbook.getSheet(sheetName);
		//On a particular Row no
		XSSFRow row = sheet.getRow(rowNo);
			Iterator<Cell> cells = row.iterator();
			// Inner loop for iterating over cells
				while(cells.hasNext()) {
						Cell cellValue = cells.next();
						String cellData = cellValue.getStringCellValue();
						System.out.print(cellData+ "  ");
						userInfo.add(cellData);// From 0th index it will add the data, then 1, 2..
				}
			return userInfo;
		}		

}
