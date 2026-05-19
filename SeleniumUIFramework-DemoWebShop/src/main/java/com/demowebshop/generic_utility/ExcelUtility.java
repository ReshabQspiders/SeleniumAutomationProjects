package com.demowebshop.generic_utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public final String filePath="./src/test/resources/registerTestData.xlsx";
	public String fetchDataFromSingleCellInExcelFile(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		String value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		wb.close();
		fis.close();
		return value;	
	}
	
	public Object[][] getExcelDataByDataProvider(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream(filePath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		int rows = sh.getLastRowNum();
		int cols = sh.getRow(0).getLastCellNum();
		Object[][] data=new Object[rows][cols];
		for (int i = 1; i < rows; i++) {
			Row row = sh.getRow(i);
			for (int j = 0; j < cols; j++) {
				Cell cell = row.getCell(j);
				data[i-1][j]=cell.toString();
			}	
		}
		wb.close();
		fis.close();
		return data;
	}	

}
