package PracticeDataDrivenTesting;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PracticeFileWrite {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fo = new FileOutputStream(System.getProperty("user.dir")+"\\testdata\\mybook1.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Mydata");
		
		XSSFRow row0 = sheet.createRow(0);
		row0.createCell(0).setCellValue("Chimmi");
		row0.createCell(1).setCellValue("UKG");
		row0.createCell(2).setCellValue("Dece");
		
		
		XSSFRow row1 = sheet.createRow(1);
		row1.createCell(0).setCellValue("Shreyas");
		row1.createCell(1).setCellValue("LKG");
		row1.createCell(2).setCellValue("March");
		
		XSSFRow row2 = sheet.createRow(2);
		row2.createCell(0).setCellValue("Pitu");
		row2.createCell(1).setCellValue("8");
		row2.createCell(2).setCellValue("April");
		
		XSSFRow row3 = sheet.createRow(3);
		row3.createCell(0).setCellValue("Pattu");
		row3.createCell(1).setCellValue("7");
		row3.createCell(2).setCellValue("August");
		
		wb.write(fo);
		wb.close();
		fo.close();
		
		System.out.println("File created");
	}
}
