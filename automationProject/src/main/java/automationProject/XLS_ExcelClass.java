package automationProject;

import java.io.File;
import java.io.IOException;
import com.google.common.collect.Table.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class XLS_ExcelClass {

	public void xlsFileRead() throws BiffException, IOException {

		File f = new File("../automationProject/xlsExcel.xls");
		Workbook workbook = Workbook.getWorkbook(f);
		Sheet sheet = workbook.getSheet(0);
		int rows = sheet.getRows();
		int colulmns = sheet.getColumns();
		for(int i =0 ; i<rows;i++)
		{
			for(int j=0;j<colulmns;j++)
			{
			//Cell cell = sheet.getCell(j, i);
			}
		}
		
	}
}