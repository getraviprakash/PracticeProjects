package readWriteFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/* This program required use of below files:
 * commons-collections4-4.2
 * ooxml-schemas-1.3
 * poi-3.17
 * poi-ooxml-3.17
 * xmlbeans
 */

public class ReadWriteExcel {

public static void main (String [] args) throws IOException{
	
	FileInputStream fis = new FileInputStream("D:\\Ravi Agrawal\\Practice\\Test.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sheet = wb.getSheetAt(0);
    //I have added test data in the cell A1 as "SoftwareTestingMaterial.com"
    //Cell A1 = row 0 and column 0. It reads first row as 0 and Column A as 0.
	XSSFRow row1 = sheet.getRow(0);
	XSSFCell cell1 = row1.getCell(0);
	//System.out.println(cell1);
	//System.out.println(sheet.getRow(0).getCell(0));
	String textRead = cell1.getStringCellValue();
	System.out.println(textRead);
	//String cellval = cell.getStringCellValue();
	//System.out.println(cellval);
	
	XSSFRow row2 = sheet.createRow(1);
	XSSFCell cell2 = row2.createCell(0);
	String textToWrite = "I'm Ravi and learning Java.";
	//cell2.setCellType(cell2.CELL_TYPE_STRING);
	cell2.setCellValue(textToWrite);
	FileOutputStream fos = new FileOutputStream("D:\\Ravi Agrawal\\Practice\\Test.xlsx");
	wb.write(fos);
	fos.close();
	System.out.println("END OF WRITING DATA IN EXCEL");
	
	}
} 