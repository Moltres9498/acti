package actitime;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo {

	

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
			Workbook wb = WorkbookFactory.create(new FileInputStream("./data/input.xlsx"));
			wb.getSheet("sheet1").createRow(2).createCell(0).setCellValue("Vidya");
		wb.write(new FileOutputStream("./data/input.xlsx"));
			
	}

}
