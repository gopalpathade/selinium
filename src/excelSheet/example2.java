package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example2 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("F:\\SHUBHAM  PATIL\\New Microsoft Excel Worksheet.xlsx");
	Workbook book = WorkbookFactory.create(file);
	Sheet sh = book.getSheet("Sheet1");
	Row ro = sh.getRow(0);
	Cell ce = ro.getCell(1);
//String value;
	//double value = ce.getNumericCellValue();
	//String value = ce.getStringCellValue();
	//System.out.println(value);
	
	String value = book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
}
}
