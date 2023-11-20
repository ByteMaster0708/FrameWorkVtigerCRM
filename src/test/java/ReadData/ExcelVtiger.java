package ReadData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelVtiger {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("src\\test\\resources\\DataExcel.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
		
		Sheet sht = wb.getSheet("Sheet1");
		Row rw = sht.getRow(4);
		Cell cll = rw.getCell(1);
		String data = cll.getStringCellValue();	
		System.out.println(data);
		
	}

}
