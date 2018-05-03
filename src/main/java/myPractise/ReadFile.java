package myPractise;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadFile {
	@Test
	public Object[][] read() throws IOException{
		
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/"+"CreateLead"+".xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		int lastRowNum = sheet.getLastRowNum();
		Object data[][]=new Object[lastRowNum][lastCellNum];
		
		for(int i=1; i<=lastRowNum; i++){
			
			for(int j=0; j<lastRowNum; j++){
				XSSFCell cell = sheet.getRow(i).getCell(j);
				data[i-1][j]=cell.getStringCellValue();
			}
		}
		
		wbook.close();
		return data;

		
	}

	
}
