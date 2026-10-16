package DataDrivern;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingHotel {

	public static void main(String[] args) throws IOException {
		
	
	FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book0.xlsx");
	
	XSSFWorkbook workbook = new XSSFWorkbook(file);
	
	XSSFSheet sheet = workbook.getSheet("Menu");
	
	int totalRows = sheet.getLastRowNum();
	
	int totalCells = sheet.getRow(0).getLastCellNum();
	
	System.out.println("Total number of rows :"+totalRows);
	System.out.println("Total number of cells :"+totalCells);
	
	System.out.println("-------------------------------");
	
	for(int r=0; r<=totalRows; r++)
	{
		XSSFRow currentRow = sheet.getRow(r);
		
		for(int c=0; c<totalCells; c++)
		{
			//currentRow, accessing cell values from particular row
			XSSFCell cell =currentRow.getCell(c);
			System.out.print(cell.toString()+"   ");
		}
		System.out.println(" ");
	}
	workbook.close();
	file.close();
	
	/*
	 toString(), it will give int values in string format along with decimal point
	 200 - 200.0
	 150 - 150.0
	 
	 */
	
	
	
	
	
	}
}
