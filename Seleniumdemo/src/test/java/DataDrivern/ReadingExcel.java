package DataDrivern;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\Testdata\\Book0.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("Language");
		
		int totalRows = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		// according to Excel index start from
		System.out.println("Total number of rows :"+totalRows); // 5, index start from=0(total rows are 6)
		System.out.println("Total number of cells :"+totalCells); //3, index start form=1(cell are 3)
		
		System.out.println("-------------------------");
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0; c<totalCells;  c++)
			{
				XSSFCell currentcell = currentRow.getCell(c);
				System.out.print(currentcell.toString()+"     ");
				
			}
			System.out.println();
		}
		workbook.close();
		file.close();
		
		
	}
}
