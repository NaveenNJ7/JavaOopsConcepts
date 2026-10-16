package DataDrivern;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingEmployee {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book0.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
	    
		XSSFSheet sheet =  workbook.getSheet("Employee");
		
		int totalRows = sheet.getLastRowNum();
		
		// we can send any index number based on required total number of cells present in particular row.
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total number of rows :"+totalRows);
		System.out.println("Total number of cells :"+totalCells);
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow row =  sheet.getRow(r);
			
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell =  row.getCell(c);
				System.out.print(cell.toString()+"  ");
			}
			System.out.println();
		}
		
		workbook.close();
		file.close();
		
		
		
	}
}
