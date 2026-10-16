package PracticeDataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeFileWritting {

	
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\mybook.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet =  wb.createSheet("Created data");
		
		XSSFRow row0 =  sheet.createRow(0);
		row0.createCell(0).setCellValue("A");
		row0.createCell(1).setCellValue("1");
		row0.createCell(2).setCellValue("a");
		
		XSSFRow row1 =  sheet.createRow(1);
		row1.createCell(0).setCellValue("B");
		row1.createCell(1).setCellValue("2");
		row1.createCell(2).setCellValue("b");
		
		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("C");
		row2.createCell(1).setCellValue("3");
		row2.createCell(2).setCellValue("c");
		
		wb.write(fo);
		wb.close();
		fo.close();
		
		System.out.println("File created");
		
		
	}
}
