package PracticeDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeFileReading {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\Book2.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int totalRows = sheet.getLastRowNum();
		int totalCols = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total number of rows :"+totalRows);
		System.out.println("Total number of cols :"+totalCols);
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow row = sheet.getRow(r);
			
			for(int c=0; c<totalCols; c++)
			{
				XSSFCell cell = sheet.getRow(r).getCell(c);
				System.out.print(cell.toString()+"     ");
			}
			System.out.println();
		}
		
		
		wb.close();
		file.close();
	}
}
