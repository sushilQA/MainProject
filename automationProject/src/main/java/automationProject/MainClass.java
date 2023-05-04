package automationProject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.read.biff.BiffException;

public class MainClass {

	public static void main(String[] args) throws IOException, BiffException, InterruptedException {

		FacebookSignUp facebookSignUp = new FacebookSignUp();
		facebookSignUp.browserDriver();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Scanner sc = new Scanner(System.in);
		XLSX_ExcelClass file = new XLSX_ExcelClass();
		System.out.println("Please enter the Range");
		int start, end;
		start = sc.nextInt();
		end = sc.nextInt();
		file.readDataInRangeInXlsxFile(start, end);
		sc.close();*/
		/*
		 * FileClass f = new FileClass(); Scanner sc = new Scanner(System.in);
		 */
		/*
		 * System.out.println("Please enter the Range"); int start,end; start =
		 * sc.nextInt(); end = sc.nextInt();
		 */
		/*
		 * System.out.println("Please enter the Row Number"); int rowNumber; rowNumber =
		 * sc.nextInt(); f.readDataFromParticularRow(rowNumber);
		 */
		/*
		 * System.out.
		 * println("Please enter the index of file from where you want to write"); int
		 * index,numberOfRows; String string; index = sc.nextInt();
		 * System.out.println("Please enter the number of rows which you want to write"
		 * ); numberOfRows = sc.nextInt();
		 * System.out.println("Please enter the data which you want to write"); string =
		 * sc.next(); f.writeDataTillRowCountWithIndex(index,numberOfRows,string);
		 */
		/*
		 * String sheetNameForRead = "Sheet2"; String sheetNameForWrite = "Sheet3";
		 * XLSX_ExcelClass x = new XLSX_ExcelClass();
		 * x.xlsxFileWrite(sheetNameForWrite); x.xlsxFileRead(sheetNameForWrite);
		 */
		// file.readAFile();
	}

}
