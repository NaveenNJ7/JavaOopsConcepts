package PracticeDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MybookFileReading {

	public static void main(String[] args) throws IOException {
		
		// getProperty(user.dir) returns current location of the project and in that test data folder and file 
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\mybook.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Created data");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total number of rows :"+totalRows);
		System.out.println("Total number of cell :"+totalCells);
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell = row.getCell(c);
				System.out.print(cell.toString()+"  ");
			}
			System.out.println("");
		}
		
		workbook.close();
		file.close();
		
	}
}
