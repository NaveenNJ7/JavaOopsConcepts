package PracticeDataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DynamicWritting {

	
	public static void main(String[] args) throws IOException
	{
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\dynamic.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Data");
		
		System.out.println("Enter number of totalRows");
		Scanner sc = new Scanner(System.in);
		int totalRows = sc.nextInt();
		System.out.println("Enter number of totalCells");
		int totalCells = sc.nextInt();
		
		for(int r=0; r<=totalRows; r++)
		{
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0; c<totalCells; c++)
			{
				XSSFCell cell = row.createCell(c);
				cell.setCellValue(sc.next());
			}
		}
		 
		wb.write(file);
		wb.close();
		file.close();
		System.out.println("File Created");
		
		
		
		
		
	}
}
