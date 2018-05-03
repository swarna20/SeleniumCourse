package readFromFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel {

	@Test
	public Object[][] read(String File) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook("./data/"+File+".xlsx");

		XSSFSheet sheetAt = workbook.getSheetAt(0);

		int lastRowNum = sheetAt.getLastRowNum();
		int lastCellNum = sheetAt.getRow(0).getLastCellNum();
		Object[][] data = new Object[lastRowNum][lastCellNum];

		for (int i = 1; i <= lastRowNum; i++) {
			XSSFRow row = sheetAt.getRow(i);
			System.out.println("Row " + i + " values are:");
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String cellval = cell.getStringCellValue();
				System.out.println(cellval);
				data[i-1][j]=cellval;
			}
		}

		workbook.close();
		return data;

	}

}
