package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutility {
	String path;
	public excelutility(String path)
	{
		this.path=path;
	}
	public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
	 
	{
	 
		File xlfile=new File(path);
	 
		if(!xlfile.exists())    // If file not exists then create new file
	 
		{
	 
			XSSFWorkbook workbook=new XSSFWorkbook();
	 
		FileOutputStream fo=new FileOutputStream(path);
	 
		workbook.write(fo);
	 
		}
	 
		FileInputStream fi=new FileInputStream(path);
	 
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
	 
		if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
	 
			workbook.createSheet(sheetName);
	 
		XSSFSheet sheet=workbook.getSheet(sheetName);
	 
		if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
	 
				sheet.createRow(rownum);
	 
		XSSFRow row=sheet.getRow(rownum);
	 
		XSSFCell cell=row.createCell(colnum);
	 
		cell.setCellValue(data);
	 
		FileOutputStream fo=new FileOutputStream(path);
	 
		workbook.write(fo);		
	 
		workbook.close();
	 
		fi.close();
	 
		fo.close();
	 
	}
}
