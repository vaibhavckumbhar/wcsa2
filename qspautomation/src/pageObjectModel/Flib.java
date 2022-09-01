
package pageObjectModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib 
{
	public String readExcelData(String excelpath, String sheetname, int rowCount, int cellCount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowCount);
		Cell cell = row.getCell(cellCount);
		String data = cell.getStringCellValue();
		return data;

	}

	public int rowCount(String excelpath, String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		int lr = sh.getLastRowNum();
		return lr;
	}

	public void writeExcelData(String excelpath, String sheetname, int rowCount, int cellCount, String data ) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetname);
		Row row = sh.getRow(rowCount);
		Cell cell = row.createCell(cellCount);
		cell.setCellValue(data);

		FileOutputStream fos = new FileOutputStream(excelpath);
		wb.write(fos);

	}

	//read data property file
	public String readpropertyFileData(String Excelpath,String key) throws IOException

	{
		FileInputStream fis = new FileInputStream(Excelpath);
		Properties prop = new Properties();
		prop.load(fis);
		String value=prop.getProperty(key);
		return value;


	}


}



