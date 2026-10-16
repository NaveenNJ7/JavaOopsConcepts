package DataDrivern;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.sun.rowset.internal.Row;

public class WrittingData {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Testdata\\Myfile.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet =workbook.createSheet("Cricket");
		
		XSSFRow row1 =sheet.createRow(0);
		row1.createCell(0).setCellValue("Teams");
		row1.createCell(1).setCellValue("Captain");
		row1.createCell(2).setCellValue("Rank");
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("India");
		row2.createCell(1).setCellValue("Shubhman Gill");
		row2.createCell(2).setCellValue(1);
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Australia");
		row3.createCell(1).setCellValue("Pat Cummin");
		row3.createCell(2).setCellValue(2);
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("South africa");
		row4.createCell(1).setCellValue("Temba");
		row4.createCell(2).setCellValue(3);
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("File created");
		
		
		
		
		
		
		
		
		
		
	}
}
