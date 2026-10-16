package Day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileReading {

	public static void main(String[] args)throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\mybook.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheet("Created data");
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(0).getLastCellNum();
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow row= sheet.getRow(r);
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell = row.getCell(c);
				String data = cell.toString();
				System.out.print(data+" ");
			}
			System.out.println();
		}
		wb.close();
		file.close();
	}
}
