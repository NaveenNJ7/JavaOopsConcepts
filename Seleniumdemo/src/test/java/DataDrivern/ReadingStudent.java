package DataDrivern;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingStudent {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Student.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Details");
		
		int totalRows =sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total number of rows :"+totalRows);
		System.out.println("Total number of cell :"+totalCells);
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow row =sheet.getRow(r);
			
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell =row.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println(" ");
		}
		
		workbook.close();
		file.close();
	}
}
