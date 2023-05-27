package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example3 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream file= new FileInputStream("F:\\\\SHUBHAM  PATIL\\\\New Microsoft Excel Worksheet.xlsx ");
	Workbook book = WorkbookFactory.create(file);
	int rowsize = book.getSheet("Sheet2").getLastRowNum()+1;
	System.out.println(rowsize);
	short cellsize = book.getSheet("Sheet2").getRow(0).getLastCellNum();
	System.out.println(cellsize);
}

}
