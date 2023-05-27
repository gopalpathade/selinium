package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream file= new FileInputStream("C:\\Users\\samarth\\Desktop\\micrsoftxl.xls");
	Thread.sleep(2000);
	
	Workbook book=WorkbookFactory.create(file);
org.apache.poi.ss.usermodel.Sheet	sh=book.getSheet("Sheet1");
Row row=sh.getRow(0);
Cell c=row.getCell(0);
String value=c.getStringCellValue();
System.out.println(value);

     
	
	
}




}
