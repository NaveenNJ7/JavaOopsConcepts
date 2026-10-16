package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	// declare all the required classes
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;
	
    // create method for total number of rows
    public static int getRowCount(String xlfile, String xlsheet) throws IOException
    {
    	fi = new FileInputStream(xlfile);
    	wb = new XSSFWorkbook(fi);
    	ws = wb.getSheet(xlsheet);
    	int rowcount = ws.getLastRowNum();
    	
    	wb.close();
    	fi.close();
    	return rowcount;	
    }
    
    // create method for total number of cells
    public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException
    {
    	fi = new FileInputStream(xlfile);
    	wb = new XSSFWorkbook(fi);
    	ws = wb.getSheet(xlsheet);
    	row = ws.getRow(rownum);
    	int cellcount = row.getLastCellNum();
    	
    	wb.close();
    	fi.close();
    	return cellcount;
    }
    
    // get cell data
    public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
    	fi = new FileInputStream(xlfile);
    	wb = new XSSFWorkbook(fi);
    	ws = wb.getSheet(xlsheet);
    	row = ws.getRow(rownum);
    	cell = row.getCell(colnum);
    	
    	String data;
    	/*
    	 some time cell may not have any value inside, it may be empty,
    	 while reading the data, if data not find means, it will throw exception
    	 data not found exception, so that is the reason put try and catch block.
    	 */
    	
    	try 
    	{
    	    //data =cell.toString();
    		//returns the formatted value of a cell as a String regardless of the cell type
    		// this is additional provided by Apache poi
    		DataFormatter formatter = new DataFormatter();
    		data = formatter.formatCellValue(cell);
    	}
    	catch(Exception e)
    	{
    		/*
    		 we call it as null(cell dont have data), not a empty
    	     if cell have data, data will be captured and return the data
    	     if does not data, it will throw exception, it will handle by catch block, 
    	     catch block will make data value to be empty.
    		 */
    		data = "";
    	}
    	
    	wb.close();
    	fi.close();
    	return data;
    	
    }
    
	// set cell data
    public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException
    {
    	// we are reading the data and writing the data
    	fi = new FileInputStream(xlfile);
    	wb = new XSSFWorkbook(fi);
    	ws = wb.getSheet(xlsheet);
    	row = ws.getRow(rownum);
    	
    	// writing the data into same xl sheet
    	cell = row.createCell(colnum);
    	cell.setCellValue(data);
    	// uploading the data 
    	fo = new FileOutputStream(xlfile);
    	wb.write(fo);
    	wb.close();
    	fi.close();
    	fo.close();
    }
    
    public static void fillGreenColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
    	fi = new FileInputStream(xlfile);
    	wb = new XSSFWorkbook(fi);
    	ws = wb.getSheet(xlsheet);
    	row = ws.getRow(rownum);
    	cell = row.getCell(colnum);
    	
    	style = wb.createCellStyle();
    	
    	style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	
    	cell.setCellStyle(style);
    	fo = new FileOutputStream(xlfile);
    	wb.write(fo);
    	wb.close();
    	fi.close();
    	fo.close();
    }
	
    public static void fillRedColor(String xlfile, String xlsheet, int rownum, int colnum) throws IOException
    {
    	fi = new FileInputStream(xlfile);
    	wb = new XSSFWorkbook(fi);
    	ws = wb.getSheet(xlsheet);
    	row = ws.getRow(rownum);
    	cell = row.getCell(colnum);
    	
    	style = wb.createCellStyle();
    	
    	style.setFillForegroundColor(IndexedColors.RED.getIndex());
    	style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    	
    	cell.setCellStyle(style);
    	fo = new FileOutputStream(xlfile);
    	wb.write(fo);
    	wb.close();
    	fi.close();
    	fo.close();
    }
    
}
