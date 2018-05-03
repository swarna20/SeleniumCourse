package readFromFile;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFInSpecificFormat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wbook = new XSSFWorkbook("./data/Table.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		short lastCellNum = sheet.getRow(0).getLastCellNum();
		int lastRowNum = sheet.getLastRowNum();
		int i=0, k=0;
		
		    for(int j=0; j<=lastCellNum-1; j++) {
			    System.out.println(sheet.getRow(i).getCell(j));
			    k=j;
		    }
		    for(i=1;i<=3; i++) {
			    System.out.println(sheet.getRow(i).getCell(k));

		    }
		   
		

	}

}
