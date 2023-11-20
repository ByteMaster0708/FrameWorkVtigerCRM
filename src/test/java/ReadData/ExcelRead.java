package ReadData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

public class ExcelRead {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
	//To read data from External resource	
	FileInputStream fl = new FileInputStream("src\\test\\resources\\DataExcel.xlsx");
	
	//To read data from excel
	Workbook wb = WorkbookFactory.create(fl);
	
	//To get the control of the sheet
	Sheet sheetname = wb.getSheet("Sheet1");
	
	//To get the control of the Row
	Row row = sheetname.getRow(0);
	
	//To get the control of the Cell
	Cell cell = row.getCell(1);
	
	//To get the value of the cell
	String Data = cell.getStringCellValue();
	
	System.out.println(Data);
	
	
	//To get the control of the Row
		Row row1 = sheetname.getRow(1);
		
		//To get the control of the Cell
		Cell cell1 = row1.getCell(1);
		
		//To get the value of the cell
		String Data1 = cell1.getStringCellValue();
		
		System.out.println(Data1);
	
	
	
	
	
	

	}

}
