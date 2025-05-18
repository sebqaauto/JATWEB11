package streams;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {
	
	public void readFromExcel(String sheetName) throws IOException {
		
		// Establish the IO stream and set the file path
		FileInputStream  fis = new FileInputStream("/Users/sebastianselvarajaugustine/eclipse-workspace/JavaTest/src/main/java/streams/UNIVERSITY.xlsx");
		
		// Open the workbook or set up the workbook object 
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		// workbook object getSheet() from the workbook
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		// How many rows are in the Excel
		int lastRow = sheet.getLastRowNum();
		for(int i = 0; i<=lastRow; i++) {
			XSSFRow row = sheet.getRow(i);
			// In each row now many columns 
			int lastColumn = row.getLastCellNum();
			for(int j=0; j<lastColumn;j++) {
				XSSFCell cell = row.getCell(j);
				String result = cell.getStringCellValue();
				System.out.print(result+ "  ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		ReadFromExcel read = new ReadFromExcel();
		try {
			read.readFromExcel("StudentInfo");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
