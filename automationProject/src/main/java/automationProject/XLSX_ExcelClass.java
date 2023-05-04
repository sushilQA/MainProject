package automationProject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLSX_ExcelClass {

	public void xlsxFileRead(String sheetName) throws BiffException, IOException {

		File f = new File("../automationProject/Book1.xlsx");
		FileInputStream fi = new FileInputStream(f);
		XSSFWorkbook xssWork = new XSSFWorkbook(fi);
		XSSFSheet xssSheet = xssWork.getSheet(sheetName);
		int rows = xssSheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			XSSFRow xssRow = xssSheet.getRow(i);
			int cells = xssRow.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				XSSFCell xssCell = xssRow.getCell(j);
				System.out.println(xssCell.getStringCellValue());
			}

		}
	}
	// range passed from main method
	public void readDataInRangeInXlsxFile(int start, int end) throws IOException {
		File file = new File("../automationProject/Book1.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet3");
		int rows = xssfSheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			if (i >= start-1 & i <= end-1) {
				XSSFRow xssfRow = xssfSheet.getRow(i);
				int cells = xssfRow.getPhysicalNumberOfCells();
				for (int j = 0; j <cells; j++) {
					XSSFCell xssfCells = xssfRow.getCell(j);
					System.out.println(xssfCells.getStringCellValue());
				}
			}
		}

	}

	// row no passed from main method
	public void readParticularRowInXlsxFile(int rowNumber) throws IOException {
		File file = new File("../automationProject/Book1.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);
		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet xssfSheet = xssfWorkbook.getSheet("Sheet3");
		int rows = xssfSheet.getPhysicalNumberOfRows();
		for (int i = 0; i <= rows; i++) {
			if (i == rowNumber - 1) {
				XSSFRow xssfRow = xssfSheet.getRow(i);
				int cells = xssfRow.getPhysicalNumberOfCells();
				for (int j = 0; j < cells; j++) {
					XSSFCell xssfCells = xssfRow.getCell(j);
					System.out.println(xssfCells.getStringCellValue());
				}
			}
		}

	}

	public void xlsxFileWrite(String sheetName) throws BiffException, IOException {

		File f = new File("../automationProject/Book1.xlsx");
		FileOutputStream fo = new FileOutputStream(f);
		XSSFWorkbook xssWork = new XSSFWorkbook();
		XSSFSheet sheet = xssWork.createSheet(sheetName); // passing the sheet name "sheet2" from Main class
		for (int i = 0; i < 5; i++) {
			XSSFRow row = sheet.createRow(i);
			for (int j = 0; j < 5; j++) {
				XSSFCell cells = row.createCell(j);
				cells.setCellValue("NEW DATA");
			}

		}
		xssWork.write(fo);
		fo.flush();
		fo.close();

	}

	public void copyAndPasteXlsxFileWrite() throws BiffException, IOException {

		File sourceFile = new File("../automationProject/Book1.xlsx");
		FileInputStream fi = new FileInputStream(sourceFile);
		File destinationFile = new File("../automationProject/Book2.xlsx");
		FileOutputStream fo = new FileOutputStream(destinationFile);
		XSSFWorkbook xssWork = new XSSFWorkbook(fi);
		XSSFSheet xssSheet = xssWork.getSheet("Sheet3");
		XSSFSheet sheet = xssWork.createSheet("Sheet1");
		int rows = xssSheet.getPhysicalNumberOfRows();

		for (int i = 0; i < rows; i++) {
			XSSFRow xssRows = xssSheet.getRow(i);
			XSSFRow rowsToCopy = sheet.createRow(i);
			int cells = xssRows.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				XSSFCell xssCell = xssRows.getCell(j);
				XSSFCell cellsForWrite = rowsToCopy.createCell(j);
				cellsForWrite.setCellValue(xssCell.getStringCellValue());
			}
		}
		xssWork.write(fo);
		fo.flush();
		fo.close();
		System.out.println("The XLSX file has been copied !");

	}
}