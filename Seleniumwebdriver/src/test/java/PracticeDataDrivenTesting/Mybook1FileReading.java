package PracticeDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mybook1FileReading {

	public static void main(String[] args) throws IOException
	{
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\mybook1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Mydata");
		int totalRows =sheet.getLastRowNum();
		int totalCells =sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total rows :"+totalRows);
		System.out.println("Total cells :"+totalCells);
		
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
		
		wb.close();
		file.close();
		
		
		
		
		
		
		
		
		
	}
}
