package excelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example5 {
	public static void main(String[]args) throws EncryptedDocumentException, IOException{
		FileInputStream file=new FileInputStream("F:\\\\SHUBHAM  PATIL\\\\New Microsoft Excel Worksheet.xlsx");
		Workbook book = WorkbookFactory.create(file);
	//	CellType celltype = book.getSheet("Sheet2").getRow(0).getCell(0).getCellType();
	//	System.out.println(celltype);
		int cellnum = book.getSheet("Sheet2").getRow(0).getLastCellNum()-1;
		for(int i=0;i<=cellnum;i++) {
			System.out.print(i+"");
			
		}
		
	}

}
