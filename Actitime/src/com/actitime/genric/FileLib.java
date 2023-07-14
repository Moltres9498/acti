package com.actitime.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getpropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./data/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;	
	}
	public String getexceldata(String SheetName, int row, int cell) throws IOException {
		FileInputStream fis=new FileInputStream("./data/Testscript.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		String data = wb.getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
		return data;	
	}
}